package com.example.petproject.dto;

import com.example.petproject.model.Furnace;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProjectDto {
    // Getters and Setters
    private Long id;
    private String name;
    private List<Furnace> furnaceIds;
}
