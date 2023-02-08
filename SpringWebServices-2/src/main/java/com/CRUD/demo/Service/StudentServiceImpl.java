package com.CRUD.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUD.demo.Entity.Student;
import com.CRUD.demo.Repository.StudentRepo;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
StudentRepo srepo;
	@Override
	public Student addStudent(Student student) {
		return srepo.save(student);		 
	}
	@Override
	public List<Student> getAllStudents() {
				return srepo.findAll();
	}
	@Override
	public Student getStudents(Integer id) {
		return srepo.findById(id).get();
	}
	@Override
	public String updateStudents(Student student) {
		
		 if(srepo.save(student)!=null)
				 return "Student with ID "+student.getStudID()+" Updated";
		 
		 return "Something went wrong!";
	}
	@Override
	public String deleteStudents(Integer id) {
	if(srepo.deleteByID(id)!=0)
		return "Student "+id+" deleted!";
	
	return "Something went wrong!!";
	}

}
