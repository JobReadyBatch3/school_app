package com.hostmdy.school.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hostmdy.school.dao.TeacherDAO;
import com.hostmdy.school.entity.Teacher;
import com.hostmdy.school.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{
	
	private final TeacherDAO teacherDAO;


	public TeacherServiceImpl(TeacherDAO teacherDAO) {
		super();
		this.teacherDAO = teacherDAO;
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherDAO.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeachers() {
		// TODO Auto-generated method stub
		return (List<Teacher>) teacherDAO.findAll();
	}

	@Override
	public Teacher getTeacherById(Long id) {
		// TODO Auto-generated method stub
		return teacherDAO.findById(id).get();
	}

}
