package com.example.petproject.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.petproject.model.Material;
import com.example.petproject.dto.MaterialDTO;
import com.example.petproject.mappers.MaterialMapper;
import com.example.petproject.repository.FurnaceRepository;
import com.example.petproject.repository.MaterialRepository;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository materialRepository;

    @Autowired
    private FurnaceRepository furnaceRepository;

    public List<MaterialDTO> getAllMaterials() {
        return materialRepository.findAll().stream()
                .map(MaterialMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MaterialDTO getMaterialById(Long id) {
        return materialRepository.findById(id)
                .map(MaterialMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Material not found with id " + id));
    }

    public MaterialDTO createMaterial(MaterialDTO materialDTO) {
        Material material = MaterialMapper.toEntity(materialDTO);
        Material savedMaterial = materialRepository.save(material);
        return MaterialMapper.toDTO(savedMaterial);
    }

    public MaterialDTO updateMaterial(Long id, MaterialDTO materialDTO) {
        return materialRepository.findById(id).map(material -> {
            material.setName(materialDTO.getName());
            Material updatedMaterial = materialRepository.save(material);
            return MaterialMapper.toDTO(updatedMaterial);
        }).orElseThrow(() -> new RuntimeException("Material not found with id " + id));
    }

    public void deleteMaterial(Long id) {
        materialRepository.deleteById(id);
    }
}
