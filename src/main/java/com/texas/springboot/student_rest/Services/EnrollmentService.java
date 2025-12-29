package com.texas.springboot.student_rest.Services;

import com.texas.springboot.student_rest.DTO.EnrollmentDto.EnrollmentRequestDTO;

public interface EnrollmentService {
    void enroll(EnrollmentRequestDTO dto);
}


