package com.texas.springboot.student_rest.DTO.DepartmentDTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DepartmentResponseDTO {
    private Long deptId;
    private String deptName;
}
