package fr.imad.universite.enseignant.controller;

import org.springframework.ui.Model;

import fr.imad.universite.enseignant.domaine.Enseignant;

public interface IEnseignantController {

	
	
	public String getEnseignants(Model model);
	
	public String findEnsiegnant(Model model , Integer id);
	public String formulaireAjout(Model model ); 
	public String ajoutenseignant(Model model , Enseignant enseignant);
	public String delateenseignant(Model model, Integer id );
	public String formulairemod(Model model, Integer id);
	public String modifierenseignant(Model model , Enseignant enseignant );
	
	
}
