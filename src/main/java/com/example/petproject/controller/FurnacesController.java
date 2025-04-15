package com.example.petproject.controller;

import com.example.petproject.dto.FurnaceDTO;
import com.example.petproject.service.FurnaceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/furnaces")
public class FurnacesController {

    @Autowired
    private FurnaceService furnaceService;

    @GetMapping
    public List<FurnaceDTO> getAllFurnaces() {
        return furnaceService.getAllFurnaces();
    }

    @GetMapping("/{id}")
    public FurnaceDTO getFurnaceById(@PathVariable Long id) {
        return furnaceService.getFurnaceById(id);
    }

    @PostMapping
    public FurnaceDTO createFurnace(@RequestBody FurnaceDTO furnaceDTO) {
        return furnaceService.createFurnace(furnaceDTO);
    }

    @PutMapping("/{id}")
    public FurnaceDTO updateFurnace(@PathVariable Long id, @RequestBody FurnaceDTO furnaceDTO) {
        return furnaceService.updateFurnace(id, furnaceDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteFurnace(@PathVariable Long id) {
        furnaceService.deleteFurnace(id);
    }
}
