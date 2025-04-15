package com.example.petproject.dto;
import com.example.petproject.model.Furnace;
import com.example.petproject.model.Material;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FurnaceDTO {
    // Getters and Setters
    @Getter
    @Setter
    private Long id;
    @Setter
    @Getter
    private String type;
    @Setter
    @Getter
    private Long projectId; // ID of the associated project
    private List<Material> materialIds; // List of Material IDs associated with the furnace

    public FurnaceDTO(Furnace furnace) {
        this.id = furnace.getId();
        this.type = furnace.getType();
        this.projectId = furnace.getProject().getId();
        this.materialIds = furnace.getMaterials();
    }

    public List<Material> getMaterialIds() {
        return materialIds;
    }

    public void setMaterialIds(List<Material> materialIds) {
        this.materialIds = materialIds;
    }
}
