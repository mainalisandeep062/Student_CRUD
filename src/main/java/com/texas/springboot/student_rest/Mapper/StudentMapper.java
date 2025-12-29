package com.texas.springboot.student_rest.Mapper;

import com.texas.springboot.student_rest.DTO.StudentDTO.StudentRequestDTO;
import com.texas.springboot.student_rest.DTO.StudentDTO.StudentResponseDTO;
import com.texas.springboot.student_rest.Models.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    Student toEntity(StudentRequestDTO dto);
    StudentResponseDTO toDto(Student entity);
}

