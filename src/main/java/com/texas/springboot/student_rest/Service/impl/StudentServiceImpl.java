package com.texas.springboot.student_rest.Service.impl;

import com.texas.springboot.student_rest.DTO.StudentDTO.StudentRequestDTO;
import com.texas.springboot.student_rest.DTO.StudentDTO.StudentResponseDTO;
import com.texas.springboot.student_rest.Mapper.StudentMapper;
import com.texas.springboot.student_rest.Models.Student;
import com.texas.springboot.student_rest.Repo.StudentRepository;
import com.texas.springboot.student_rest.Services.StudentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    private final StudentMapper mapper;

    public StudentResponseDTO create(StudentRequestDTO dto) {
        Student student = mapper.toEntity(dto);
        student.setActive(true);
        student.setCreatedAt(LocalDateTime.now());
        return mapper.toDto(repository.save(student));
    }

    public Page<StudentResponseDTO> getAll(SpringDataWebProperties.Pageable pageable) {
        return repository.findByActiveTrue(pageable).map(mapper::toDto);
    }

    public void deactivate(Long id) {
        Student student = repository.findById(id).orElseThrow();
        student.setActive(false);
    }
}

