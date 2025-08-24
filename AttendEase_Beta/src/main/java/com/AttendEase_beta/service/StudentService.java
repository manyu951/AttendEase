package com.AttendEase_beta.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.AttendEase_beta.model.Student;

@Service
public interface StudentService {
	public Student create(Student student);
	public List<Student> getAllStudents();
	public Student getStudentById(Integer regno);
	public Student update(Student student);
	public String deleteStudent(Integer regno);
}
