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

    @Column(unique = true)
    private String code;

    private String name;

    private int credits;

    @ManyToOne
    private Department department;
}