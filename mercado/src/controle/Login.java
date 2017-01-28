package controle;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

import face.JanelaLoginNoSistema;
import face.JanelaPrincipal;

public class Login {
	
	
	
	public Login() {
		super();
	}

	public void Logar(String usuario, String senha){
	
		 String sql="SELECT * FROM login WHERE usuario ='" + usuario + "' and senha ='" + senha + "'";
		 String URL_BD = "jdbc:mysql://localhost/login";
		 
		 try {
			    Connection conexao = (Connection) DriverManager.getConnection (URL_BD, "root", "123");
			    Statement estadoConexao = (Statement) conexao.createStatement();
			    ResultSet resultado = estadoConexao.executeQuery(sql);
			    
			    	resultado.last();
			        int numLinhas = resultado.getRow();
			        resultado.first();
			         
			         if (numLinhas == 0){
			        	 JOptionPane.showMessageDialog(null, "Login ou senha incorretos\nTente novamente");
		 				}
			         else {
			            ResultSetMetaData campo = (ResultSetMetaData) resultado.getMetaData();
			            
			  int numColunas = campo.getColumnCount();
			  
			  if (numColunas != 0){
				  JOptionPane.showMessageDialog(null,"Acesso Permitido!");
				  redimensionar();
			  }
			         }
			    
			    resultado.close();
			         estadoConexao.close();
			    conexao.close();
			      } 
		 catch (SQLException sqlExcecao) {
		    System.out.println("Erro na operação no banco de dados: " + 
			sqlExcecao.getMessage());
		 }
		 
}
		 

	private void redimensionar() {
		JanelaLoginNoSistema.logado = 1;
		JanelaPrincipal jprincipal = new JanelaPrincipal();
	}


}