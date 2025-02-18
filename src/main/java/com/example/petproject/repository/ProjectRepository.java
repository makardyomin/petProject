package com.example.petproject.repository;

import com.example.petproject.model.Project;
import com.example.petproject.service.ProjectService;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;



@Repository
public class ProjectRepository {

    public List<Project> findByAmountOfFurnaces(Integer amountOfFurnaces){
        long x = 0;
        List<Project> listProject = new ArrayList<>();
        Project project1 = new Project("Project1", 2, x);
        Project project2 = new Project("Project2", 3, x+1);
        Project project3 = new Project("Project3", 2, x+2);
        if(amountOfFurnaces == project1.getAmountOfFurnaces()){
            listProject.add(project1);
        }
        if(amountOfFurnaces == project2.getAmountOfFurnaces()){
            listProject.add(project2);
        }
        if(amountOfFurnaces == project3.getAmountOfFurnaces()){
            listProject.add(project3);
        }
        return listProject;

    }

    public Project findById(Long id) {
        long x = 0;
        Project project1 = new Project("Project1", 2, x);
        Project project2 = new Project("Project2", 3, x+1);
        Project project3 = new Project("Project3", 2, x+2);
        List<Project> listProject = new ArrayList<>();
        listProject.add(project1);
        listProject.add(project2);
        listProject.add(project3);;
        for(int i=0; i<listProject.size(); i++){
            if(listProject.get(i).getId() == id){
                return listProject.get(i);
            }
        }
        return null;
    }

    public List<Project> findAll() {
        long x = 0;
        List<Project> listProject = new ArrayList<>();
        Project project1 = new Project("Project1", 2, x);
        Project project2 = new Project("Project2", 3, x+1);
        Project project3 = new Project("Project3", 2, x+2);
        return listProject;
    }
}
