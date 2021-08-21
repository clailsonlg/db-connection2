import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conn {
	String urlDeConexao = "jdbc:postgresql://localhost:5432/livraria";
	String usuario = "postgres";
	String senha = "postgres";
	
	public void conexao() throws SQLException {
		// TODO Auto-generated method stub
		Connection conexao = DriverManager.getConnection(urlDeConexao, usuario, senha );
		String sql = 
				"create table \"Editora2\" (" +
						"id serial not null," +
						"nome varchar(255) not null," +
						"email varchar(255) not null," +
						"primary key (id)" +
				")";
		
//		String sql = "INSERT INTO Editora (nome, email ) VALUES (’K19’, ’contato@k19.com.br’)";
		PreparedStatement comando = conexao.prepareStatement(sql);
		comando.execute();
		comando.close();
	}
	

}
