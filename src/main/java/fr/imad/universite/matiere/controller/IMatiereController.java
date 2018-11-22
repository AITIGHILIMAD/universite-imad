package fr.imad.universite.matiere.controller;

import org.springframework.ui.Model;

import fr.imad.universite.matiere.domaine.Matiere;

public interface IMatiereController {
	public String getMatiere(Model model);

	public String fmatiere(Model model, Integer id);

	public String ajout_formulaire(Model model);

	public String ajoutmatiere(Model model, Matiere matiere, Integer idenseignant);

	public String supmatiere(Model model, Integer id);

	public String ajformulaire(Model model, Integer id);

	public String modmatiere(Model model, Matiere matiere, Integer id);

}
