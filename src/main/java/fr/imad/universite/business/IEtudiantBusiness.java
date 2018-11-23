package fr.imad.universite.business;

import java.util.List;

import fr.imad.universite.etudiant.domaine.Etudiant;

public interface IEtudiantBusiness {

	public List<Etudiant> getEtudiant();

	public Etudiant fetudiant(Integer id);

	public void savetudiant(Etudiant etudiant);

	public void supetudiant(Integer id);

	public Etudiant modifieretudiant(Etudiant etudiant);
}
