package com.example.springassignment1;

import com.example.springassignment1.model.Course;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataLoader {

    private final CourseApiController controller;

    public DataLoader(CourseApiController controller) {
        this.controller = controller;
    }

    @PostConstruct
    public void init() {
        // Creating sample courses
        Course c1 = new Course();
        c1.setName("Computer Architecture");
        c1.setLevel("Undergraduate");

        Course c2 = new Course();
        c2.setName("Software Engineering");
        c2.setLevel("Undergraduate");

        Course c3 = new Course();
        c3.setName("Advanced Algorithms");
        c3.setLevel("Honours");

        // Add them using the controller’s method
        controller.createCourse(c1);
        controller.createCourse(c2);
        controller.createCourse(c3);
    }
}

