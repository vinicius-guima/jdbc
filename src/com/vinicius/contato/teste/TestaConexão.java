package com.vinicius.contato.teste;

import java.sql.Connection;
import java.sql.SQLException;

import com.vinicius.contato.DAO.ConnectionFactory;

public class TestaConexão {
	
	public static void main(String[] args) throws SQLException {	
	

		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("conexao aberta");
		connection.close();
		System.out.println("conexao fechada");
		
	}

}
