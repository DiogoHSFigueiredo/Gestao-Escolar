/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Diogo Programa para gerir a rotina de cadastro, cobrança, mensagens e
 * organizacao de rotas para clientes de escolar.
 *
 */
public class ModuloConexao {
    
    


//ATENCAO ESTA PARTE CORTADA DO CODIGO DIZ RESPEITO A NOVA IMPLEMENTACAO DA TELA DE LOGIN
    // A PARTE ABAIXO DIZ RESPEITO AO ANTIGO SISTEMA ELABORADO SEM A TELA DE LOGIN, É NECESSÁRIO MESCLAR AMBAS AS IMPLEMENTACOES
    //PARA QUE A TELA DE LOGIN E O BANCO DE DADOS FUNCIONE ATUALMENTE UM ESTA EXCLUINDO O OUTRO
    
    
    
    
    

    //metodo responsavel por estabelecer a conexao com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //a linha abaixo "chama" o driver
        final String driver = "com.mysql.cj.jdbc.Driver";
        //informacoes referente ao banco
        final String url = "jdbc:mysql://localhost:3306/bancoge";
        final String usuario = "root";
        final String senha = "senhabanco2023@";

        //Estabelecendo conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            return conexao;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }





    
  
  
    // variavel com caminho do banco de dados
    private final String url = "jdbc:mysql://localhost:3306/bancoge";
    // variavel com o usuario
    private final String usuario = "root";
// variavel com a senha
    private final String senha = "senhabanco2023@";
// variaveis para trabalhar a conexao
    private Connection conexao = null;
    public Statement stmt;
    public ResultSet rs;
    //variavel para armazenar o driver
    private final String driver = "com.mysql.cj.jdbc.Driver";

// metodo para abrir/estabelecer a conexao com o banco
    public Connection abrirCon() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            return conexao;

        } catch (SQLException erro) {
            System.out.println("Erro na Conexao " + erro);
            return null;
        }
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

    //metodo de exclusao a partir do id informado
    public void delCad(int id) throws SQLException {
        String sqlCad = "DELETE FROM `bancoge`.`pessoasge` WHERE (`id` = '" + id + "')";
        PreparedStatement Stmt = conexao.prepareStatement(sqlCad);
        Stmt.execute(sqlCad);

    }
}

