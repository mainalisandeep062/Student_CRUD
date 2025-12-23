package com.texas.springboot.student_rest.DTO.CourseDTO;

import lombok.Data;

@Data
public class CourseResponseDTO {
    private Long courseId;
    private String code;
    private String name;
    private int credits;
    private Long departmentId;
}

