package com.hostmdy.school.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hostmdy.school.entity.Major;
import com.hostmdy.school.entity.Teacher;
import com.hostmdy.school.service.TeacherService;

@Controller
public class TeacherController {
	
	private final TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		super();
		this.teacherService = teacherService;
	}
	
	@GetMapping("/teacher")
	public String showAllTeacher(Model model) {
		List<Teacher> teachers = teacherService.getAllTeachers();
		
		model.addAttribute("teachers", teachers);
		
		return "teacher-list";
	}
	
	@GetMapping("/teacher/{id}")
	public String showTeacherStudents(Model model,@PathVariable Long id) {
		Teacher teacher = teacherService.getTeacherById(id);
		
		model.addAttribute("teacher",teacher);
		
		return "teacher-student-list";
	}

}
