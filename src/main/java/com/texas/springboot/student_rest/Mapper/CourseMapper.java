package com.texas.springboot.student_rest.Mapper;

import com.texas.springboot.student_rest.DTO.CourseDTO.CourseRequestDTO;
import com.texas.springboot.student_rest.DTO.CourseDTO.CourseResponseDTO;
import com.texas.springboot.student_rest.Models.Course;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    @Mapping(source = "department.id", target = "departmentId")
    CourseResponseDTO toDto(Course entity);

    @Mapping(source = "departmentId", target = "department.id")
    Course toEntity(CourseRequestDTO dto);
}



