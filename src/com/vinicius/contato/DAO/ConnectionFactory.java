package com.vinicius.contato.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public  Connection getConnection() throws SQLException {
		System.out.println("conectando...");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			throw new SQLException();
		}
		return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "vini");
	}
}
