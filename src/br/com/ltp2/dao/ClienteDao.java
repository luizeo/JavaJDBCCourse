
package br.com.ltp2.dao;

import br.com.ltp2.model.Cliente;
import br.com.ltp2.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClienteDao extends Dao<Cliente>{

    @Override
    public boolean cadastrar(Cliente cliente) throws SQLException {
        PreparedStatement ps = null;

        String sql = "INSERT INTO cliente (CLI_NOME, CLI_CPF, CLI_DT_NASC, "
                + "CLI_SEXO, CLI_FONE, CLI_ENDERECO)"
                + " VALUES (?,?,?,?,?,?)";
        
        try {
            Connection conn = this.obterConexao();
           
            try{      
                ps = conn.prepareStatement(sql);
                ps.setString(1, cliente.getNome());
                ps.setString(2, cliente.getCpf());
                ps.setDate(3, cliente.getNascimento());
                ps.setString(4, cliente.getSexo());
                ps.setString(5, cliente.getFone());
                ps.setString(6, cliente.getEndereco());
                
                ps.executeUpdate();
                
            }finally{
                try {
                    ConnectionFactory.closeConnection(conn,ps);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            
            return false;
        }
        
        return true;

                
    }

    @Override
    public boolean atualizar(Cliente cliente) throws SQLException {
        PreparedStatement ps = null;

        String sql = "UPDATE cliente SET CLI_NOME = ?, "
                + "CLI_CPF = ?, CLI_DT_NASC = ?, CLI_SEXO = ?, "
                + "CLI_FONE = ?, CLI_ENDERECO = ? WHERE CLI_COD = ?";
        
        try {
            Connection conn = this.obterConexao();
           
            try{      
                ps = conn.prepareStatement(sql);
                ps.setString(1, cliente.getNome());
                ps.setString(2, cliente.getCpf());
                ps.setDate(3, cliente.getNascimento());
                ps.setString(4, cliente.getSexo());
                ps.setString(5, cliente.getFone());
                ps.setString(6, cliente.getEndereco());
                ps.setInt(7, cliente.getCodigo());
                
                ps.executeUpdate();
                
            }finally{
                try {
                    ConnectionFactory.closeConnection(conn,ps);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            
            return false;
        }
        
        return true;
        
        
    }

    @Override
    public boolean excluir(Cliente cliente) throws SQLException {
        PreparedStatement ps = null;

        String sql = "DELETE FROM cliente WHERE CLI_COD = ?";
        
        try {
            Connection conn = this.obterConexao();
           
            try{      
                ps = conn.prepareStatement(sql);
                ps.setInt(1, cliente.getCodigo());
                                
                ps.executeUpdate();
                
            }finally{
                try {
                    ConnectionFactory.closeConnection(conn,ps);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            
            return false;
        }
        
        return true;
        
    }

    @Override
    public Integer getCodigo(Cliente cliente) throws SQLException {
      
        PreparedStatement ps = null;
        Integer codigo = null;
        String sql = "select cli_cod from cliente where cli_cpf = ?";
        
        try {
            Connection conn = this.obterConexao();
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getCpf());
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                cliente.setCodigo(rs.getInt("cli_cod"));
                codigo = cliente.getCodigo();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return codigo;
    }

}
