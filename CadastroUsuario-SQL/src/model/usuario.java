
package model;

import controller.Conexao;
import java.sql.ResultSet; //guarda resultados SQL
import javax.swing.JOptionPane; //exibe mensagens


public class usuario {
    private String nome;
    private String login;
    private String email;
    private String senha;
    
    Conexao conUsuario = new Conexao();//faz a conexão com o banco de dados

    public usuario() {
        this("", "", "", "");
    }

    public usuario(String nome, String login, String email, String senha) {
        this.nome = nome;
        this.login = login;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Conexao getConCliente() {
        return conUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setConCliente(Conexao conUsuario) {
        this.conUsuario = conUsuario;
    }
    
        public void cadastrar() {//metodo que monta um comando SQL-
        String sql = "INSERT INTO usuario(Nome, Login, Email, Senha) VALUES (" +
             "'" + this.getNome() + "', '" + this.getLogin() + "', '" + this.getEmail() + "', '" + this.getSenha() + "')";
        conUsuario.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro gravado com sucesso...");
    }
        
            public ResultSet listar() {//metodo que executa um comando SELECT que busca todos os usuarios da tabela
        ResultSet tabela;
        tabela = null;
        
        String sql = "Select * from usuario";
        tabela = conUsuario.RetornarResultset(sql);
        return tabela;
    }
}
