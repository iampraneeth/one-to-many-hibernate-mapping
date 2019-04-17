package com.capgemini.onetomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onetomany.dao.EmployeeDao;
import com.capgemini.onetomany.employee.Certificates;
import com.capgemini.onetomany.employee.Employee;

@RestController
public class OneToManyController {

	@Autowired
	private EmployeeDao dao;

	@RequestMapping("/")
	public void toSend() {
		Set<Certificates> certificates = new HashSet<Certificates>();
		Certificates c1=new Certificates(101,"c");
		Certificates c2=new Certificates(102,"python");
		certificates.add(c1);
		certificates.add(c2);
		Employee employee = new Employee(1, "ram", certificates);
		dao.save(employee);

	}
	@RequestMapping("/get")
	public Employee toGet() {
		Employee employee= dao.findById(1).get();
		return employee;
		
	}
}
