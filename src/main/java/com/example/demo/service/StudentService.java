package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	public List<Student> getStudents();

	public Student getStudent(int studentId);

	public Student addStudent(Student student);

	
	


	
	

}
