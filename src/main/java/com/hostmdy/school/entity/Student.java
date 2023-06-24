package com.hostmdy.school.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstname;
	private String lastname;
	private String studentCode;
	private String phone;
	private Integer studentYear;
	
	public Student() {}

	public Student(String firstname, String lastname, String studentCode, String phone, Integer studentYear) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.studentCode = studentCode;
		this.phone = phone;
		this.studentYear = studentYear;
	}

	public Student(Long id, String firstname, String lastname, String studentCode, String phone, Integer studentYear) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.studentCode = studentCode;
		this.phone = phone;
		this.studentYear = studentYear;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getStudentYear() {
		return studentYear;
	}

	public void setStudentYear(Integer studentYear) {
		this.studentYear = studentYear;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", studentCode="
				+ studentCode + ", phone=" + phone + ", studentYear=" + studentYear + "]";
	}
	
}
