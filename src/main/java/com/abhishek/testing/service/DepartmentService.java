package com.abhishek.testing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.testing.entity.Department;
import com.abhishek.testing.entity.Student;
import com.abhishek.testing.repository.DepartmentRepository;
import com.abhishek.testing.repository.StudentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentrepo;
	
	public Department createDepartment(Department department) {
		Department tempSt = departmentrepo.save(department);		
		return tempSt;
	}
}
