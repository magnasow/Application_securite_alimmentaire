package com.eath.Service.Implement;

import com.eath.Service.IUtilisateurService;
import com.eath.dao.UtilisateurRepository;
import com.eath.entite.Utilisateur;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UtilisateurServiceImpl implements IUtilisateurService {
    private final UtilisateurRepository utilisateurRepository;

    @Override
    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur updateUtilisateur(Integer idUtilisateur, Utilisateur utilisateur) {
        Utilisateur existingUser = getOneUtilisateur(idUtilisateur);
        existingUser.setPreference(utilisateur.getPreference());
        existingUser.setNiveauAbonnement(utilisateur.getNiveauAbonnement());
        //
        return utilisateurRepository.save(existingUser);
    }

    @Override
    public void deleteUtilisateur(Integer idUtilisateur) {
        utilisateurRepository.deleteById(idUtilisateur);
    }

    @Override
    public Utilisateur getOneUtilisateur(Integer idUtilisateur) {
        return utilisateurRepository.findById(idUtilisateur).orElseThrow(() ->
                new RuntimeException("L'utilisateur recherché n'existe pas"));
    }
}
