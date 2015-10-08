package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {

		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/fabricaweb", "root", "218211415");
			System.out.println("Conectado!!!");
		} catch (SQLException e) {
			System.out.println("Não foi possivel conectar ao banco");
			e.printStackTrace();
		}

		return con;

	}

}
