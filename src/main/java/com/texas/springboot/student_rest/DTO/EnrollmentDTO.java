package com.texas.springboot.student_rest.DTO;

import lombok.Data;

@Data
public class EnrollmentDTO {
    private Long id;
    private StudentDTO student;
    private CourseDTO course;
    private String semester;
    private String grade;
}
