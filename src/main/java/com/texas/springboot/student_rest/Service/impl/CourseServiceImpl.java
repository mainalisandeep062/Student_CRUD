package com.texas.springboot.student_rest.Service.impl;

import com.texas.springboot.student_rest.DTO.CourseDTO.CourseRequestDTO;
import com.texas.springboot.student_rest.DTO.CourseDTO.CourseResponseDTO;
import com.texas.springboot.student_rest.Mapper.CourseMapper;
import com.texas.springboot.student_rest.Models.Course;
import com.texas.springboot.student_rest.Repo.CourseRepository;
import com.texas.springboot.student_rest.Repo.DepartmentRepository;
import com.texas.springboot.student_rest.Services.CourseService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;
    private final DepartmentRepository departmentRepository;
    private final CourseMapper mapper;

    public CourseResponseDTO create(CourseRequestDTO dto) {
        Course course = mapper.toEntity(dto);
        course.setDepartment(
                departmentRepository.findById(dto.getDepartmentId()).orElseThrow()
        );
        return mapper.toDto(repository.save(course));
    }

    public List<CourseResponseDTO> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }
}

