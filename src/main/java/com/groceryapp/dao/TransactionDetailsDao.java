package com.groceryapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.groceryapp.model.Product;

public class TransactionDetailsDao {
	public static List<Product> allTransactions() throws Exception
	{
		List<Product> prod=new ArrayList<Product>();
		Connection connection=ConnectionUtil.databaseConnection();
		PreparedStatement statement=null;
		ResultSet result=null;
		String query="select grocery_products.name,grocery_products.price,grocery_transaction.purchased_on from grocery_products INNER JOIN grocery_transaction on grocery_products.id=grocery_transaction.product_id where user_id=?";
		statement=connection.prepareStatement(query);
		statement.setInt(1,2);
		result=statement.executeQuery();
		String name=null;
		int price=0;
		Date date=null;
		Product product=null;
		while(result.next())
		{
			product=new Product();
			name=result.getString("name");
			price=result.getInt("price");
			date=result.getDate("purchased_on");
			product.setName(name);
			product.setPrice(price);
			product.setDate(date);
			prod.add(product);
			
		}
		return prod;
		
	}

}
