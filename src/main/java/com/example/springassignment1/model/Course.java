package com.example.springassignment1.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Course {
    private Long id;

    @NotBlank(message = "Course name cannot be blank")
    private String name;

    @NotBlank(message = "Course level is required (e.g. Foundation, Undergraduate, Honours)")
    private String level;
}

