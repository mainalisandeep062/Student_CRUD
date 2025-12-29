package com.texas.springboot.student_rest.Repo;

import com.texas.springboot.student_rest.Models.Student;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Page<Student> findByActiveTrue(SpringDataWebProperties.Pageable pageable);
}

