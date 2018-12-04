package fr.imad.universite.etudiant.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.imad.universite.etudiant.business.IEtudiantBusiness;
import fr.imad.universite.etudiant.domaine.Etudiant;
import fr.imad.universite.etudiant.repository.IEtudiantRepository;

@Service
public class EtudiantBusinessImpl implements IEtudiantBusiness {
	@Autowired
	private IEtudiantRepository ietudiantrepository;

	@Override
	public List<Etudiant> getEtudiant() {
		return ietudiantrepository.findAll();

	}

	@Override
	public Etudiant fetudiant(Integer id) {
		return ietudiantrepository.getOne(id);

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
