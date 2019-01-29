package be.busi.controller;

import model.dto.IngredientDTO;
import model.entity.IngredientEntity;
import model.mapper.IngredientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.IngredientService;

import java.util.ArrayList;
import java.util.List;

/**
 * created by  eric.nyandwi on Jan,28/01/2019
 */

@RestController
@RequestMapping(value = "/ingredients")
public class IngredientRestController {


    private  final IngredientService ingredientService ;

    @Autowired
    public IngredientRestController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }


    /**
     * Gets all Ingredient information in the database
     * @return the list of all ingredient information
     */
    @GetMapping
    public ResponseEntity <List<IngredientDTO>> getAllPizza() {
        List<IngredientEntity> ingredientEntities = ingredientService.listIngredients();
        List<IngredientDTO> ingredientDTOS = new ArrayList<>();

        for ( IngredientEntity   ingredient : ingredientEntities){
            ingredientDTOS.add(IngredientMapper.entityToDto(ingredient));
        }
        return ResponseEntity.ok(ingredientDTOS);
    }


}
