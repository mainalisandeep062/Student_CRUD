package com.texas.springboot.student_rest.Services;

import com.texas.springboot.student_rest.DTO.CourseDTO;

import java.util.List;

public interface CourseService {
    CourseDTO create(CourseDTO dto);
    List<CourseDTO> getAll();
}

