package com.hostmdy.school.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/create")
	public String showStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "add-student";
	}
	
	@PostMapping("/create")
	public String createStudent(@ModelAttribute(name = "student") Student student) {
		Student createdStudent = studentService.saveStudent(student);
		
		return "redirect:/student";
	}
	
	@GetMapping("/student/{id}")
	public String loadStudent(Model model,@PathVariable(name = "id") Long studentId) {
		Student student = studentService.getStudent(studentId);
		model.addAttribute("student",student);
		return "add-student";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
		
		return "redirect:/student";
	}
}
