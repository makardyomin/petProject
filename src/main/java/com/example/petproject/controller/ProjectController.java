package com.example.petproject.controller;

import com.example.petproject.model.Project;
import com.example.petproject.service.ProjectService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * summary.
 */
@RestController
public class ProjectController {
    /**
     * service.
     */
    private final ProjectService projectService;

    /**
     * costructor.
     ** @param service service
     */
    public ProjectController(final ProjectService service) {
        this.projectService = service;
    }

    /**
     * get all.
     ** @return list
     */
    @GetMapping("/projects/all")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    /**
     * get by param.
     ** @param amount of furnaces in project
     ** @return list
     */
    @GetMapping("/projects")
    public List<Project> getProjectsByAmountOfFurnaces(
            @RequestParam(required = false) final Integer amount) {
        return projectService.findByAmountOfFurnaces(amount);
    }

    /**
     * get by id.
     ** @param id of project
     ** @return project
     */
    @GetMapping("/projects/{id}")
    public Project getProjectById(@PathVariable final Long id) {
        return projectService.getProjectById(id);
    }
}
