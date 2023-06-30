package com.hostmdy.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hostmdy.school.dao.MajorDAO;
import com.hostmdy.school.dao.StudentDAO;
import com.hostmdy.school.dao.TeacherDAO;
import com.hostmdy.school.entity.Major;
import com.hostmdy.school.entity.Student;
import com.hostmdy.school.entity.Teacher;

@SpringBootApplication
public class SchoolAppApplication implements CommandLineRunner{

	@Autowired
	StudentDAO studentDAO;
	
	@Autowired
	MajorDAO majorDAO;
	
	@Autowired
	TeacherDAO teacherDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Mg","Mg","IT-1001","093762762",3);
		Student student2 = new Student("Ma","Sapal","IT-1002","093762762",5);
		Student student3 = new Student("Kyaw","Kyaw","IT-1003","097833773",2);
		Student student4 = new Student("Ma","Mya","Civil-1001","0935635256",5);
		Student student5 = new Student("Hla","Hla","Civil-1002","093556252",3);
		Student student6 = new Student("Zaw","Zaw","Civil-1003","093762762",5);
		Student student7 = new Student("Khin","Khin","EC-1001","093762762",3);
		Student student8 = new Student("Aung","Aung","EC-1002","093762762",5);
		
		Major major1 = new Major("IT","This is the major for who want to be IT technician");
		Major major2 = new Major("Civil","This is the major for who want to be Construction Engineer");
		Major major3 = new Major("EC","This is the major for who want to be Electronic Engineer");
		
		//major 1 && s1,s2,s3 associate
		major1.getStudents().add(student1);
		major1.getStudents().add(student2);
		major1.getStudents().add(student3);
		
		student1.setMajor(major1);
		student2.setMajor(major1);
		student3.setMajor(major1);
		
		majorDAO.save(major1);
		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student3);
		
		
		//major 2 && s4,s5,s6 associate
		major2.getStudents().add(student4);
		major1.getStudents().add(student5);
		major1.getStudents().add(student6);
		
		student4.setMajor(major2);
		student5.setMajor(major2);
		student6.setMajor(major2);
		
		majorDAO.save(major2);
		studentDAO.save(student4);
		studentDAO.save(student5);
		studentDAO.save(student6);
		
		
		//major 3 && s7,s8 associate
		major3.getStudents().add(student7);
		major3.getStudents().add(student8);
		
		student7.setMajor(major3);
		student8.setMajor(major3);
		
		majorDAO.save(major3);
		studentDAO.save(student7);
		studentDAO.save(student8);
		
		
		
		Teacher teacher1 = new Teacher("U Aung","IT-CS");
		Teacher teacher2 = new Teacher("Daw Kaythi","Math");
		Teacher teacher3 = new Teacher("Daw Myat","Civil");
		
		//t1 -> s1,s2,s9
		
		teacher1.getStudents().add(student1);
		teacher1.getStudents().add(student2);
		teacher1.getStudents().add(student8);
		
		student1.getTeachers().add(teacher1);
		student2.getTeachers().add(teacher1);
		student8.getTeachers().add(teacher1);
		
		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student8);
		teacherDAO.save(teacher1);
		
	//t2 -> s3,s5
		
		teacher2.getStudents().add(student1);
		teacher2.getStudents().add(student2);
		teacher2.getStudents().add(student5);
		teacher2.getStudents().add(student6);
		
		student1.getTeachers().add(teacher2);
		student2.getTeachers().add(teacher2);
		student5.getTeachers().add(teacher2);
		student6.getTeachers().add(teacher2);
		
		studentDAO.save(student1);
		studentDAO.save(student2);
		studentDAO.save(student5);
		studentDAO.save(student6);
		teacherDAO.save(teacher2);
		
		
	//t3 -> s3,s5
		
		teacher3.getStudents().add(student7);
		teacher3.getStudents().add(student1);
		teacher3.getStudents().add(student6);
		teacher3.getStudents().add(student8);
		
		student7.getTeachers().add(teacher3);
		student1.getTeachers().add(teacher3);
		student6.getTeachers().add(teacher3);
		student8.getTeachers().add(teacher3);
		
		studentDAO.save(student7);
		studentDAO.save(student1);
		studentDAO.save(student6);
		studentDAO.save(student8);
		teacherDAO.save(teacher3);
		
		
		
		
		
	}

}
