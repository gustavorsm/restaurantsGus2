package com.ucbcba.demo.repositories;

import com.ucbcba.demo.entities.Dishes;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
    public interface DishRepository extends CrudRepository<Dishes, Integer> {
}