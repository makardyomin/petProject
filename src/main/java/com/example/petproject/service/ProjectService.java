package com.example.petproject.service;

import com.example.petproject.model.Project;
import com.example.petproject.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    /**
     * repository.
     */
    private final ProjectRepository projectRepository;

    /**
     * constructor.
     ** @param repository repository
     */
    @Autowired
    public ProjectService(final ProjectRepository repository) {
        this.projectRepository = repository;
    }

    /**
     * get all.
     ** @return list
     */
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    /**
     * get by id.
     ** @param id to search
     ** @return project
     */
    public Project getProjectById(final Long id) {
        return projectRepository.findById(id);
    }

    /**
     * search by param.
     ** @param amountOfFurnaces to search
     ** @return list
     */
    public List<Project> findByAmountOfFurnaces(
            final Integer amountOfFurnaces) {
        return projectRepository.findByAmountOfFurnaces(amountOfFurnaces);
    }
}
