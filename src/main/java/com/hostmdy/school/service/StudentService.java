package com.hostmdy.school.service;

import java.util.List;

import com.hostmdy.school.entity.Student;

public interface StudentService {
	
	Student saveStudent(Student student);
	
	List<Student> getAllStudents();
	
	Student getStudent(Long id);
	
	void deleteStudent(Long id);

}
