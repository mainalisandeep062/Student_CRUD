package com.texas.springboot.student_rest.DTO.EnrollmentDto;

import lombok.Data;

@Data
public class EnrollmentRequestDTO {
    private Long studentId;
    private Long courseId;
    private String Semester;
}
