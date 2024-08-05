package com.eath.entite;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class UserView {
    @Id
    private Integer idPersonne;
    private String nomPersonne;
    private String prenomPersonne;
    private String email;
    private String motDePasse;
    private String role;
}
