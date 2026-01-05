package com.texas.springboot.student_rest.Controller;

import com.texas.springboot.student_rest.DTO.EnrollmentDTO;
import com.texas.springboot.student_rest.Services.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enrollments")
@RequiredArgsConstructor
public class EnrollmentController {
    private final EnrollmentService service;

    @PostMapping
    public void enroll(@RequestBody EnrollmentDTO dto) { service.enroll(dto); }
}