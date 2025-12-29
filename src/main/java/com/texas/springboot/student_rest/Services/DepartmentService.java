package com.texas.springboot.student_rest.Services;

import com.texas.springboot.student_rest.DTO.DepartmentDTO.DepartmentRequestDTO;
import com.texas.springboot.student_rest.DTO.DepartmentDTO.DepartmentResponseDTO;

import java.util.List;

public interface DepartmentService {
    DepartmentResponseDTO create(DepartmentRequestDTO dto);
    List<DepartmentResponseDTO> getAll();
}

