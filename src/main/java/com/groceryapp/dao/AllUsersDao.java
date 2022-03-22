package com.groceryapp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
	
public class AllUsersDao {
	public static void allUsers() throws SQLException, ClassNotFoundException {

		Connection connection;
		PreparedStatement statement;
		ResultSet rs;
		connection = ConnectionUtil.databaseConnection();
		String query = "select name from honey_grocery_user";

		statement = connection.prepareStatement(query);
		rs = statement.executeQuery();
		String name = null;
		while (rs.next()) {
			name = rs.getString("name");
			System.out.println(name);
		}

	}
}