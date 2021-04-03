/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ltp2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz
 */
public class ConnectionFactory {
    
    private static final String urlBase = "jdbc:mysql://localhost/dbcclientes?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private static final String usuario = "root";
    private static final String senha = "root";
    
    public static Connection getConexao(){
        
        Connection conexao = null;
        
        try {
            conexao = DriverManager.getConnection(urlBase, usuario, senha);
            
           if(conexao != null)
                System.out.println("Conexão com o banco de dados realizada com sucesso!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão: "+e.getMessage(), "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
        return conexao;
    }
    
    public static void closeConnection(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException{
        close(conn, ps, rs);
    }
    
    public static void closeConnection(Connection conn, PreparedStatement ps) throws SQLException{
        close(conn, ps, null);
    }
    
    public static void closeConnection(Connection conn) throws SQLException{
        close(conn, null, null);
    }

    private static void close(Connection conn, PreparedStatement ps, ResultSet rs) throws SQLException {
        try {
            if(conn != null)
                conn.close();
            if(ps != null)
                ps.close();
            if(rs != null)
                rs.close();
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        }
    }
    
}
