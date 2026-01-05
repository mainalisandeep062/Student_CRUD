package com.texas.springboot.student_rest.Mapper;

import com.texas.springboot.student_rest.DTO.DepartmentDTO;
import com.texas.springboot.student_rest.Models.Department;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMapper {
    public Department toDepartment(DepartmentDTO departmentDTO) {
        if (departmentDTO == null) {
            return null;
        }
        Department department = new Department();
        department.setDeptId(departmentDTO.getDeptId());
        department.setDeptName(departmentDTO.getDeptName());
        return department;
    }

    public DepartmentDTO toDepartmentDTO(Department department) {
        if (department == null) {
            return null;
        }
        DepartmentDTO departmentDTO = new DepartmentDTO();
        departmentDTO.setDeptId(department.getDeptId());
        departmentDTO.setDeptName(department.getDeptName());
        return departmentDTO;
    }
}

