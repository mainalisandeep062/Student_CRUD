package com.texas.springboot.student_rest.Service.impl;

import com.texas.springboot.student_rest.DTO.EnrollmentDto.EnrollmentRequestDTO;
import com.texas.springboot.student_rest.Models.Enrollment;
import com.texas.springboot.student_rest.Repo.CourseRepository;
import com.texas.springboot.student_rest.Repo.EnrollmentRepository;
import com.texas.springboot.student_rest.Repo.StudentRepository;
import com.texas.springboot.student_rest.Services.EnrollmentService;
import jakarta.transaction.Transactional;
import lombok.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public void enroll(EnrollmentRequestDTO dto) {
        Enrollment enrollment = new Enrollment(); // empty object
        enrollment.setStudent(studentRepository.findById(dto.getStudentId()).orElseThrow());
        enrollment.setCourse(courseRepository.findById(dto.getCourseId()).orElseThrow());
        enrollment.setSemester(dto.getSemester());

        enrollmentRepository.save(enrollment);
    }

}


