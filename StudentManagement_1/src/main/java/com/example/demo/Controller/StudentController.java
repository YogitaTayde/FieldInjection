package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.entity.Student;

@RestController
public class StudentController {
	@Autowired
	StudentService sr;
	@PostMapping("Student")
	public String addStudent(@RequestBody Student s) {
		sr.addStudent(s);
		return "Student Added";
		
	}

}
