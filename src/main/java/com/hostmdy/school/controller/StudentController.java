package com.hostmdy.school.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hostmdy.school.entity.Student;
import com.hostmdy.school.service.StudentService;

@Controller
public class StudentController {
	
	private final StudentService studentService;
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	//@RequestMapping(value = "/student",method = RequestMethod.GET)
	@GetMapping("/student")
	public String showAllStudents(Model model) {
		List<Student> studentList = studentService.getAllStudents();
		model.addAttribute("studentList", studentList);
		return "student-list";
	}
	
}
