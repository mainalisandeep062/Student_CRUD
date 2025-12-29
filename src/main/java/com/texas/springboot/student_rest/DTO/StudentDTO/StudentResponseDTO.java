package com.texas.springboot.student_rest.DTO.StudentDTO;

import lombok.Data;

@Data
public class StudentResponseDTO {
    private Long studentId;
    private String name;
    private String email;
    private String enrollmentNumber;
    private int age;
    private String gender;
}

