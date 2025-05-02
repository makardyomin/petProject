package com.example.petproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class PetProjectApplication {
    public static void main(final String[] args) {
        SpringApplication.run(PetProjectApplication.class, args);
        log.info("Приложение запущено!");
    }
}
