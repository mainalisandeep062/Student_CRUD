package com.texas.springboot.student_rest.Models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Table(name = "Department",uniqueConstraints = {
        @UniqueConstraint(columnNames = "dept_id", name = "uk_dept_id")
})
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptId;

    @Column(name = "dept_name")
    private String deptName;
}
