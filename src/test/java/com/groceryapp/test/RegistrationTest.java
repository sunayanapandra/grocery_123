
package com.groceryapp.test;

import java.util.Scanner;

import com.groceryapp.logic.RegisterValidation;
//import com.groceryapp.logic.RegisterValidator;
import com.groceryapp.model.Registration;

public class RegistrationTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your email");
		String email=sc.next();
		System.out.println("Enter your Mobile");
		String mobile=sc.next();
		System.out.println("Enter your password");
		String password=sc.next();
		Registration registration=new Registration();
		registration.setName(name);
		registration.setEmail(email);
		registration.setMobile(mobile);
		registration.setPassword(password);
		try
		{
			
		
		    RegisterValidation.validatingRegistration(registration);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
