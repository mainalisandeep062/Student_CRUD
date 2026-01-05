package com.texas.springboot.student_rest.Service.impl;

import com.texas.springboot.student_rest.DTO.EnrollmentDTO;
import com.texas.springboot.student_rest.Models.Enrollment;
import com.texas.springboot.student_rest.Repo.*;
import com.texas.springboot.student_rest.Services.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class EnrollmentServiceImpl implements EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public void enroll(EnrollmentDTO dto) {
        Enrollment enrollment = new Enrollment();
        enrollment.setStudent(studentRepository.findById(dto.getStudent().getStdId()).orElseThrow());
        enrollment.setCourse(courseRepository.findById(dto.getCourse().getCourseId()).orElseThrow());
        enrollment.setSemester(dto.getSemester());
        enrollment.setGrade(dto.getGrade());
        enrollmentRepository.save(enrollment);
    }
}