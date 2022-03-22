package com.groceryapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.groceryapp.model.Product;

public class ProductInsertion {
	public static void productInsertion(Product product) throws ClassNotFoundException, SQLException
	{
		Connection connection=ConnectionUtil.databaseConnection();
		PreparedStatement statement=null;
		String query="insert into grocery_products(name,brand,category,price)values(?,?,?,?)";
		statement=connection.prepareStatement(query);
		statement.setString(1, product.getName());
		statement.setString(2, product.getBrand());
		statement.setString(3, product.getCategory());
		statement.setInt(4, product.getPrice());
		int rows=statement.executeUpdate();		
		System.out.println("products are inserted");
	}

	

}
