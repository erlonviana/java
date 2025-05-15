//faz a conexão entre o java e o banco de dados

package controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao { //atributos da conexão
    final private String driver = "com.mysql.jdbc.Driver"; //classe que coneta o Java com o MySQL
    final private String url = "jdbc:mysql://127.0.0.1/banco"; //endereço do banco de dados
    
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao; //objeto que abre a conexão com o banco
    public Statement statement; //objeto que abre caminho até o banco, cria a autoestrada, envia comandos SQL
    public ResultSet resultset; // objeto que armazena os comandos sql. Armazena resultados de consultas SQL (com select)
    
    public boolean conecta() { // tenta abrir a conexão com o banco de dados
        boolean result = true;
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectou com o Banco de Dados");
                    
        } catch(ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver nao localizado:" + Driver);
            result = false;
        } catch(SQLException Fonte) {
            JOptionPane.showMessageDialog(null, "Erro na conexao com a fonte de dados: " + Fonte);
            result = false;
        }
        return result;
    }
    
    public void desconecta() {//fecha a conexão com o banco de dados
        boolean result = true;
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Banco fechado");
        } catch(SQLException fecha) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel fechar o banco de dados" + fecha);
            result = false;
        }
    }

    public void executeSQL(String sql) {//executa comandos SQL simples
        //chamada do metodo conecta para abrir a conexao com o db    
        conecta();
        try {
            statement = conexao.createStatement();
            statement.execute(sql);
            //desconecta();
        } catch(SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Driver nao encontrado1" + sqle.getMessage());    
        }
    }
    
    public ResultSet RetornarResultset(String sql) {//executa uma consulta e retorna os dados
        ResultSet resultSet = null;
        conecta();
        try {
            statement = conexao.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao retornar resultset" + e.getMessage());    
        } 
        return resultSet;
    }    
}
