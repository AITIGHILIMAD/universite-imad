package fr.imad.universite.note.controller;

import org.springframework.ui.Model;

public interface INoteController {

	public String getnote(Model model);

	public String fnote(Model model, Integer idEtudiant, Integer idMatiere);
}
