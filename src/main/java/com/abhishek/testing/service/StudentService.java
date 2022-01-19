package com.abhishek.testing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.testing.entity.Student;
import com.abhishek.testing.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentrepo;
	
	public Student createNewStudent(Student student) {
		Student tempSt = studentrepo.save(student);		
		return tempSt;
	}

}
