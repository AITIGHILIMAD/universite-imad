package fr.imad.universite.matiere.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.imad.universite.enseignant.domaine.Enseignant;
import fr.imad.universite.matiere.business.IMatiereBusiness;
import fr.imad.universite.matiere.controller.IMatiereController;
import fr.imad.universite.matiere.domaine.Matiere;

@Controller
public class MatiereControllerImpl implements IMatiereController {
	@Autowired
	private IMatiereBusiness imatierebusiness;

	@Override
	@RequestMapping("/matiere")
	public String getMatiere(Model model) {
		List<Matiere> m = imatierebusiness.getMatiere();
		model.addAttribute("M", m);
		return "html/matiere";
	}

	@Override
	@RequestMapping("/fmatiere")
	public String fmatiere(Model model, @RequestParam Integer id) {
		Matiere matiere = imatierebusiness.fmatiere(id);
		model.addAttribute("detm", matiere);
		return "html/detailmatiere";
	}

	@Override
	@RequestMapping("/ajout_formulaire")
	public String ajout_formulaire(Model model) {
		Matiere m = new Matiere();
		List<Enseignant> enseignants = imatierebusiness.findallenseignant();
		model.addAttribute("enseignants", enseignants);
		model.addAttribute("m", m);
		return "html/ajoutform";
	}

	@Override
	@PostMapping("/ajoutmat")
	public String ajoutmatiere(Model model, @ModelAttribute Matiere matiere, @RequestParam Integer idenseignant) {
		Enseignant enseignant = imatierebusiness.findenseignantbyid(idenseignant);
		matiere.setEnseignant(enseignant);
		imatierebusiness.ajoutmatiere(matiere);
		return "redirect:/matiere";
	}

	@Override
	@RequestMapping("/supmatiere")
	public String supmatiere(Model model, Integer id) {
		imatierebusiness.supmatiere(id);
		return "redirect:/matiere";
	}

	@Override
	@RequestMapping("/form_matiere")
	public String ajformulaire(Model model, @RequestParam Integer id) {
		Matiere m = imatierebusiness.fmatiere(id);
		List<Enseignant> enseignants = imatierebusiness.findallenseignant();
		model.addAttribute("enseignants", enseignants);
		model.addAttribute("m", m);
		return "html/form_matiere";
	}

	@Override
	@PostMapping("/modmatiere")
	public String modmatiere(Model model, @ModelAttribute Matiere matiere, @RequestParam Integer idenseignant) {
		Enseignant enseignant = imatierebusiness.findenseignantbyid(idenseignant);
		matiere.setEnseignant(enseignant);
		imatierebusiness.modmatiere(matiere);
		return "redirect:/matiere";
	}

}
