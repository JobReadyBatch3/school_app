package com.hostmdy.school.service;

import java.util.List;

import com.hostmdy.school.entity.Major;

public interface MajorService {
	
	Major saveMajor(Major major);
	
	List<Major> getAllMajor();
	
	Major getMajorById(Long id);

}
