package com.capgemini.onetomany.employee;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	private int employeeId;
	private String employeeName;
	@OneToMany( cascade = CascadeType.ALL)

	private Set<Certificates> certificates;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, Set<Certificates> certificates) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.certificates = certificates;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Set<Certificates> getCertificates() {
		return certificates;
	}

	public void setCertificates(Set<Certificates> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", certificates="
				+ certificates + "]";
	}

	

}
