package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepo;
import com.example.demo.entity.Student;

@Service
@Primary
public class ExperienceServiceImpl implements StudentService {

	@Autowired
	StudentRepo sr;
	@Override
	public void addStudent(Student s) {
		s.setFees(75000);
		s.setNoOfMocks(40);
		s.setInternship(false);
		
	}

}
