package com.texas.springboot.student_rest.Service.impl;

import com.texas.springboot.student_rest.DTO.DepartmentDTO;
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

    public DepartmentDTO create(DepartmentDTO dto) {
        return mapper.toDepartmentDTO(repository.save(mapper.toDepartment(dto)));
    }

    public List<DepartmentDTO> getAll() {
        return repository.findAll().stream().map(mapper::toDepartmentDTO).toList();
    }
}

