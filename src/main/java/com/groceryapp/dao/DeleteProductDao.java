package com.groceryapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sportsshop.model.Products;

public class DeleteProductDao { 
	public static void productDeletionByName(String name) throws SQLException, ClassNotFoundException
	{
		Connection connection ;
       PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query =    "delete from grocery_products where NAME = ? ";
;
		statement = connection.prepareStatement(query);
		statement.setString(1,name); 
		
		int rows=statement.executeUpdate();
		System.out.println("no of products deleted "+rows);

	}
	public static void productDeletionByBrand(String brand) throws SQLException, ClassNotFoundException
	{
		Connection connection ;
       PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query =   "delete from grocery_products where brand = ?" ;
;
		statement = connection.prepareStatement(query);
		statement.setString(2,brand); 
		
		int rows=statement.executeUpdate();
		System.out.println("no of brands deleted"+rows);

	}
	public static void productDeletionBycategory(String category) throws SQLException, ClassNotFoundException
	{
		Connection connection ;
       PreparedStatement statement;
		connection = ConnectionUtil.databaseConnection();
		String query =   "delete from grocery_products  where category = ?" ;
;
		statement = connection.prepareStatement(query);
		statement.setString(3,category); 
		
		int rows=statement.executeUpdate();
		System.out.println("no of category deleted"+rows);

	}




}