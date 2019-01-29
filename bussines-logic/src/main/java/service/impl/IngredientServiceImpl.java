package service.impl;

import model.entity.IngredientEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.IngredientRepository;
import service.IngredientService;

import java.util.List;

/**
 * created by  eric.nyandwi on Jan,28/01/2019
 */

@Service
@Transactional
public class IngredientServiceImpl  implements IngredientService {

    IngredientRepository ingredientRepository ;

    @Autowired
    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public List<IngredientEntity> listIngredients() {
        return ingredientRepository.findAll();
    }
}
