package fr.imad.universite.matiere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.imad.universite.matiere.domaine.Matiere;

@Repository
public interface IMatiereRepository extends JpaRepository<Matiere, Integer> {

}
