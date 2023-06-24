package com.hostmdy.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hostmdy.school.dao.StudentDAO;
import com.hostmdy.school.entity.Student;

@SpringBootApplication
public class SchoolAppApplication implements CommandLineRunner{

	@Autowired
	StudentDAO studentDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Mg","Mg","IT-1001","093762762",3);
		Student student2 = new Student("Ma","Sapal","IT-1002","093762762",5);
		
		studentDAO.save(student1);
		studentDAO.save(student2);
		
	}

}
