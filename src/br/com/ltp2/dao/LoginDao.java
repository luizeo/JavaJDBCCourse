/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ltp2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.ltp2.model.Login;
import br.com.ltp2.util.ConnectionFactory;

/**
 *
 * @author Luiz
 */
public class LoginDao {
    
    public static ArrayList<Login> buscarLogin() throws SQLException{
        ArrayList<Login> loginAux = new ArrayList<>();
        String sql = "select log_nome, log_senha from login";
        
        Connection conn = ConnectionFactory.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Login login = new Login();
            login.setLogin(rs.getString("log_nome"));
            login.setSenha(rs.getString("log_senha"));
            
            loginAux.add(login);
            //ConnectionFactory.closeConnection(conn);
        }
        
        return loginAux;
    }
    
}
