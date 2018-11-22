package fr.imad.universite.enseignant.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.imad.universite.enseignant.business.IEnseignantBusiness;
import fr.imad.universite.enseignant.domaine.Enseignant;
import fr.imad.universite.enseignant.repository.IEnseignantRepository;
@Service
public class EnsiegnantBusinessImpl implements IEnseignantBusiness {

	@Autowired
	private IEnseignantRepository  ienseignantrepository;

	@Override
	public List<Enseignant> getEnseignant() {
		List<Enseignant> listeenseignant = ienseignantrepository.findAll();
		
		
		return listeenseignant ;
	}
	
	

	@Override
	public Enseignant findEnseigant(Integer id) {
		Enseignant E = ienseignantrepository.getOne(id);
		return E;
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
	public  Enseignant modifierenseignant(Enseignant enseignant) {
		ienseignantrepository.save(enseignant);
		return enseignant;
	}


}
