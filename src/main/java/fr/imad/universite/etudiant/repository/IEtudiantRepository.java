package fr.imad.universite.etudiant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.imad.universite.etudiant.domaine.Etudiant;


@Repository
public interface IEtudiantRepository extends JpaRepository<Etudiant, Integer> {


}
