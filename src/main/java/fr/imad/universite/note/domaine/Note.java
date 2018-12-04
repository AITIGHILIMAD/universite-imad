package fr.imad.universite.note.domaine;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.imad.universite.etudiant.domaine.Etudiant;
import fr.imad.universite.matiere.domaine.Matiere;

@Entity
@Table(name = "T_Note")
public class Note {
	@EmbeddedId
	private NotePK notepk;

	@ManyToOne
	@JoinColumn(name = "id_etudiant", insertable = false, updatable = false)
	private Etudiant etudiant;

	@ManyToOne
	@JoinColumn(name = "id_matiere", insertable = false, updatable = false)
	private Matiere matiere;

	@Column(name = "Note")
	private Double note;

	public NotePK getNotepk() {
		return notepk;
	}

	public void setNotepk(NotePK notepk) {
		this.notepk = notepk;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

}
