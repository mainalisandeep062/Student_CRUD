package com.texas.springboot.student_rest.Services;

import com.texas.springboot.student_rest.DTO.DepartmentDTO;

import java.util.List;

public interface DepartmentService {
    DepartmentDTO create(DepartmentDTO dto);
    List<DepartmentDTO> getAll();
}

