package com.example.petproject;
import com.example.petproject.dto.ProjectDTO;
import com.example.petproject.service.ProjectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class PetProjectApplicationTests {

    @Autowired
    private ProjectService projectService;

    @Test
    void testGetProjectById() {
        final long A1 = 0;
        ProjectDTO project = projectService.getProjectById(A1);
        assertNotNull(project);
    }
}
