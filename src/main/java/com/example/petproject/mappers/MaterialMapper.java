package com.example.petproject.mappers;

import com.example.petproject.dto.MaterialDTO;
import com.example.petproject.model.Material;
import com.example.petproject.model.Furnace;
import java.util.stream.Collectors;

public class MaterialMapper {

    public static MaterialDTO toDTO(Material material) {
        MaterialDTO dto = new MaterialDTO();
        dto.setId(material.getId());
        dto.setName(material.getName());
        dto.setFurnaceIds(material.getFurnaces() != null
                ? material.getFurnaces()
                .stream()
                .map(Furnace::getId) // Map each Furnace to its ID
                .collect(Collectors.toList())
                : null); // Handle null case
        return dto;
    }

    public static Material toEntity(MaterialDTO dto) {
        Material material = new Material();
        material.setId(dto.getId());
        material.setName(dto.getName());
        return material; // Note: Furnaces need to be set separately in the service
    }
}
