package com.eath.service;

import com.eath.entite.Administrateur;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IAdministrateurService {
    Administrateur addAdministrateur(Administrateur Administrateur);

    List<Administrateur> getAllAdministrateur();
    Administrateur updateAdministrateur(Integer idAdministrateur, Administrateur Administrateur);
    void  deletedAdministrateur(Integer idAdministrateur);
    Administrateur getOneAdministrateur(Integer idAdministrateur);
}

