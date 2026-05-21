package org.cours.SpringDataRest.modele;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000") // <-- AJOUTE CETTE LIGNE
@RepositoryRestResource(path = "proprietaires")
public interface ProprietaireRepo extends CrudRepository<Proprietaire, Long> {
}
