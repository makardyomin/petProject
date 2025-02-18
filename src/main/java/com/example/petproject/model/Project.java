package com.example.petproject.model;

public class Project {

    private Long id;

    private String name;
    private Integer amountOfFurnaces;

    public Project() {}

    public Project(String name, Integer amountOfFurnaces, Long id) {
        this.name = name;
        this.amountOfFurnaces = amountOfFurnaces;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmountOfFurnaces() {
        return amountOfFurnaces;
    }

    public void setAmountOfFurnaces(Integer amountOfFurnaces) {
        this.amountOfFurnaces = amountOfFurnaces;
    }

    public  Project findById(Long id) {
        return this;
    }
}