package org.cours.SpringDataRest.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Proprietaire {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @JsonIgnore
    @ToString.Exclude
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proprietaire")
    private List<Voiture> voitures;
}
