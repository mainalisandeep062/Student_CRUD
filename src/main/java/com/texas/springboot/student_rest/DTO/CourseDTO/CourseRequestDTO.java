package com.texas.springboot.student_rest.DTO.CourseDTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CourseRequestDTO {
    @NotBlank(message = "Course code must not be blank")
    private String code;

    @NotBlank(message = "Course name must not be blank")
    private String name;

    private int credits;
    private Long departmentId;
}
