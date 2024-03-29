package com.example.demo.Repositories;

import com.example.demo.Entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CoursesRepository extends JpaRepository<Courses, Long> {

    Optional<Courses> getCoursesByNumberOfCourseAndName(Long numberOfCourse, String name);
}
