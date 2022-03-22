
package com.groceryapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.groceryapp.model.Registration;

public class RegisterInsertion {
	public static void insertUser(Registration user) throws ClassNotFoundException, SQLException
	{
		Connection connection=ConnectionUtil.databaseConnection();
		PreparedStatement statement=null;
		String query="insert into honey_grocery_user (NAME,email,mobile,PASSWORD)values(?,?,?,?)";
		statement=connection.prepareStatement(query);
		statement.setString(1,user.getName());
		statement.setString(2,user.getEmail());
		statement.setString(3,user.getMobile());
		statement.setString(4,user.getPassword());
		int rows=statement.executeUpdate();		
		System.out.println( "welcome to grocery shop");
	}

}
