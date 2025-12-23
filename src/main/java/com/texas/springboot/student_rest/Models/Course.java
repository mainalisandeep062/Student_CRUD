package com.texas.springboot.student_rest.Models;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Course", uniqueConstraints = {
        @UniqueConstraint(columnNames = "course_id", name = "uk_course_id")
})
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long courseId;

    @Column(unique = true, nullable = false)
    private String code;

    @Column(name = "course_name", nullable = false)
    private String name;

    @Column(name = "credits", nullable = false)
    private int credits;

    @ManyToOne
    private Department department;
}