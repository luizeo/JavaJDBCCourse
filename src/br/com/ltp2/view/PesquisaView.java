package br.com.ltp2.view;

import br.com.ltp2.util.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class PesquisaView extends javax.swing.JFrame {

    private String nomeCliente;
    private DefaultTableModel model;
    TableRowSorter sorter;
    ResultSet rs;
    
    public PesquisaView() {
        initComponents();
        
        carregarDadosTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPesquisaNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        btnPrintRep = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Clientes");

        jLabel1.setText("Nome:");

        txtPesquisaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaNomeKeyReleased(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setEnabled(false);
        btnPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnPesquisarKeyReleased(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Sexo", "Data de Nascimento", "Fone"
            }
        ));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        btnPrintRep.setText("GERAR");
        btnPrintRep.setEnabled(false);
        btnPrintRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintRepActionPerformed(evt);
            }
        });

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF", "Telefone" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPrintRep)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnLimpar)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnPrintRep)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        ListSelectionModel tableSelectionModel = tabelaClientes.getSelectionModel();
        
        //limpeza de cache
        tabelaClientes.setSelectionModel(tableSelectionModel);
        
        setNomeCliente(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(),1).toString());
        txtPesquisaNome.setText(getNomeCliente());
            
        
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtPesquisaNome.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPesquisarKeyReleased
        
    }//GEN-LAST:event_btnPesquisarKeyReleased

    private void txtPesquisaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaNomeKeyReleased
       model = (DefaultTableModel) tabelaClientes.getModel();
        sorter = new TableRowSorter<DefaultTableModel>(model);
        tabelaClientes.setRowSorter(sorter);
        
        String nome = txtPesquisaNome.getText();
        if(nome != null){
            sorter.setRowFilter(RowFilter.regexFilter(("(?i)" + nome)));
        }else{
            sorter.setRowFilter(null);
        }
    }//GEN-LAST:event_txtPesquisaNomeKeyReleased

    private void btnPrintRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintRepActionPerformed
//        try {
//              JasperDesign desenho = JRXmlLoader.load( "E:/IFGOIANO==============/2019/ProjetosJava/AplicacaoClientes/src/MyReports/listagem.jrxml" );
//             //compila o relatório
//             JasperReport relatorio;
//             relatorio = JasperCompileManager.compileReport(desenho);
//           //implementação da interface JRDataSource para DataSource ResultSet
//            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
//           //executa o relatório
//            Map parametros = new HashMap();
//            //parametros.put("nome", txtPesquisaNome.getText());
//            JasperPrint impressao = JasperFillManager.fillReport(relatorio , parametros,jrRS);
//            //exibe o resultado
//	    JasperViewer.viewReport(impressao,true); 
//           	   
//        } catch (JRException ex) {
//            Logger.getLogger(PesquisaView.class.getName()).log(Level.SEVERE, null, ex);
//        }
      
    }//GEN-LAST:event_btnPrintRepActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PesquisaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPrintRep;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField txtPesquisaNome;
    // End of variables declaration//GEN-END:variables

    private void carregarDadosTabela() {
              
        String sql = "select cli_cod, cli_nome, cli_cpf, cli_sexo, "
                + "cli_dt_nasc, cli_fone  from cliente order by cli_cod";
        
        try {
            Connection conn = ConnectionFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            //Configurando os tamanhos das colunas e instanciando a tabela
            tabelaClientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            tabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(250);
            tabelaClientes.getColumnModel().getColumn(2).setPreferredWidth(110);
            tabelaClientes.getColumnModel().getColumn(3).setPreferredWidth(70);
            tabelaClientes.getColumnModel().getColumn(4).setPreferredWidth(110);
            tabelaClientes.getColumnModel().getColumn(5).setPreferredWidth(120);
            model = (DefaultTableModel) tabelaClientes.getModel();
            
            while (rs.next()) {
                Integer rsCodigo = rs.getInt("cli_cod");
                String rsNome = rs.getString("cli_nome");
                String rsCpf = rs.getString("cli_cpf");
                String rsSexo = rs.getString("cli_sexo");

                 if(rs.equals("M")){
                    if (rsSexo.equals("M")) {
                        rsSexo = "Masculino";
                    } else {
                        rsSexo = "Feminino";
                    }
                }
                
                Date rsNasc = rs.getDate("cli_dt_nasc");
                String rsFone = rs.getString("cli_fone");
                
                //preenche os dados do banco na tabela 
                model.addRow(new Object[]{rsCodigo, rsNome, rsCpf, rsSexo, Util.converteToString(rsNasc), rsFone});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela " + ex);
            ex.printStackTrace();
        }
    
       
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
