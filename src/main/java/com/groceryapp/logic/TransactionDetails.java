package com.groceryapp.logic;

import java.util.List;

import com.groceryapp.dao.TransactionDetailsDao;
import com.groceryapp.model.Product;

public class TransactionDetails {
	public static void myTransactionDetails() throws Exception
	{
		List<Product> products=TransactionDetailsDao.allTransactions();
		for(Product prod:products)
		{
			System.out.println(prod.getName()+" "+prod.getPrice()+" "+prod.getDate());
		}
		
	}

}
