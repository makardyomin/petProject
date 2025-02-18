package com.example.petproject.controller;

import com.example.petproject.model.Project;
import com.example.petproject.service.ProjectService;
import com.example.petproject.repository.ProjectRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    // GET эндпоинт с Query Parameters
    @GetMapping("/projects")
    public List<Project> getProjectsByAmountOfFurnaces(@RequestParam(required = false) Integer amount) {
        return projectService.findByAmountOfFurnaces(amount);
    }

    // GET эндпоинт с Path Parameters
    @GetMapping("/projects/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }
}