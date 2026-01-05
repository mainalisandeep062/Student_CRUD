package com.texas.springboot.student_rest.Mapper;

import com.texas.springboot.student_rest.DTO.StudentDTO;
import com.texas.springboot.student_rest.Models.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public Student toEntity(StudentDTO dto) {
        if (dto == null) return null;
        Student s = new Student();
        s.setStdId(dto.getStdId());
        s.setName(dto.getName());
        s.setEmail(dto.getEmail());
        s.setEnrollmentNumber(dto.getEnrollmentNumber());
        s.setAge(dto.getAge());
        if (dto.getActive() != null) s.setActive(dto.getActive());
        s.setGender(dto.getGender());
        s.setCreatedAt(dto.getCreatedAt());
        return s;
    }

    public StudentDTO toDto(Student s) {
        if (s == null) return null;
        StudentDTO dto = new StudentDTO();
        dto.setStdId(s.getStdId());
        dto.setName(s.getName());
        dto.setEmail(s.getEmail());
        dto.setEnrollmentNumber(s.getEnrollmentNumber());
        dto.setAge(s.getAge());
        dto.setActive(s.isActive());
        dto.setGender(s.getGender());
        dto.setCreatedAt(s.getCreatedAt());
        return dto;
    }
}