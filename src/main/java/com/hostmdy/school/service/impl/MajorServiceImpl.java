package com.hostmdy.school.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hostmdy.school.dao.MajorDAO;
import com.hostmdy.school.entity.Major;
import com.hostmdy.school.service.MajorService;

@Service
public class MajorServiceImpl implements MajorService{
	
	private final MajorDAO majorDAO;

	public MajorServiceImpl(MajorDAO majorDAO) {
		super();
		this.majorDAO = majorDAO;
	}

	@Override
	public Major saveMajor(Major major) {
		// TODO Auto-generated method stub
		return majorDAO.save(major);
	}

	@Override
	public List<Major> getAllMajor() {
		// TODO Auto-generated method stub
		return (List<Major>) majorDAO.findAll();
	}

	@Override
	public Major getMajorById(Long id) {
		// TODO Auto-generated method stub
		return majorDAO.findById(id).get();
	}
	
	
	

}
