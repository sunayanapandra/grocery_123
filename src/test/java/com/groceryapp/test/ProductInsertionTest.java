package com.groceryapp.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.groceryapp.dao.ProductInsertion;
import com.groceryapp.model.Product;

public class ProductInsertionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product name");
		String name=sc.next();
		System.out.println("Enter product brand");
		String brand=sc.next();
		System.out.println("Enter product category");
		String category=sc.next();
		System.out.println("Enter product price");
		int price=sc.nextInt();
		Product product=new Product();
		product.setName(name);
		product.setBrand(brand);
		product.setCategory(category);
		product.setPrice(price);
		ProductInsertion.productInsertion(product);

	}

}
