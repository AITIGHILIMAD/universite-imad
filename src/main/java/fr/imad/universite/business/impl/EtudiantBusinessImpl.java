package fr.imad.universite.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.imad.universite.business.IEtudiantBusiness;
import fr.imad.universite.etudiant.domaine.Etudiant;
import fr.imad.universite.etudiant.repository.IEtudiantRepository;
@Service
public class EtudiantBusinessImpl implements IEtudiantBusiness {
@Autowired
private IEtudiantRepository ietudiantrepository ;
	@Override
	public List<Etudiant> getEtudiant() {
		List<Etudiant> listetudiant = ietudiantrepository.findAll();
		return listetudiant;
	}
	@Override
	public Etudiant fetudiant(Integer id) {
		Etudiant etudiant = ietudiantrepository.getOne(id);
		return etudiant;
	}
	@Override
	public void savetudiant(Etudiant etudiant) {
		ietudiantrepository.save(etudiant);
		
	}
	@Override
	public void supetudiant(Integer id) {
		ietudiantrepository.deleteById(id);
		
	}
	@Override
	public Etudiant modifieretudiant(Etudiant etudiant) {
		ietudiantrepository.save(etudiant);
		return etudiant;
	}

}
