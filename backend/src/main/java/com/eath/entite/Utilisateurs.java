package com.eath.entite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUtilisateur;

    @OneToOne
    @JoinColumn(name = "id_personne", referencedColumnName = "idPersonne")
    private Personne personne;

    private String preference;
    private String niveauAbonnement;
    private Timestamp dateCreation;
    private Timestamp dateModification;
}
