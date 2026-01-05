package com.texas.springboot.student_rest.Services;

import com.texas.springboot.student_rest.DTO.StudentDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface StudentService {
    StudentDTO create(StudentDTO dto);
    List<StudentDTO> createBatch(List<StudentDTO> dtos);
    Page<StudentDTO> getAll(Pageable pageable);
    void deactivate(Long id);
}