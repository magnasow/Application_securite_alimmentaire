package com.eath.web;

import com.eath.entite.Ingredients;
import com.eath.entite.Personne;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientsController {
    @PostMapping
    public ResponseEntity<Ingredients> createIngredients(@RequestBody Ingredients ingredients) {
        // Logique pour créer une Ingredients
        return ResponseEntity.ok(ingredients);
    }
}
