package javadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JbdcInsere {
	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			String insert = "insert into contatos(nome,email,endereco) values (?,?,?)";
			PreparedStatement stmt = con.prepareStatement(insert);
			stmt.setString(1, "Jarbas");
			stmt.setString(2, "jarbas@jarbas.com");
			stmt.setString(3, "Av. Maricá, 1000");
			stmt.execute();
			stmt.close();
			System.out.println("Gravação feita no banco de dados com sucesso!!!");
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
