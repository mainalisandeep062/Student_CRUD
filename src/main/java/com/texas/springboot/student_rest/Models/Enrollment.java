package com.texas.springboot.student_rest.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Enrollment", uniqueConstraints ={
        @UniqueConstraint(columnNames = "enroll_id", name = "uk_enroll_id")
})
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enroll_id")
    private Long id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Course course;


    private String semester;

    private String grade;
}
