package com.texas.springboot.student_rest.Services;

import com.texas.springboot.student_rest.DTO.StudentDTO.StudentRequestDTO;
import com.texas.springboot.student_rest.DTO.StudentDTO.StudentResponseDTO;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;

public interface StudentService {
    StudentResponseDTO create(StudentRequestDTO dto);
    Page<StudentResponseDTO> getAll(SpringDataWebProperties.Pageable pageable);
    void deactivate(Long id);
}

