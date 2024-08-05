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
public class Administrateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdministrateur;

    @OneToOne
    @JoinColumn(name = "id_personne", referencedColumnName = "idPersonne")
    private Personne personne;

    private String niveauAdmin;
    private String privileges;
    private Timestamp dateCreation;
    private Timestamp dateModification;
}
