package com.texas.springboot.student_rest.DTO.DepartmentDTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DepartmentRequestDTO {
    @NotBlank(message = "Department name must not be blank")
    private String deptName;
}
