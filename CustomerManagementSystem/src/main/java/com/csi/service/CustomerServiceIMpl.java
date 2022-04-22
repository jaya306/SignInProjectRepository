package com.csi.service;

import com.csi.dao.CustomerDAOInterface;
import com.csi.dao.CustomerDaoImpl;
import com.csi.model.Customer;

public class CustomerServiceIMpl implements CustomerServiceInterface {

	CustomerDAOInterface customerDAOInterface=new CustomerDaoImpl();
	



	@Override
	public void signUp(Customer customer) {
		// TODO Auto-generated method stub
		customerDAOInterface.signUp(customer);
	}}
