package fr.imad.universite.matiere.business;

import java.util.List;

import fr.imad.universite.enseignant.domaine.Enseignant;
import fr.imad.universite.matiere.domaine.Matiere;

public interface IMatiereBusiness {

	public List<Matiere> getMatiere();

	public Matiere fmatiere(Integer id);

	public Matiere ajoutmatiere(Matiere matiere);

	public void supmatiere(Integer id);

	public List<Enseignant> findallenseignant();

	public Enseignant findenseignantbyid(Integer id);

	public Matiere modmatiere(Matiere m);
}
