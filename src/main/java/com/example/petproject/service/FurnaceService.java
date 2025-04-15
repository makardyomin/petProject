package com.example.petproject.service;

import com.example.petproject.model.Furnace;
import com.example.petproject.dto.FurnaceDTO;
import com.example.petproject.mappers.FurnaceMapper;
import com.example.petproject.repository.ProjectRepository;
import com.example.petproject.repository.MaterialRepository;
import com.example.petproject.model.Project;
import com.example.petproject.repository.FurnaceRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FurnaceService {

    @Autowired
    private FurnaceRepository furnaceRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private MaterialRepository materialRepository;

    public List<FurnaceDTO> getAllFurnaces() {
        return furnaceRepository.findAll().stream()
                .map(FurnaceMapper::toDTO)
                .collect(Collectors.toList());
    }

    public FurnaceDTO getFurnaceById(Long id) {
        return furnaceRepository.findById(id)
                .map(FurnaceMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Furnace not found with id " + id));
    }

    public FurnaceDTO createFurnace(FurnaceDTO furnaceDTO) {
        Furnace furnace = FurnaceMapper.toEntity(furnaceDTO);
        Furnace savedFurnace = furnaceRepository.save(furnace);
        return FurnaceMapper.toDTO(savedFurnace);
    }

    public FurnaceDTO updateFurnace(Long id, FurnaceDTO furnaceDTO) {
        return furnaceRepository.findById(id).map(furnace -> {
            furnace.setType(furnaceDTO.getType());

            // Update associated project
            if (furnaceDTO.getProjectId() != null) {
                Project project = projectRepository.findById(furnaceDTO.getProjectId())
                        .orElseThrow(() -> new RuntimeException("Project not found with id " + furnaceDTO.getProjectId()));
                furnace.setProject(project);
            }
            Furnace updatedFurnace = furnaceRepository.save(furnace);
            return FurnaceMapper.toDTO(updatedFurnace);
        }).orElseThrow(() -> new RuntimeException("Furnace not found with id " + id));
    }

    public void deleteFurnace(Long id) {
        furnaceRepository.deleteById(id);
    }
}