package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getStudent")
    public List<Student> getStudent(){
    	return studentService.getStudents();
    }
	
	@GetMapping("get/{id}")
	public Student getStudent(@RequestParam int studentId) {
		 return studentService.getStudent(studentId);
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	
   
    

}
