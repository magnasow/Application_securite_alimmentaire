package com.eath.Service;

import com.eath.entite.Utilisateur;

import org.springframework.stereotype.Service;
import java.util.List;

public interface IUtilisateurService {
    Utilisateur addUtilisateur(Utilisateur utilisateur);
    List<Utilisateur> getAllUtilisateurs();
    Utilisateur updateUtilisateur(Integer idUtilisateur, Utilisateur utilisateur);
    void deleteUtilisateur(Integer idUtilisateur);
    Utilisateur getOneUtilisateur(Integer idUtilisateur);
}
