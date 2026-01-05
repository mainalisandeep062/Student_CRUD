package com.texas.springboot.student_rest.Mapper;

import com.texas.springboot.student_rest.DTO.CourseDTO;
import com.texas.springboot.student_rest.DTO.DepartmentDTO;
import com.texas.springboot.student_rest.Models.Course;
import com.texas.springboot.student_rest.Models.Department;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {
    public Course toCourse(CourseDTO courseDTO){
        if (courseDTO == null){
            return null;
        }
        Course course = new Course();
        Department department = new Department();
        course.setCourseId(courseDTO.getCourseId());
        course.setCode(courseDTO.getCode());
        course.setName(courseDTO.getName());
        course.setCredits(courseDTO.getCredits());
        if(courseDTO.getDepartment() != null){
            department.setDeptId(courseDTO.getDepartment().getDeptId());
            department.setDeptName(courseDTO.getDepartment().getDeptName());
        }
        course.setDepartment(department);
        return course;
    }

    public  CourseDTO toCourseDTO(Course course){
        if (course == null){
            return null;
        }
        CourseDTO courseDTO = new CourseDTO();
        DepartmentDTO departmentDTO = new DepartmentDTO();
        courseDTO.setCourseId(course.getCourseId());
        courseDTO.setCode(course.getCode());
        courseDTO.setName(course.getName());
        courseDTO.setCredits(course.getCredits());
        if(course.getDepartment() != null){
            departmentDTO.setDeptId(course.getDepartment().getDeptId());
            departmentDTO.setDeptName(course.getDepartment().getDeptName());
        }
        courseDTO.setDepartment(departmentDTO);
        return  courseDTO;
    }
}
