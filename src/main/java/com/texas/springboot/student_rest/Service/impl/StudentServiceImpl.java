package com.texas.springboot.student_rest.Service.impl;

import com.texas.springboot.student_rest.DTO.StudentDTO;
import com.texas.springboot.student_rest.Mapper.StudentMapper;
import com.texas.springboot.student_rest.Models.Student;
import com.texas.springboot.student_rest.Repo.StudentRepository;
import com.texas.springboot.student_rest.Services.StudentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    private final StudentMapper mapper;

    @Override
    public StudentDTO create(StudentDTO dto) {
        Student student = mapper.toEntity(dto);
        student.setActive(true);
        student.setCreatedAt(LocalDateTime.now());
        return mapper.toDto(repository.save(student));
    }

    @Override
    public List<StudentDTO> createBatch(List<StudentDTO> dtos) {
        return dtos.stream().map(dto -> {
            Student student = mapper.toEntity(dto);
            student.setActive(true);
            student.setCreatedAt(LocalDateTime.now());
            return mapper.toDto(repository.save(student));
        }).collect(Collectors.toList());
    }

    @Override
    public Page<StudentDTO> getAll(Pageable pageable) {
        return repository.findByActiveTrue(pageable).map(mapper::toDto);
    }

    @Override
    public void deactivate(Long id) {
        Student student = repository.findById(id).orElseThrow();
        student.setActive(false);
    }
}
