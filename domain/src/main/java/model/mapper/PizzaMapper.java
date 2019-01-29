package model.mapper;

import model.dto.IngredientDTO;
import model.dto.PizzaDTO;
import model.entity.IngredientEntity;
import model.entity.PizzaEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Transformation entre le modèle des entités JPA et les objets DTO .
 */
public class PizzaMapper {
    /**
     * Transforme une entité JPA {@link PizzaEntity} en objet TDO {@link PizzaDTO}.
     * @param pizzaDTO
     * @return PizzaEntity
     */
    public static PizzaEntity dtoToEntity(PizzaDTO pizzaDTO) {
        if (pizzaDTO == null) {
            throw new IllegalArgumentException(" objet pizzaDTO  ne peut pas être null ");
        }

        PizzaEntity pizzaEntity = new PizzaEntity();
        pizzaEntity.setId(pizzaDTO.getId());
        pizzaEntity.setName(pizzaDTO.getName());
        pizzaEntity.setFixed(pizzaDTO.isFixed());
        pizzaEntity.setMonth_promo(pizzaDTO.isMonth_promo());
        pizzaEntity.setPrice(pizzaDTO.getPrice());

        List< IngredientEntity> ingredientEntities = new ArrayList<>();

        for (IngredientDTO ingredient : pizzaDTO.getIngredients()){
             ingredientEntities.add(IngredientMapper.dtoToEntity(ingredient));
        }
        pizzaEntity.setIngredientEntityList(ingredientEntities);

        return pizzaEntity;
    }

    /**
     * Transforme un objet TDO {@link PizzaDTO} en une entité JPA {@link PizzaEntity}.
     * @param pizzaEntity
     * @return objet PizzaDTO
     */
    public static PizzaDTO entityToDto(PizzaEntity pizzaEntity){
        if (pizzaEntity == null) {
            throw new IllegalArgumentException(" objet pizzaEntity  ne peut pas être null ");
        }

        PizzaDTO pizzaDTO = new PizzaDTO();
        pizzaDTO.setId(pizzaEntity.getId());
        pizzaDTO.setName(pizzaEntity.getName());
        pizzaDTO.setFixed(pizzaEntity.isFixed());
        pizzaDTO.setMonth_promo(pizzaEntity.isMonth_promo());
        pizzaDTO.setPrice(pizzaEntity.getPrice());

        List<IngredientDTO> ingredientDTOS  = new ArrayList<>();
        for (IngredientEntity  ingredient: pizzaEntity.getIngredientEntityList()){
            ingredientDTOS.add(IngredientMapper.entityToDto(ingredient));
        }
        pizzaDTO.setIngredients(ingredientDTOS);

        return pizzaDTO;
    }
}
