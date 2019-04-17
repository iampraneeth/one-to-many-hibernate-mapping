package com.capgemini.onetomany.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
//@Table(name="employee")
public class Certificates {
	@Id
	private int certificateId;
	private String certificateName;
	
	//@JoinColumn(name="employeeId")
	@ManyToOne
	private Employee employee;
	public Certificates() {
		super();
	}
	public Certificates(int certificateId, String certificateName) {
		super();
		this.certificateId = certificateId;
		this.certificateName = certificateName;
	}
	public int getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	@Override
	public String toString() {
		return "Certificates [certificateId=" + certificateId + ", certificateName=" + certificateName + ", employee="
				+ employee + "]";
	}
	

}
