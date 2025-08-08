package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Repo.StudentRepo;
import com.example.demo.entity.Student;
@Service

public class ExperienceServiceImpl implements StudentService{
	@Autowired
StudentRepo sr;
	@Override
	public void saveStudent(Student s) {
		s.setFees(75000);
		s.setNoOfMocks(40);
		sr.save(s);
	
		
	}

}
