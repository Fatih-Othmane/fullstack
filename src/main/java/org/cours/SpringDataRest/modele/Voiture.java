package org.cours.SpringDataRest.modele;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NonNull
    private String marque;
    @NonNull
    private String modele;
    @NonNull
    private String couleur;
    @NonNull
    private String immatricule;
    @NonNull
    private int annee;
    @NonNull
    private int prix;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proprietaire")

    @NonNull
    @ToString.Exclude
    private Proprietaire proprietaire;

    public Voiture(String toyota, String corolla, String grise, String s, int i, int i1) {
    }
}
