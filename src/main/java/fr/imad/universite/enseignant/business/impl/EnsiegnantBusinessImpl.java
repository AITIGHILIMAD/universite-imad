package fr.imad.universite.enseignant.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.imad.universite.enseignant.business.IEnseignantBusiness;
import fr.imad.universite.enseignant.domaine.Enseignant;
import fr.imad.universite.enseignant.repository.IEnseignantRepository;

@Service
public class EnsiegnantBusinessImpl implements IEnseignantBusiness {

	@Autowired
	private IEnseignantRepository ienseignantrepository;

	@Override
	public List<Enseignant> getEnseignant() {
		return ienseignantrepository.findAll();

	}

	@Override
	public Enseignant findEnseigant(Integer id) {
		return ienseignantrepository.getOne(id);

	}

	@Override
	public void savenseignant(Enseignant enseignant) {
		ienseignantrepository.save(enseignant);
	}

	@Override
	public void delateenseignant(Integer id) {
		ienseignantrepository.deleteById(id);

	}

	@Override
	public Enseignant modifierenseignant(Enseignant enseignant) {
		ienseignantrepository.save(enseignant);
		return enseignant;
	}

}
