package com.example.petproject.service;

import com.example.petproject.model.Project;
import com.example.petproject.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;
    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    //public Project createProject(Project project) {
    //    return projectRepository.save(project);
    //}

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectById(Long id) {
        return projectRepository.findById(id);
    }

    //public Project updateProject(Long id, Project projectDetails) {
    //    Project project = projectRepository.findById(id)
    //            .orElseThrow(() -> new RuntimeException("Project not found with id: " + id));
    //    project.setName(projectDetails.getName());
    //    project.setAmountOfFurnaces(projectDetails.getAmountOfFurnaces());
    //    return projectRepository.save(project);
    //}

    //public void deleteProject(Long id) {
    //    projectRepository.deleteById(id);
    //}

    public List<Project> findByAmountOfFurnaces(Integer amountOfFurnaces) {
        return projectRepository.findByAmountOfFurnaces(amountOfFurnaces);
    }
}
