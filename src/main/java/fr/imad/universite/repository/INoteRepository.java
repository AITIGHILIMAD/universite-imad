package fr.imad.universite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.imad.universite.note.domaine.Note;
import fr.imad.universite.notepk.domaine.NotePK;

public interface INoteRepository extends JpaRepository<Note, NotePK> {

}
