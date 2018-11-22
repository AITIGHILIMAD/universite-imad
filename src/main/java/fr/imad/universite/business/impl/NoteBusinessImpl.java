package fr.imad.universite.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.imad.universite.note.business.INoteBusiness;
import fr.imad.universite.note.domaine.Note;
import fr.imad.universite.notepk.domaine.NotePK;
import fr.imad.universite.repository.INoteRepository;

@Service
public class NoteBusinessImpl implements INoteBusiness {
	@Autowired
	private INoteRepository inoterepository;

	@Override
	public List<Note> getnote() {
		List<Note> liste = inoterepository.findAll();
		return liste;
	}

	@Override
	public Note fnote(Integer idMatiere, Integer idEtudiant) {
		NotePK pk = new NotePK();
		pk.setIdEtudiant(idEtudiant);
		pk.setIdMatiere(idMatiere);
		Note n = inoterepository.getOne(pk);
		return n;
	}
}
