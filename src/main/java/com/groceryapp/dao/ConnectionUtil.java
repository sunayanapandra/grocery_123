package com.groceryapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection databaseConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		return connection;

	}

	public static int runQueryforPrice(String query) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user", "rev_user");
		java.sql.Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(query);
		int price = 0;
		if (rs.next())
		{
			price = rs.getInt("price");
		}
		return price;
	}
	public static void runQueryForInsertion(String query)throws Exception
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	//System.out.println(connection);
	//System.out.println(query);
	java.sql.Statement statement=connection.createStatement();
	int rows=statement.executeUpdate(query);
	connection.close();
	}


}
