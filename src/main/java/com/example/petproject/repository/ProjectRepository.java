package com.example.petproject.repository;

import com.example.petproject.model.Project;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * summary.
 */
@Repository
public class ProjectRepository {
    /**
     * long id.
     */
    private final long a1 = 0;
    /**
     * project1.
     */
    private final Project project1 = new Project("Project1", 2, a1);
    /**
     * project2.
     */
    private final Project project2 = new Project("Project2", 3, a1 + 1);
    /**
     * project3.
     */
    private final Project project3 = new Project("Project3", 2, a1 + 2);

    /**
     * find by param.
     ** @param amountOfFurnaces to search
     ** @return list
     */
    public List<Project> findByAmountOfFurnaces(
            final Integer amountOfFurnaces) {
        List<Project> listProject = new ArrayList<>();
        if (amountOfFurnaces.equals(project1.getAmountOfFurnaces())) {
            listProject.add(project1);
        }
        if (amountOfFurnaces.equals(project2.getAmountOfFurnaces())) {
            listProject.add(project2);
        }
        if (amountOfFurnaces.equals(project3.getAmountOfFurnaces())) {
            listProject.add(project3);
        }
        return listProject;
    }

    /**
     * summary.
     ** @param id to search
     ** @return project
     */
    public Project findById(final Long id) {
        List<Project> listProject = new ArrayList<>();
        listProject.add(project1);
        listProject.add(project2);
        listProject.add(project3);
        for (Project project : listProject) {
            if (project.getId().equals(id)) {
                return project;
            }
        }
        return null;
    }

    /**
     * summary.
     ** @return list
     */
    public List<Project> findAll() {
        List<Project> listProject = new ArrayList<>();
        listProject.add(project1);
        listProject.add(project2);
        listProject.add(project3);
        return listProject;
    }
}
