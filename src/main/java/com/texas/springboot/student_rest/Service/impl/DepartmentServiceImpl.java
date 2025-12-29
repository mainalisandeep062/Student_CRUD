package com.texas.springboot.student_rest.Service.impl;

import com.texas.springboot.student_rest.DTO.DepartmentDTO.DepartmentRequestDTO;
import com.texas.springboot.student_rest.DTO.DepartmentDTO.DepartmentResponseDTO;
import com.texas.springboot.student_rest.Mapper.DepartmentMapper;
import com.texas.springboot.student_rest.Repo.DepartmentRepository;
import com.texas.springboot.student_rest.Services.DepartmentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repository;
    private final DepartmentMapper mapper;

    public DepartmentResponseDTO create(DepartmentRequestDTO dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public List<DepartmentResponseDTO> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }
}

