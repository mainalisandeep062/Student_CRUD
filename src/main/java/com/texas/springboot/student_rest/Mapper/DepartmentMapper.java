package com.texas.springboot.student_rest.Mapper;

import com.texas.springboot.student_rest.DTO.DepartmentDTO.DepartmentRequestDTO;
import com.texas.springboot.student_rest.DTO.DepartmentDTO.DepartmentResponseDTO;
import com.texas.springboot.student_rest.Models.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    Department toEntity(DepartmentRequestDTO dto);
    DepartmentResponseDTO toDto(Department entity);
}

