package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.Dishes;

public interface DishesService {

    Iterable<Dishes> listAllCategories();

    void saveDishes(Dishes category);

    Dishes getDishes(Integer id);

    void deleteDishes(Integer id);
}
