package com.texas.springboot.student_rest.DTO;

import lombok.Data;

@Data
public class CourseDTO {
    private Long courseId;
    private String code;
    private String name;
    private int credits;
    private DepartmentDTO department;

    public Long getDeptId() {
        return department.getDeptId();
    }
}
