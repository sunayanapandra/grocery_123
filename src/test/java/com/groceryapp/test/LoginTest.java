package com.groceryapp.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.groceryapp.dao.LoginDao;

public class LoginTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mail");
		String email=sc.next();
		System.out.println("Enter your password");
		String password=sc.next();
		LoginDao.loginValidation(email, password);

	}

}
