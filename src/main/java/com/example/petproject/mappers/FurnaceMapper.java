package com.example.petproject.mappers;

import com.example.petproject.dto.FurnaceDTO;
import com.example.petproject.model.Furnace;

public class FurnaceMapper {

    public static FurnaceDTO toDTO(Furnace furnace) {
        FurnaceDTO dto = new FurnaceDTO();
        dto.setId(furnace.getId());
        dto.setType(furnace.getType());
        dto.setProjectId(furnace.getProject() != null ? furnace.getProject().getId() : null);
        dto.setMaterialIds(furnace.getMaterials() != null
                ? furnace.getMaterials()
                : null);
        return dto;
    }

    public static Furnace toEntity(FurnaceDTO dto) {
        Furnace furnace = new Furnace();
        furnace.setId(dto.getId());
        furnace.setType(dto.getType());
        furnace.setMaterials(dto.getMaterialIds());
        return furnace;
    }
}
