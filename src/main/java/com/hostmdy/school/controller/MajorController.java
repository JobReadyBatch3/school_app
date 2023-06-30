package com.hostmdy.school.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hostmdy.school.entity.Major;
import com.hostmdy.school.service.MajorService;

@Controller
public class MajorController {
	
	private final MajorService majorService;

	public MajorController(MajorService majorService) {
		super();
		this.majorService = majorService;
	}
	
	@GetMapping("/major")
	public String showAllMajor(Model model) {
		List<Major> majors = majorService.getAllMajor();
		
		model.addAttribute("majors", majors);
		
		return "major-list";
	}
	
	@GetMapping("/major/{id}")
	public String showMajorStudents(Model model,@PathVariable Long id) {
		Major major = majorService.getMajorById(id);
		
		model.addAttribute("major",major);
		
		return "major-student-list";
	}
}
