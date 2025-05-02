package com.example.petproject.dto;

import com.example.petproject.enums.LogTaskStatus;
import lombok.Data;

@Data
public class LogTask {
    private String id;
    private LogTaskStatus status;
    private String filePath;
    private String error;
}
