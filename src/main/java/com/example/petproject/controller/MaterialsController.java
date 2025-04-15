package com.example.petproject.controller;

import com.example.petproject.dto.MaterialDTO;
import com.example.petproject.mappers.MaterialMapper;
import com.example.petproject.model.Material;
import com.example.petproject.service.MaterialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materials")
public class MaterialsController {

    @Autowired
    private MaterialService materialService;

    @GetMapping
    public List<MaterialDTO> getAllMaterials() {
        return materialService.getAllMaterials();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MaterialDTO> getMaterialById(@PathVariable Long id) {
        MaterialDTO material = materialService.getMaterialById(id);
        return ResponseEntity.ok(material);
    }

    @PostMapping
    public MaterialDTO createMaterial(@RequestBody MaterialDTO materialDTO) {
        return materialService.createMaterial(materialDTO);
    }

    @PutMapping("/{id}")
    public MaterialDTO updateMaterial(@PathVariable Long id, @RequestBody MaterialDTO materialDTO) {
        return materialService.updateMaterial(id, materialDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteMaterial(@PathVariable Long id) {
        materialService.deleteMaterial(id);
    }
}
