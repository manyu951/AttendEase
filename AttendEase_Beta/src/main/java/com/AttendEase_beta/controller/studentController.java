package com.AttendEase_beta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AttendEase_beta.model.Student;
import com.AttendEase_beta.service.StudentService;

@RestController
@RequestMapping("/students")
public class studentController {
    
    @Autowired
    private StudentService studentService;

    @GetMapping("")
    public List<Student> getStudents(){
    	return studentService.getAllStudents();
    }
    
    @GetMapping("/regno")
    public Student getStudent(@PathVariable Integer regno) {
    	return studentService.getStudentById(regno);
    }
    
    // POST endpoint to save student data
    @PostMapping("/store")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.create(student);  // Assuming 'create' method exists in the service
    }
    
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
    	return studentService.update(student);
    }
    
    @DeleteMapping("/delete/{regno}")
    public String deleteStudent(@PathVariable Integer regno) {
    	return studentService.deleteStudent(regno);
    }

}
