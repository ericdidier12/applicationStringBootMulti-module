package model.mapper;


import model.dto.IngredientDTO;
import model.entity.IngredientEntity;

/**
 * Transformation entre le modèle des entités JPA et les objets DTO .
 *
 */
public class IngredientMapper {


    /**
     * Transforme une entité JPA {@link IngredientEntity} en objet TDO {@link IngredientDTO}.
     * @param ingredientDTO
     * @return IngredientEntity
     */
    public static IngredientEntity dtoToEntity(IngredientDTO ingredientDTO) {
        if (ingredientDTO == null) {
            throw new IllegalArgumentException(" objet ingredientDTO  ne peut pas être null ");
        }

        IngredientEntity ingredientEntity = new IngredientEntity();
        ingredientEntity.setId(ingredientDTO.getId());
        ingredientEntity.setName(ingredientDTO.getName());
        ingredientEntity.setRecipe_quantity(ingredientDTO.getRecipe_qunatity());
        ingredientEntity.setStock_quantity(ingredientDTO.getStock_quantity());
        ingredientEntity.setUnit_price(ingredientDTO.getUnit_price());

        return ingredientEntity;
    }

    /**
     * Transforme un objet TDO {@link IngredientDTO} en une entité JPA {@link IngredientEntity}.
     * @param ingredientEntity
     * @return objet IngredientDTO
     */
    public static IngredientDTO entityToDto(IngredientEntity ingredientEntity){
        if (ingredientEntity == null) {
            throw new IllegalArgumentException(" objet ingredientEntity  ne peut pas être null ");
        }

        IngredientDTO ingredientDTO = new IngredientDTO();
        ingredientDTO.setId( ingredientEntity.getId());
        ingredientDTO.setName(ingredientEntity.getName());
        ingredientDTO.setRecipe_qunatity(ingredientEntity.getRecipe_quantity());
        ingredientDTO.setStock_quantity(ingredientEntity.getStock_quantity());
        ingredientDTO.setUnit_price(ingredientEntity.getUnit_price());
        return ingredientDTO;
    }
    }
