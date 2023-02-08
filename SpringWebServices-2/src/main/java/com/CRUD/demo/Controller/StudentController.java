package com.CRUD.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.demo.Entity.Student;
import com.CRUD.demo.Service.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
IStudentService studentService;
	
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		return new ResponseEntity<Student>(studentService.addStudent(student),HttpStatus.CREATED);
				}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getAllStudents(){
		return new ResponseEntity<List<Student>>(studentService.getAllStudents(),HttpStatus.FOUND);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Integer id){
		return new ResponseEntity<Student>(studentService.getStudents(id),HttpStatus.FOUND);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody Student student)
	{
		String msg=studentService.updateStudents(student);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
	
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id)
	{
		String msg=studentService.deleteStudents(id);
			return new ResponseEntity<String>(msg,HttpStatus.OK);
	
	}
	
}
