package com.texas.springboot.student_rest.Models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Students", uniqueConstraints = {
        @UniqueConstraint(columnNames = "std_id", name = "uk_std_id")
})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "std_id")
    private Long id;

    @Column(name = "std_name")
    private String name;

    @Column(name = "std_email")
    private String email;

    @Column(name = "enrollment_number", unique = true)
    private String enrollmentNumber;

    @Column(name = "age")
    private Integer age;

    @Column(name = "status")
    private boolean active;

    @Column(name = "gender")
    private String gender;

    private LocalDateTime createdAt;

}
