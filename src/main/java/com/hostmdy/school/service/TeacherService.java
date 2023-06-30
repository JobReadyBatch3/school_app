package com.hostmdy.school.service;

import java.util.List;

import com.hostmdy.school.entity.Teacher;

public interface TeacherService{
	
	Teacher saveTeacher(Teacher teacher);
	
	List<Teacher> getAllTeachers();
	
	Teacher getTeacherById(Long id);
}
