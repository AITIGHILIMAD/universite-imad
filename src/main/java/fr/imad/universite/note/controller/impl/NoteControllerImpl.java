package fr.imad.universite.note.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.imad.universite.note.business.INoteBusiness;
import fr.imad.universite.note.controller.INoteController;
import fr.imad.universite.note.domaine.Note;

@Controller
public class NoteControllerImpl implements INoteController {

	@Autowired
	private INoteBusiness inotebusiness;

	@Override
	@RequestMapping("/notes")
	public String getnote(Model model) {
		List<Note> n = inotebusiness.getnote();
		model.addAttribute("note", n);
		return "html/notes";
	}

	@Override
	@RequestMapping("/fnotes")
	public String fnote(Model model, Integer idEtudiant, Integer idMatiere) {
		Note note = inotebusiness.fnote(idEtudiant, idMatiere);
		return "html/fnote";
	}
}
