package com.example.petproject.service;

import com.example.petproject.model.Project;
import com.example.petproject.dto.ProjectDTO;
import com.example.petproject.mappers.ProjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.petproject.repository.ProjectRepository;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<ProjectDTO> getAllProjects() {
        return projectRepository.findAll().stream()
                .map(ProjectMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ProjectDTO getProjectById(Long id) {
        return projectRepository.findById(id)
                .map(ProjectMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Project not found with id " + id));
    }

    public ProjectDTO createProject(ProjectDTO projectDTO) {
        Project project = ProjectMapper.toEntity(projectDTO);
        Project savedProject = projectRepository.save(project);
        return ProjectMapper.toDTO(savedProject);
    }

    public ProjectDTO updateProject(Long id, ProjectDTO projectDTO) {
        return projectRepository.findById(id).map(project -> {
            project.setName(projectDTO.getName());
            Project updatedProject = projectRepository.save(project);
            return ProjectMapper.toDTO(updatedProject);
        }).orElseThrow(() -> new RuntimeException("Project not found with id " + id));
    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}