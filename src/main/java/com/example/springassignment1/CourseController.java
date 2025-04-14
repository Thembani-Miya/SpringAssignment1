package com.example.springassignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public Map<String, List<String>> getCourses() {
        return Map.of(
                "FoundationCourses", List.of("Introduction to Programming Concepts", "Computer Literacy for Science"),
                "UndergraduateCourses", List.of(
                        "Data Structures and Algorithms",
                        "Operating Systems",
                        "Databases Management and Design",
                        "Introduction to Computer Networks",
                        "Software Engineering"
                ),
                "HonoursCourses", List.of(
                        "Advanced Java",
                        "Intelligent Systems",
                        "Theory of Computing",
                        "Computer Graphics"
                )
        );
    }
}

