package org.cours.SpringDataRest.modele;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000") // <-- AJOUTE CETTE LIGNE
@RepositoryRestResource(path = "voitures")
public interface VoitureRepo extends CrudRepository<Voiture, Long> {

    // Sélectionnez les voitures par marque
    List<Voiture> findByMarque(String marque);
    // Sélectionnez les voitures par couleur
    List<Voiture> findByCouleur(@Param("couleur") String couleur);
    // Sélectionnez les voitures par année
    List<Voiture> findByAnnee(int annee);
    // Sélectionnez les voitures par marque et modele
    List<Voiture> findByMarqueAndModele(String marque, String modele);
    // Sélectionnez les voitures par marque ou couleur
    List<Voiture> findByMarqueOrCouleur(String marque, String couleur);
    // Sélectionnez les voitures par marque et trier par annee
    List<Voiture> findByMarqueOrderByAnneeAsc(String marque);
    @Query("select v from Voiture v where v.marque like %?1")
    List<Voiture> findByMarqueEndsWith(String marque);
    //Lister Voitures par marque
    List<Voiture> findByModele(@Param("modele") String modele);


}
