package com.texas.springboot.student_rest.Mapper;

import com.texas.springboot.student_rest.DTO.EnrollmentDTO;
import com.texas.springboot.student_rest.Models.Enrollment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EnrollmentMapper {
    private final StudentMapper studentMapper;
    private final CourseMapper courseMapper;

    public EnrollmentDTO toDto(Enrollment enrollment) {
        if (enrollment == null) return null;
        EnrollmentDTO dto = new EnrollmentDTO();
        dto.setId(enrollment.getId());
        dto.setStudent(studentMapper.toDto(enrollment.getStudent()));
        dto.setCourse(courseMapper.toCourseDTO(enrollment.getCourse()));
        dto.setSemester(enrollment.getSemester());
        dto.setGrade(enrollment.getGrade());
        return dto;
    }
}