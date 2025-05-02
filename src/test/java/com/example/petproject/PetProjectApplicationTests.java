package com.example.petproject;
import com.example.petproject.dto.ProjectDto;
import com.example.petproject.service.ProjectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class PetProjectApplicationTests {

    @Autowired
    private ProjectService projectService;

}
