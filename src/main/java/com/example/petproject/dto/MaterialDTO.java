package com.example.petproject.dto;

import com.example.petproject.model.Material;
import com.example.petproject.model.Furnace;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.stream.Collectors;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class MaterialDTO {

    @Setter
    @Getter
    private Long id;

    @Setter
    @Getter
    private String name;
    private List<Long> furnaceIds; // List of Furnace IDs associated with the material

    // Constructor that converts Material to MaterialDTO
    public MaterialDTO(Material material) {
        this.id = material.getId();
        this.name = material.getName();
        // Extract furnace IDs instead of full Furnace objects
        this.furnaceIds = material.getFurnaces()
                .stream()
                .map(Furnace::getId) // Get only the ID of each Furnace
                .collect(Collectors.toList());
    }

    public List<Long> getFurnaceIds() {
        return furnaceIds;
    }

    public void setFurnaceIds(List<Long> furnaceIds) {
        this.furnaceIds = furnaceIds;
    }
}
