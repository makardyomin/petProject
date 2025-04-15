package com.example.petproject.dto;

import java.util.List;
import com.example.petproject.model.Furnace;

public class ProjectDTO {

    private Long id;
    private String name;
    private List<Furnace> furnaceIds;

    // Getters and Setters
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

    public List<Furnace> getFurnaceIds() {
        return furnaceIds;
    }

    public void setFurnaceIds(List<Furnace> furnaceIds) {
        this.furnaceIds = furnaceIds;
    }
}
