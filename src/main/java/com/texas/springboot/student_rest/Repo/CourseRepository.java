package com.texas.springboot.student_rest.Repo;

import com.texas.springboot.student_rest.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {}

