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
        c1.setName("Introduction to Programming Concepts");
        c1.setLevel("Foundation");

        Course c2 = new Course();
        c2.setName("Computer Literacy for Science");
        c2.setLevel("Foundation");

        Course c3 = new Course();
        c3.setName("Data Structures and Algorithms");
        c3.setLevel("Undergraduate");

        Course c4 = new Course();
        c4.setName("Operating Systems");
        c4.setLevel("Undergraduate");

        Course c5 = new Course();
        c5.setName("Database Management and Design");
        c5.setLevel("Undergraduate");

        Course c6 = new Course();
        c6.setName("Introduction to Computer Networks");
        c6.setLevel("Undergraduate");

        Course c7 = new Course();
        c7.setName("Software Engineering");
        c7.setLevel("Undergraduate");

        Course c8 = new Course();
        c8.setName("Advanced Java");
        c8.setLevel("Honours");

        Course c9 = new Course();
        c9.setName("Intelligent Systems");
        c9.setLevel("Honors");

        Course c10 = new Course();
        c10.setName("Theory of Computing");
        c10.setLevel("Honors");

        Course c11 = new Course();
        c11.setName("Computer Graphics");
        c11.setLevel("Honors");

        controller.addCourse(c1);
        controller.addCourse(c2);
        controller.addCourse(c3);
        controller.addCourse(c4);
        controller.addCourse(c5);
        controller.addCourse(c6);
        controller.addCourse(c7);
        controller.addCourse(c8);
        controller.addCourse(c9);
        controller.addCourse(c10);
        controller.addCourse(c11);

        System.out.println("📦 Sample courses loaded!");
    }
}

