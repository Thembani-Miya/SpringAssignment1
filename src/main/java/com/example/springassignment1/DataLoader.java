package com.example.springassignment1;

import com.example.springassignment1.model.Course;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    private final CourseApiController controller;

    public DataLoader(CourseApiController controller) {
        this.controller = controller;
    }

    @PostConstruct
    public void init() {
        Course c1 = new Course();
        c1.setName("Introduction to Programming");
        c1.setLevel("Foundation");

        Course c2 = new Course();
        c2.setName("Data Structures");
        c2.setLevel("Undergraduate");

        Course c3 = new Course();
        c3.setName("Machine Learning");
        c3.setLevel("Honours");

        controller.addCourse(c1);
        controller.addCourse(c2);
        controller.addCourse(c3);

        System.out.println("📦 Sample courses loaded!");
    }
}

