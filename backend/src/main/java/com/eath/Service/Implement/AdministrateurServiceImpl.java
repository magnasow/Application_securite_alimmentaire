package com.eath.Service.Implement;

import com.eath.Service.IAdministrateurService;
import com.eath.dao.AdministrateurRepository;
import com.eath.entite.Administrateur;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdministrateurServiceImpl implements IAdministrateurService {
    private final AdministrateurRepository administrateurRepository;

    @Override
    public Administrateur addAdministrateur(Administrateur administrateur) {
        return administrateurRepository.save(administrateur);
    }

    @Override
    public List<Administrateur> getAllAdministrateurs() {
        return administrateurRepository.findAll();
    }

    @Override
    public Administrateur updateAdministrateur(Integer idAdministrateur, Administrateur administrateur) {
        Administrateur existingAdmin = getOneAdministrateur(idAdministrateur);
        existingAdmin.setNiveauAdmin(administrateur.getNiveauAdmin());
        existingAdmin.setPrivileges(administrateur.getPrivileges());
        // 
        return administrateurRepository.save(existingAdmin);
    }

    @Override
    public void deleteAdministrateur(Integer idAdministrateur) {
        administrateurRepository.deleteById(idAdministrateur);
    }

    @Override
    public Administrateur getOneAdministrateur(Integer idAdministrateur) {
        return administrateurRepository.findById(idAdministrateur).orElseThrow(() ->
                new RuntimeException("L'administrateur recherché n'existe pas"));
    }
}
