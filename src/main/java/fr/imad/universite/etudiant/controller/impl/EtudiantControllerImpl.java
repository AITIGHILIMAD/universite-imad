package fr.imad.universite.etudiant.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.imad.universite.business.IEtudiantBusiness;
import fr.imad.universite.etudiant.controller.IEtudiantController;
import fr.imad.universite.etudiant.domaine.Etudiant;

@Controller
public class EtudiantControllerImpl implements IEtudiantController {
	@Autowired
	private IEtudiantBusiness ietudiantbusiness;

	@Override
	@RequestMapping("/etudiant")
	public String findetudiant(Model model) {
		List<Etudiant> etudiant = ietudiantbusiness.getEtudiant();
		model.addAttribute("etd", etudiant);
		return "html/etudiant";
	}

	@Override
	@RequestMapping("/fetudiant")
	public String fetudiant(Model model, @RequestParam Integer id) {
		Etudiant fetudiant = ietudiantbusiness.fetudiant(id);
		model.addAttribute("fetd", fetudiant);

		return "html/fetudiant";
	}

	@Override
	@RequestMapping("/formulaire_etudiant_ajout")
	public String formulaireajout(Model model) {
		Etudiant e = new Etudiant();
		model.addAttribute("etudiant", e);
		return "html/ajoutetudiant";
	}

	@Override
	@PostMapping("/ajout_etudiant")
	public String ajoutenseignant(Model model, Etudiant etudiant) {
		ietudiantbusiness.savetudiant(etudiant);
		return "redirect:/etudiant";
	}

	@Override
	@RequestMapping("/supetudiant")
	public String supetudiant(Model model, Integer id) {
		ietudiantbusiness.supetudiant(id);
		return "redirect:/etudiant";
	}

	@Override
	@RequestMapping("/mod_etudiant")
	public String formulairemod(Model model, @RequestParam Integer id) {
		Etudiant e = ietudiantbusiness.fetudiant(id);
		model.addAttribute("E", e);
		return "html/modetudiant";

	}

	@Override
	@PostMapping("/modetudiant")
	public String modifieretudiant(Model model, @ModelAttribute Etudiant etudiant) {
		ietudiantbusiness.modifieretudiant(etudiant);
		return "redirect:/etudiant";
	}

}
