package com.example.petproject.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Project {
    /**
     * project class.
     */
    @Id
    private Long id;
    /**
     * id.
     */
    private String name;
    /**
     * string.
     */
    private Integer amountOfFurnaces;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Furnace> furnaces = new ArrayList<>();

    /**
     * constructor.
     */
    public Project() { }

    /**
     * constructor with params.
     ** @param newName of project
     ** @param amount of furnaces in project
     ** @param newId of project
     */
    public Project(
            final String newName, final Integer amount, final Long newId) {
        this.name = newName;
        this.amountOfFurnaces = amount;
        this.id = newId;
    }

    /**
     * getter.
     ** @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * setter.
     ** @param newId new
     */
    public void setId(final Long newId) {
        this.id = newId;
    }

    /**
     * getter for name.
     ** @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for name.
     ** @param newName to change
     */
    public void setName(final String newName) {
        this.name = newName;
    }

    /**
     * getter for amount.
     ** @return amount
     */
    public Integer getAmountOfFurnaces() {
        return amountOfFurnaces;
    }

    /**
     * setter for amount.
     ** @param amount of furnaces new
     */
    public void setAmountOfFurnaces(final Integer amount) {
        this.amountOfFurnaces = amount;
    }

    public List<Furnace> getFurnaces() {
        return furnaces;
    }

    public void setFurnaces(List<Furnace> furnaces) {
        this.furnaces = furnaces;
    }
}
