package com.ucbcba.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

public class NivelPrecio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String description;

    @ManyToMany
    @JoinTable(name = "nivelPrecioRestaurant", joinColumns = @JoinColumn(name = "nivelPrecioId"), inverseJoinColumns = @JoinColumn(name = "restaurantId"))
    private List<Restaurant> restaurantList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
}
