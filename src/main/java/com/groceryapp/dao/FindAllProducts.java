package com.groceryapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.groceryapp.model.Product;

public class FindAllProducts {
	public static List<Product> allProducts() throws SQLException, ClassNotFoundException
	{
		List<Product> prod=new ArrayList<Product>();
		Connection connection=ConnectionUtil.databaseConnection();
		PreparedStatement statement=null;
		ResultSet result=null;
		String query="select id,name,brand,category,price from grocery_products";
		statement=connection.prepareStatement(query);
		result=statement.executeQuery();
		int id=0;
		String name=null;
		String brand=null;
		String category=null;
		int price=0;
		Product product=null;
		while(result.next())
		{
			 product =new Product();
			 id=result.getInt("id");
		     name=result.getString("name");
			 brand=result.getString("brand");
			 category=result.getString("category");
			 price=result.getInt("price");
			 product.setId(id);
			 product.setName(name);
			 product.setBrand(brand);
			 product.setCategory(category);
			 product.setPrice(price);
			 prod.add(product);
		}
		return prod;
		
		
	}

}
