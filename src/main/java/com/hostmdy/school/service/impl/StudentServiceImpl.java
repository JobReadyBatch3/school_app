package com.hostmdy.school.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hostmdy.school.dao.StudentDAO;
import com.hostmdy.school.entity.Student;
import com.hostmdy.school.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	//Dependency Injection
	private final StudentDAO studentDAO;

	public StudentServiceImpl(StudentDAO studentDAO) {
		super();
		this.studentDAO = studentDAO;
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDAO.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return (List<Student>) studentDAO.findAll();
	}

	@Override
	public Student getStudent(Long id) {
		// TODO Auto-generated method stub
		return studentDAO.findById(id).get();
	}

	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		studentDAO.deleteById(id);
	}

}
