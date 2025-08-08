package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Service.StudentService;
import com.example.demo.entity.Student;

@RestController
public class StudentController {
	@Autowired
	@Qualifier("studentServiceImpl")
	StudentService ss;
	
	@Autowired
	@Qualifier("experienceServiceImpl")
	StudentService sss;
	
	
@PostMapping("Student")
	String addStudent(@RequestBody Student s) {
	if(s.getType().equals("stu"))
		 ss.saveStudent(s);
	
	if(s.getType().equals("Expe"))
	
		ss.saveStudent(s);
		return "student added";
		
		
		
	}

}
