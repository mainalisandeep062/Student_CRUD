package com.texas.springboot.student_rest.DTO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StudentDTO {
    private Long stdId;
    private String name;
    private String email;
    private String enrollmentNumber;
    private Integer age;
    private Boolean active;
    private String gender;
    private LocalDateTime createdAt;
}
