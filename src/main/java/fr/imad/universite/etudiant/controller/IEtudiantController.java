package fr.imad.universite.etudiant.controller;

import org.springframework.ui.Model;

import fr.imad.universite.etudiant.domaine.Etudiant;

public interface IEtudiantController {

	public String findetudiant(Model model);

	public String fetudiant(Model model, Integer id);

	public String formulaireajout(Model model);

	public String ajoutenseignant(Model model, Etudiant etudiant);

	public String supetudiant(Model model, Integer id);

	public String formulairemod(Model model, Integer id);

	public String modifieretudiant(Model model, Etudiant etudiant);
}
