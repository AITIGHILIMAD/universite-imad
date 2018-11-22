package fr.imad.universite.note.business;

import java.util.List;

import fr.imad.universite.note.domaine.Note;

public interface INoteBusiness {

	public List<Note> getnote();

	public Note fnote(Integer idEtudiant, Integer idMatiere);
}
