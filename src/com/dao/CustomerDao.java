package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.Customer;

import util.DatabaseUtil;

public class CustomerDao {
	Connection con=null;
	ResultSet result=null;
	public boolean addCustomer(Customer cust, PreparedStatement ps) throws SQLException, ClassNotFoundException
	{
		//Login to insert the customer details to database using JDBC connection
		boolean flag=false;
		con=DatabaseUtil.getConnection();
		ps=con.prepareStatement("insert into Customer_2020(CUSTOMERID,FIRSTNAME,LASTNAME,DOB,GENDER,CITY,COUNTRY,EMAIL,ANNUAL_SALARY) values(custSeq.nextval,?,?,?,?,?,?,?,?)");
	ps.setString(1,cust.getFirstName());
	ps.setString(2,cust.getLastName());
	ps.setDate(3, new java.sql.Date(cust.getDob().getTime()));
	ps.setString(4,cust.getGender());
	ps.setString(5,cust.getCity());
	ps.setString(6, cust.getCountry());
	ps.setString(7,cust.getEmail());
	ps.setDouble(8,cust.getAnnual_salary());
	
	int rowstatus=ps.executeUpdate();
	DatabaseUtil.closeConnection(con);
	DatabaseUtil.closeStatement(ps);
	if(rowstatus>0)
	{
		return true;
	}
	return flag;
	}
	
}

