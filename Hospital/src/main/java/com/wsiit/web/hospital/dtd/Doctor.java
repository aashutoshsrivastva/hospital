package com.wsiit.web.hospital.dtd;

public class Doctor {


	private int id;
	private String name;
	private String password;
	private int deptNo;
	
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", password=" + password + ", deptNo=" + deptNo + "]";
	}

	
}
