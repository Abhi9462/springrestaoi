package com.CRUD.demo.Service;

import java.util.List;

import com.CRUD.demo.Entity.Student;

public interface IStudentService {

	public Student addStudent(Student student);

	public List<Student> getAllStudents();

	public Student getStudents(Integer id);

	public String updateStudents(Student student);

	public String deleteStudents(Integer id);
	
	}

