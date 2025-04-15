package com.example.petproject.mappers;

import com.example.petproject.dto.ProjectDTO;
import com.example.petproject.model.Project;
import com.example.petproject.model.Furnace;
import java.util.stream.Collectors;

public class ProjectMapper {

    public static ProjectDTO toDTO(Project project) {
        ProjectDTO dto = new ProjectDTO();
        dto.setId(project.getId());
        dto.setName(project.getName());
        dto.setFurnaceIds(project.getFurnaces() != null
                ? project.getFurnaces().stream().collect(Collectors.toList())
                : null);
        return dto;
    }

    public static Project toEntity(ProjectDTO dto) {
        Project project = new Project();
        project.setId(dto.getId());
        project.setName(dto.getName());
        return project; // Note: Furnaces need to be set separately in the service
    }
}
