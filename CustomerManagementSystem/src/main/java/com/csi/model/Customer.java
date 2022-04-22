package com.csi.model;

import java.sql.Date;

public class Customer {

	private int custId;
	private String custName;
	private String custAddress;
	private double custSalary;
	private String custEmailId;
	private long custContactNo;
	
	private Date custDOB;
	public Date getCustDOB() {
		return custDOB;
	}
	public void setCustDOB(Date custDOB) {
		this.custDOB = custDOB;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public Customer(int custId, String custName, String custAddress, double custSalary, String custEmailId,
			long custContactNo,Date custDOB) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custSalary = custSalary;
		this.custEmailId = custEmailId;
		this.custContactNo = custContactNo;
		this.custDOB=custDOB;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public double getCustSalary() {
		return custSalary;
	}
	public void setCustSalary(double custSalary) {
		this.custSalary = custSalary;
	}
	public String getCustEmailId() {
		return custEmailId;
	}
	public void setCustEmailId(String custEmailId) {
		this.custEmailId = custEmailId;
	}
	public long getCustContactNo() {
		return custContactNo;
	}
	public void setCustContactNo(long custContactNo) {
		this.custContactNo = custContactNo;
	}
	
	
}
