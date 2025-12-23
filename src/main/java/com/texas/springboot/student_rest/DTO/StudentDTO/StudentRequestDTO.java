package com.texas.springboot.student_rest.DTO.StudentDTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
public class StudentRequestDTO {

    @NotBlank(message = "Student name must not be blank")
    private String name;

    @Email(message = "Email must be a valid email address")
    @NotBlank(message = "Email must not be blank")
    private String email;

    @NotBlank(message = "Enrollment number is required")
    private String enrollmentNumber;

    @NotBlank(message = "age is required")
    private int age;

    @NotBlank(message = "gender is required")
    private String gender;
}

