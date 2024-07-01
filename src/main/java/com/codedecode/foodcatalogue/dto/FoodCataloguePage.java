package com.codedecode.foodcatalogue.dto;

import com.codedecode.foodcatalogue.entity.FoodItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodCataloguePage {

    private List<FoodItem> foodItemsList;
    private Restaurant restaurant;

    public void setFoodItemsList(List<FoodItem> foodItemsList) {
        this.foodItemsList = foodItemsList;
    }

    public List<FoodItem> getFoodItemsList() {
        return foodItemsList;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }
}
