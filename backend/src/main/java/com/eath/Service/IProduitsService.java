package com.eath.service;

import com.eath.entite.Produits;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IProduitsService {
    Produits addProduits(Produits produits);

    List<Produits> getAllProduits();
    Produits updateProduits(Integer idProduit, Produits produits);
    void  deletedProduits(Integer idProduit);
    Produits getOneProduits(Integer idProduit);
}

