package com.wsiit.web.hospital.dtd;

public class Doctor {

	private int deptNo;
	

	public int getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}


	@Override
	public String toString() {
		return "Doctor [deptNo=" + deptNo + "]";
	}
}
