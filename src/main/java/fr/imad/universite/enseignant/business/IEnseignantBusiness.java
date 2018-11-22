package fr.imad.universite.enseignant.business;

import java.util.List;

import fr.imad.universite.enseignant.domaine.Enseignant;

public interface IEnseignantBusiness {

	public List<Enseignant> getEnseignant();
	public Enseignant findEnseigant(Integer id);
	public void savenseignant(Enseignant enseignant);
	public void delateenseignant(Integer id);
	public Enseignant modifierenseignant(Enseignant enseignant);
}
