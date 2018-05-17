package com.ucbcba.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Dishes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @ManyToMany
    @JoinTable(name = "dishesRestaurant", joinColumns = @JoinColumn(name = "dishesId"), inverseJoinColumns = @JoinColumn(name = "restaurantId"))
    private List<Restaurant> restaurantList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Restaurant> getRestauranttsList() {
        return restaurantList;
    }

    public void setRestauranttsList(List<Restaurant> restauranttsList) {
        this.restaurantList = restauranttsList;
    }
}
