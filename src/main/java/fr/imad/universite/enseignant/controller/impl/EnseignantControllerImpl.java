package fr.imad.universite.enseignant.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.imad.universite.enseignant.business.IEnseignantBusiness;
import fr.imad.universite.enseignant.controller.IEnseignantController;
import fr.imad.universite.enseignant.domaine.Enseignant;

@Controller
public class EnseignantControllerImpl implements IEnseignantController {
	@Autowired
	private IEnseignantBusiness ienseignantbusiness;

	private final static String REDIRECT_ENSEIGNANTS = "redirect:/enseignants";

	@Override
	@RequestMapping("/enseignants")
	public String getEnseignants(Model model) {
		List<Enseignant> enseignant = ienseignantbusiness.getEnseignant();

		model.addAttribute("egn", enseignant);
		return "html/enseignant";
	}

	@Override
	@RequestMapping("/fenseignant")
	public String findEnsiegnant(Model model, @RequestParam Integer id) {
		Enseignant fenseignant = ienseignantbusiness.findEnseigant(id);
		model.addAttribute("fegn", fenseignant);
		return "html/fenseignant";
	}

	@Override
	@RequestMapping("/formulaire_ajout")
	public String formulaireAjout(Model model) {
		Enseignant e = new Enseignant();
		model.addAttribute("enseignant", e);
		return "html/ajoutenseignant";
	}

	@Override
	@PostMapping("/ajout_enseignant")
	public String ajoutenseignant(Model model, @ModelAttribute Enseignant enseignant) {
		ienseignantbusiness.savenseignant(enseignant);
		return REDIRECT_ENSEIGNANTS;
	}

	@Override
	@RequestMapping("/supenseignant")
	public String delateenseignant(Model model, @RequestParam Integer id) {
		ienseignantbusiness.delateenseignant(id);
		return REDIRECT_ENSEIGNANTS;
	}

	@Override
	@RequestMapping("/mod_enseignant")
	public String formulairemod(Model model, @RequestParam Integer id) {
		Enseignant e = ienseignantbusiness.findEnseigant(id);
		model.addAttribute("E", e);
		return "html/modenseignant";
	}

	@Override
	@PostMapping("/modenseignant")
	public String modifierenseignant(Model model, @ModelAttribute Enseignant enseignant) {
		ienseignantbusiness.modifierenseignant(enseignant);
		return REDIRECT_ENSEIGNANTS;
	}

}
