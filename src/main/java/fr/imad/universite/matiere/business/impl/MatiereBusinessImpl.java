package fr.imad.universite.matiere.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.imad.universite.enseignant.business.IEnseignantBusiness;
import fr.imad.universite.enseignant.domaine.Enseignant;
import fr.imad.universite.matiere.business.IMatiereBusiness;
import fr.imad.universite.matiere.domaine.Matiere;
import fr.imad.universite.matiere.repository.IMatiereRepository;

@Service
public class MatiereBusinessImpl implements IMatiereBusiness {
	@Autowired
	private IMatiereRepository imatiererepository;
	@Autowired
	private IEnseignantBusiness ienseignantbusiness;

	@Override
	public List<Matiere> getMatiere() {
		return imatiererepository.findAll();

	}

	@Override
	public Matiere fmatiere(Integer id) {
		return imatiererepository.getOne(id);

	}

	@Override
	public Matiere ajoutmatiere(Matiere matiere) {
		return imatiererepository.save(matiere);

	}

	@Override
	public void supmatiere(Integer id) {
		imatiererepository.deleteById(id);

	}

	@Override
	public List<Enseignant> findallenseignant() {
		return ienseignantbusiness.getEnseignant();

	}

	@Override
	public Enseignant findenseignantbyid(Integer id) {
		return ienseignantbusiness.findEnseigant(id);

	}

	@Override
	public Matiere modmatiere(Matiere m) {
		return imatiererepository.save(m);

	}

}
