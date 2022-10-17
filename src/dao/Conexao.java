/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Diogo
 * Programa para gerir a rotina de cadastro, cobrança, mensagens e organizacao de rotas para clientes de escolar.
 * 
 */
public class Conexao {

// variavel com caminho do banco de dados
    private final String url = "jdbc:mysql://localhost:3306/bancoge";
    // variavel com o usuario
    private final String usuario = "root";
// variavel com a senha
    private final String senha = "senhaB2023@";
// variaveis para trabalhar a conexao
    private Connection conexao = null;
    public Statement stmt;
    public ResultSet rs;
// metodo para abrir a conexao

    public Connection abrirCon() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException erro) {
            System.out.println("Erro na Conexao " + erro);
        }
        return conexao;
    }

    public void fecharCon() {
        try {
            conexao.close();
        } catch (Exception e) {
        }
    }

    public void executaSql(String sql) {
        try {

            stmt = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

            rs = stmt.executeQuery(sql);
           

        } catch (Exception e) {
        }
    }

    //Metodo para cadastrar um novo cliente no banco de dados
    public void newCad(String nome, int idade, String pai, int cpfPai, String mae, int cpfMae, String endereco, int telefonecontato, String email, String escola) throws SQLException {

        String sqlCad = "INSERT INTO pessoasge (nome, idade, pai, cpfpai, mae, cpfmae, endereco, telefonecontato, emailcontato, escola) VALUES ('" + nome + "','" + idade + "','" + pai + "','" + cpfPai + "','" + mae + "','" + cpfMae + "','" + endereco + "','" + telefonecontato + "','" + email + "','" + escola + "')";
        PreparedStatement Stmt = conexao.prepareStatement(sqlCad);
        Stmt.execute(sqlCad);
    
    }
}
