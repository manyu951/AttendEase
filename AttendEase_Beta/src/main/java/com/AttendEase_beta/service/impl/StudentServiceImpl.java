package com.AttendEase_beta.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.AttendEase_beta.model.Student;
import com.AttendEase_beta.repository.StudentRepository;
import com.AttendEase_beta.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student create(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Integer regno) {
		// TODO Auto-generated method stub
		return studentRepository.findById(regno).get();
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public String deleteStudent(Integer regno) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(regno);
		return "deleted";
	}
	

}
