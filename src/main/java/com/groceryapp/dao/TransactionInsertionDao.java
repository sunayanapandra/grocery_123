package com.groceryapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TransactionInsertionDao {
	public static void insertingProducts(List<Integer> allItems) throws ClassNotFoundException, SQLException
	{
		for(Integer id:allItems)
		{
		 String query="insert into grocery_transaction(user_id,product_id,purchased_on)values(?,?,?)";
		 
		}
		
	}

}
