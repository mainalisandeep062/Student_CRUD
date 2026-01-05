package com.texas.springboot.student_rest.Controller;

import com.texas.springboot.student_rest.DTO.StudentDTO;
import com.texas.springboot.student_rest.Services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public StudentDTO create(@RequestBody StudentDTO dto) {
        return studentService.create(dto);
    }

    // NEW ENDPOINT FOR BATCH UPLOAD
    @PostMapping("/batch")
    public List<StudentDTO> createBatch(@RequestBody List<StudentDTO> dtos) {
        return studentService.createBatch(dtos);
    }

    @GetMapping
    public Page<StudentDTO> getAll(Pageable pageable) {
        return studentService.getAll(pageable);
    }

    @DeleteMapping("/{id}")
    public void deactivate(@PathVariable Long id) {
        studentService.deactivate(id);
    }
}