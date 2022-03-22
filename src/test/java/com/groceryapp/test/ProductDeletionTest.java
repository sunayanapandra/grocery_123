package com.groceryapp.test;

import java.util.Scanner;
import com.groceryapp.dao.DeleteProductDao;
import java.sql.SQLException;
import java.util.Scanner;



     public class ProductDeletionTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1)Delete by name");
		System.out.println("2)Delete by brand");
		System.out.println("3)Delete by categeory");
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("Enter product name to delete");
			Scanner sc1 = new Scanner(System.in);
			String name=sc1.nextLine();
			DeleteProductDao.productDeletionByName(name);
		}
		else if(option==2)
		{
			System.out.println("Enter product brand to delete");
			Scanner sc1 = new Scanner(System.in);
			String brand=sc1.nextLine();
			DeleteProductDao.productDeletionByBrand(brand);
		}
		else if(option==3)
		{
			System.out.println("Enter product category to delete");
			Scanner sc1 = new Scanner(System.in);
			String category=sc1.nextLine();
			DeleteProductDao.productDeletionBycategory(category);
		}
	
	}

}