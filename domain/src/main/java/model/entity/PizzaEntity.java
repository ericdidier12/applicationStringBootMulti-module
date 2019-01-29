package model.entity;

import javax.persistence.*;
import java.util.List;

/**
 * created by  eric.nyandwi on Jan,28/01/2019
 */
@Entity
@Table(name = "pizza")
public class PizzaEntity extends BaseEntity {
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private float price;
    @Column(name = "month_promo")
    private boolean  month_promo;
    @Column(name = "fixed")
    private boolean fixed;

    @ManyToMany(mappedBy = "pizzaEntitiesList", fetch = FetchType.EAGER)
    private List<IngredientEntity> ingredientEntityList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isMonth_promo() {
        return month_promo;
    }

    public void setMonth_promo(boolean month_promo) {
        this.month_promo = month_promo;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    public List<IngredientEntity> getIngredientEntityList() {
        return ingredientEntityList;
    }

    public void setIngredientEntityList(List<IngredientEntity> ingredientEntityList) {
        this.ingredientEntityList = ingredientEntityList;
    }
}
