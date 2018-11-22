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
		List<Matiere> listematiere = imatiererepository.findAll();
		return listematiere;
	}

	@Override
	public Matiere fmatiere(Integer id) {
		Matiere m = imatiererepository.getOne(id);
		return m;
	}

	@Override
	public Matiere ajoutmatiere(Matiere matiere) {
		Matiere m = imatiererepository.save(matiere);
		return m;
	}

	@Override
	public void supmatiere(Integer id) {
		imatiererepository.deleteById(id);

	}

	@Override
	public List<Enseignant> findallenseignant() {
		List<Enseignant> E = ienseignantbusiness.getEnseignant();
		return E;
	}

	@Override
	public Enseignant findenseignantbyid(Integer id) {
		Enseignant m = ienseignantbusiness.findEnseigant(id);
		return m;
	}

	@Override
	public Matiere modmatiere(Matiere m) {
		Matiere matiere = imatiererepository.save(m);
		return matiere;
	}

}
