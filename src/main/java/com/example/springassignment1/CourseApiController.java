package com.example.springassignment1;

import com.example.springassignment1.model.Course;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

        import java.util.*;

@RestController
@RequestMapping("/api/courses")
public class CourseApiController {

    private final Map<Long,Course> courseMap = new HashMap<>();
    private long idCounter = 1;

    @PostMapping
    public ResponseEntity<String> createCourse(@Valid @RequestBody Course course) {
        course.setId(idCounter++);
        courseMap.put(course.getId(), course);
        return ResponseEntity.ok("Course created with ID: " + course.getId());
    }

    @GetMapping
    public Collection<Course> getAllCourses() {
        return courseMap.values();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        Course course = courseMap.get(id);
        return course != null ? ResponseEntity.ok(course) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCourse(@PathVariable Long id, @Valid @RequestBody Course updatedCourse) {
        if (courseMap.containsKey(id)) {
            updatedCourse.setId(id);
            courseMap.put(id, updatedCourse);
            return ResponseEntity.ok("Course updated.");
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable Long id) {
        return courseMap.remove(id) != null ?
                ResponseEntity.ok("Course deleted.") :
                ResponseEntity.notFound().build();
    }
}

