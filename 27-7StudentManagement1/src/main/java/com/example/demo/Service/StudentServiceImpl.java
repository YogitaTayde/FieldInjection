package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.StudentRepo;
import com.example.demo.entity.Student;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo sr;

	@Override
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		s.setFees(4000);
		s.setNoOfMocks(29);
		sr.save(s);
	}
  
	

}
