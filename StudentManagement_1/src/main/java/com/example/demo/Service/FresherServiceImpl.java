package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepo;
import com.example.demo.entity.Student;

@Service
public class FresherServiceImpl implements StudentService {
	@Autowired
	StudentRepo sr;
	@Override
	public void addStudent(Student s) {
		s.setNoOfMocks(20);
		s.setFees(27000);
		s.setInternship(true);
		sr.save(s);
	}

}
