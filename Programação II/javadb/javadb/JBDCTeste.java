package javadb;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JBDCTeste {
	public static void main(String[] args) {
		
		String stringDeConexao = "jdbc:mysql://localhost/test";
		String user = "root";
		String password = "";
		
		try {
		
		DriverManager.getConnection(stringDeConexao, user, password);
		System.out.println("Conectado ao Banco de dados \\o/");
	} catch (SQLException e) {
		e.printStackTrace();
		}
	}

}
