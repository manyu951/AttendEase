package com.AttendEase_beta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.AttendEase_beta.model.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{

}
