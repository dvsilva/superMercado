package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaBanco {
	static final String URL_BD = "jdbc:mysql://localhost/mercado";

	public ConectaBanco() {
		try {
			Connection conexao = DriverManager.getConnection(URL_BD, "root", "123456");
			System.out.println("Conectado com sucesso ao banco de dados");
			conexao.close();
		} catch (SQLException sqlExcecao) {
			System.out.println("Erro no fechamento da conexão: " + sqlExcecao.getMessage());
		}
	}
}