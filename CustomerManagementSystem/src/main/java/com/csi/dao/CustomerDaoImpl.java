package com.csi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.csi.model.Customer;

public class CustomerDaoImpl implements CustomerDAOInterface {
	Connection connection = null;

	public CustomerDaoImpl() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/custdb", "root", "root");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void signUp(Customer customer) {
		// TODO Auto-generated method stub
		String mysqlinsertquery = "insert into custtable(custId,custName,custAddress,custSalary,custEmailId,custContactNo,custDOb)values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(mysqlinsertquery);
			preparedStatement.setInt(1, customer.getCustId());
			preparedStatement.setString(2, customer.getCustName());
			preparedStatement.setString(3, customer.getCustAddress());
			preparedStatement.setDouble(4, customer.getCustSalary());
			preparedStatement.setString(5, customer.getCustEmailId());
			preparedStatement.setLong(6, customer.getCustContactNo());
			preparedStatement.setDate(7, customer.getCustDOB());

			preparedStatement.executeUpdate();

			System.out.println("Signup successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
