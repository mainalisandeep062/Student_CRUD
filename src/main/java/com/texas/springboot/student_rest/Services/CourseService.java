package com.texas.springboot.student_rest.Services;

import com.texas.springboot.student_rest.DTO.CourseDTO.CourseRequestDTO;
import com.texas.springboot.student_rest.DTO.CourseDTO.CourseResponseDTO;

import java.util.List;

public interface CourseService {
    CourseResponseDTO create(CourseRequestDTO dto);
    List<CourseResponseDTO> getAll();
}

