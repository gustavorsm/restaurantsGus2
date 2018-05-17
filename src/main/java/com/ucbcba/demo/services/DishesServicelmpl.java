package com.ucbcba.demo.services;

import com.ucbcba.demo.entities.Dishes;
import com.ucbcba.demo.repositories.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class DishesServicelmpl implements DishesService {

    private DishRepository dishesRepository;

    @Autowired
    @Qualifier(value = "dishRepository")
    public void setDishesRepository(DishRepository dishRepository) {
        this.dishesRepository = dishRepository;
    }

    @Override
    public Iterable<Dishes> listAllCategories() {
        return this.dishesRepository.findAll();
    }

    public void saveDishes(Dishes category) {
        this.dishesRepository.save(category);
    }

    public Dishes getDishes(Integer id) {
        return this.dishesRepository.findOne(id);
    }

    public void deleteDishes(Integer id) {
        this.dishesRepository.delete(id);
    }
}
