package com.example.petproject.dto;

import com.example.petproject.model.Furnace;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ProjectDto {
    // Getters and Setters
    private Long id;
    private String name;
    private List<Furnace> furnaceIds;
}
