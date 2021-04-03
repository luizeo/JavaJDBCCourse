package br.com.ltp2.view;

//import br.com.ltp2.controller.ClienteController;
import br.com.ltp2.dao.ClienteDao;
import br.com.ltp2.model.Cliente;
import br.com.ltp2.util.ConnectionFactory;
//import br.com.ltp2.util.OperacoesCrud;
import br.com.ltp2.util.Util;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;



public class ClienteView extends javax.swing.JFrame {
    
//    public Integer operacao;
      private String sexo;
      private DefaultTableModel model;
    
    //variáveis em tempo de execução
    private Integer codigo;
    private String nomeCliente;


    public ClienteView() {
        initComponents();
        
        panelBotoesAcao.setEnabled(false);
        
        carregarDadosTabela();
        
        limparCampos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBtnAcoesPrincipais = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtFone = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        panelBotoesAcao = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtDtNasc = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        panelBtnAcoesPrincipais.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnAcoesPrincipaisLayout = new javax.swing.GroupLayout(panelBtnAcoesPrincipais);
        panelBtnAcoesPrincipais.setLayout(panelBtnAcoesPrincipaisLayout);
        panelBtnAcoesPrincipaisLayout.setHorizontalGroup(
            panelBtnAcoesPrincipaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnAcoesPrincipaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBtnAcoesPrincipaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBtnAcoesPrincipaisLayout.setVerticalGroup(
            panelBtnAcoesPrincipaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnAcoesPrincipaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel5.setText("Fone:");

        jLabel4.setText("Dt. Nasc:");

        jLabel3.setText("Sexo:");

        jLabel2.setText("CPF:");

        jLabel1.setText("Nome:");

        txtNome.setEditable(false);
        txtNome.setEnabled(false);

        jLabel6.setText("Endereço:");

        txtCpf.setEditable(false);
        txtCpf.setEnabled(false);

        txtFone.setEditable(false);
        txtFone.setEnabled(false);

        txtEndereco.setEditable(false);
        txtEndereco.setEnabled(false);

        rbMasculino.setText("Masculino");
        rbMasculino.setEnabled(false);
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

        rbFeminino.setText("Feminino");
        rbFeminino.setEnabled(false);
        rbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemininoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbMasculino)
                .addGap(18, 18, 18)
                .addComponent(rbFeminino)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFeminino)
                    .addComponent(rbMasculino)))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesAcaoLayout = new javax.swing.GroupLayout(panelBotoesAcao);
        panelBotoesAcao.setLayout(panelBotoesAcaoLayout);
        panelBotoesAcaoLayout.setHorizontalGroup(
            panelBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesAcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBotoesAcaoLayout.setVerticalGroup(
            panelBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesAcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotoesAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnCancelar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        txtDtNasc.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBotoesAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEndereco)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBotoesAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Sexo", "Data Nasc.", "Endereço", "Fone"
            }
        ));
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panelBtnAcoesPrincipais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBtnAcoesPrincipais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        rbFeminino.setSelected(false);
        sexo = rbMasculino.getText();
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
       
        //operacao = OperacoesCrud.NOVO.getOperacao();
        
        //btnEditar.setEnabled(false);
        //btnAtualizar.setVisible(false);
        //btnExcluir.setEnabled(false);
        
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnNovo.setEnabled(false);
             
        //panelBotoesAcao.setVisible(true);
        
        abrirCampos();
        limparCampos();
        
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //operacao = OperacoesCrud.EDITAR.getOperacao();
        
        if(tabelaCliente.getSelectedRow() == -1){
            if(tabelaCliente.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "A tabela está vazia!");
            }else{
                JOptionPane.showMessageDialog(null, "Deve ser selecionado um cliente!");
            }
        }else{
            //quando selecionar um cliente
            btnExcluir.setEnabled(false);
            btnEditar.setEnabled(false);
            btnNovo.setEnabled(false);
            panelBotoesAcao.setEnabled(true);
            btnSalvar.setEnabled(false);
            btnAtualizar.setEnabled(true);
            btnCancelar.setEnabled(true);
            
            abrirCampos();
        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        gravarAtualizarDados();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        AtualizarDados();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void rbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemininoActionPerformed
        rbMasculino.setSelected(false);
        sexo = rbFeminino.getText();
    }//GEN-LAST:event_rbFemininoActionPerformed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        //recupera as informações da tabela
        ListSelectionModel tableSelecionModel = tabelaCliente.getSelectionModel();
        
        //refresh - limpeza do cache da tabela
        tabelaCliente.setSelectionModel(tableSelecionModel);
        
        //armazena a linha selecionada nas variáveis instância para utilizar nas operações de atualização e exclusão
        setCodigo(Integer.parseInt(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0).toString()));
        setNomeCliente(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 1).toString());
        String rowCpf = tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 2).toString();
        String rowSexo = tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 3).toString();    
        getSexoSelecionado(rowSexo);
        //String dtNasc = tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 4).toString();
        String rowEnd = tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 5).toString();
        String rowFone = tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 6).toString();
        //abrirCampos();
        //panelBotoesAcao.setEnabled(true);
        //btnAtualizar.setEnabled(true);
        //btnCancelar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnNovo.setEnabled(false);
       
       
        
        txtNome.setText(getNomeCliente());
        txtCpf.setText(rowCpf);
        if (rowSexo.equals("Masculino"))
            rbMasculino.setSelected(true);
        else
            rbFeminino.setSelected(true);
            
        txtDtNasc.setDate(Util.converterToDate(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 4).toString()));
        txtEndereco.setText(rowEnd);
        txtFone.setText(rowFone);
        
             
    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnAtualizar.setEnabled(false);
        panelBotoesAcao.setEnabled(false);
        
        limparCampos();
        fecharCampos();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         if(tabelaCliente.getSelectedRow() == -1){
            if(tabelaCliente.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "A tabela está vazia!");
            }else{
                JOptionPane.showMessageDialog(null, "Deve ser selecionado um cliente!");
            }
        }else{
            //quando selecionar um cliente
                      
            excluirDados();
            
            limparCampos();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
         this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        //tabelaCliente.setFocusable(false);
        limparCampos();
    }//GEN-LAST:event_formMouseClicked


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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBotoesAcao;
    private javax.swing.JPanel panelBtnAcoesPrincipais;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtCpf;
    private com.toedter.calendar.JDateChooser txtDtNasc;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void gravarAtualizarDados() {
        //recupera os dados da tela
        String nome = txtNome.getText();
        String cpf = txtCpf.getText();
        String fone = txtFone.getText();
        Date dateNasc = new Date(txtDtNasc.getDate().getTime());
        String endereco = txtEndereco.getText();
        
        //atribuindo os dados de tela e atribuindo para o objeto cliente
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setFone(fone);
        cliente.setNascimento(dateNasc);
        cliente.setEndereco(endereco);
        cliente.setSexo(formatarCampoSexo(sexo));
        ClienteDao cli = new ClienteDao();
//        ClienteController clienteController = new ClienteController();
        try {
//            
              cli.cadastrar(cliente);
//            if(operacao == OperacoesCrud.NOVO.getOperacao()){
//                clienteController.cadastrar(cliente);   
//                
                model.addRow(new Object[]{cli.getCodigo(cliente), nome, cpf, sexo, cliente.getNascimento(),endereco,fone});
//                
               JOptionPane.showMessageDialog(null, "O cliente "+cliente.getNome()+ 
                        " foi criado com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
//                
                
                btnNovo.setEnabled(true);
                //btnEditar.setEnabled(false);
                //btnExcluir.setEnabled(true);
                btnSalvar.setEnabled(false);
                btnAtualizar.setEnabled(false);
                btnCancelar.setEnabled(false);
                panelBotoesAcao.setEnabled(false);
                limparCampos();
                fecharCampos();
//                
//            }else if(operacao == OperacoesCrud.EDITAR.getOperacao()){
//                
//                cliente.setCodigo(getCodigo());
//                
//                //chamada do controller pra realizar a persistência
//                clienteController.atualizar(cliente);
//                
//                //recupera as informações inseridas nos campos e atualizar as linhas da tabela
//                model.setValueAt(nome, tabelaCliente.getSelectedRow(), 1);
//                model.setValueAt(cpf, tabelaCliente.getSelectedRow(), 2);
//                model.setValueAt(sexo, tabelaCliente.getSelectedRow(), 3);
//                model.setValueAt(Util.converteToString(dateNasc), tabelaCliente.getSelectedRow(), 4);
//                model.setValueAt(fone, tabelaCliente.getSelectedRow(), 5);
//                
//                JOptionPane.showMessageDialog(null, "O cliente "+cliente.getNome()+ 
//                        " foi atualizado com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
                             
//            }
       } catch (SQLException ex) {
            Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void AtualizarDados() {
        //recupera os dados da tela
        String nome = txtNome.getText();
        String cpf = txtCpf.getText();
        sexo = (rbMasculino.isSelected() == true)? "Masculino":"Feminino";
        Date dateNasc = new Date(txtDtNasc.getDate().getTime());
        String endereco = txtEndereco.getText();
        String fone = txtFone.getText();
        
        //atribuindo os dados de tela e atribuindo para o objeto cliente
        Cliente cliente = new Cliente();
        cliente.setCodigo(getCodigo());
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setFone(fone);
        cliente.setNascimento(dateNasc);
        cliente.setEndereco(endereco);
        cliente.setSexo(formatarCampoSexo(sexo));
        ClienteDao cli = new ClienteDao();
//        ClienteController clienteController = new ClienteController();
        try {
//            
              
//            if(operacao == OperacoesCrud.NOVO.getOperacao()){
//                clienteController.cadastrar(cliente);   
//                
//                model.addRow(new Object[]{clienteController.getCodigo(cliente),
//                            nome, cpf, sexo, cliente.getNascimento(),fone});
//                
//               JOptionPane.showMessageDialog(null, "O cliente "+cliente.getNome()+ 
//                        " foi criado com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
//                
                
//                
//            }else if(operacao == OperacoesCrud.EDITAR.getOperacao()){
//                
                
                
                //chamada do controller pra realizar a persistência
                //clienteController.atualizar(cliente);
                cli.atualizar(cliente);
                //recupera as informações inseridas nos campos e atualizar as linhas da tabela
                model.setValueAt(nome, tabelaCliente.getSelectedRow(), 1);
                model.setValueAt(cpf, tabelaCliente.getSelectedRow(), 2);
                model.setValueAt(sexo, tabelaCliente.getSelectedRow(), 3);
                model.setValueAt(Util.converteToString(dateNasc), tabelaCliente.getSelectedRow(), 4);
                model.setValueAt(endereco, tabelaCliente.getSelectedRow(), 5);
                model.setValueAt(fone, tabelaCliente.getSelectedRow(), 6);
                
                JOptionPane.showMessageDialog(null, "O cliente "+cliente.getNome()+ 
                        " foi atualizado com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
               
                
                btnNovo.setEnabled(true);
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                panelBotoesAcao.setEnabled(false);
                btnAtualizar.setEnabled(false);
                btnCancelar.setEnabled(false);
                
               limparCampos();
               fecharCampos();              
//            }
       } catch (SQLException ex) {
            Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void abrirCampos(){
        txtNome.setEditable(true);
        txtNome.setEnabled(true);
        txtCpf.setEditable(true);
        txtCpf.setEnabled(true);
        txtFone.setEditable(true);
        txtFone.setEnabled(true);
        txtEndereco.setEditable(true);
        txtEndereco.setEnabled(true);
        txtDtNasc.setEnabled(true);
        rbMasculino.setEnabled(true);
        rbFeminino.setEnabled(true);
    }
    
    private void limparCampos(){
        txtNome.setText("");
        txtCpf.setText("");
        txtFone.setText("");
        txtEndereco.setText("");
        txtDtNasc.setDate(null);
        rbFeminino.setSelected(false);
        rbMasculino.setSelected(false);
    }

    private String formatarCampoSexo(String sexo) {
        
        if(sexo.equals("Masculino")){
            sexo = "M";
        }else{
            sexo = "F";
        }
        
        return sexo;
    }
    
    private void carregarDadosTabela(){
        String sql = "select cli_cod, cli_nome, cli_cpf, cli_sexo, "
                + "cli_dt_nasc, cli_endereco,cli_fone  from cliente order by cli_cod";
        
        try {
            Connection connection = ConnectionFactory.getConexao();
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            //configurações de tamanho do JTable
            tabelaCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            tabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaCliente.getColumnModel().getColumn(1).setPreferredWidth(180);
            tabelaCliente.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabelaCliente.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabelaCliente.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabelaCliente.getColumnModel().getColumn(5).setPreferredWidth(150);
            tabelaCliente.getColumnModel().getColumn(6).setPreferredWidth(120);
            
            model = (DefaultTableModel) tabelaCliente.getModel();
            
            while(rs.next()){
                Integer rsCodigo = rs.getInt("cli_cod");
                String rsNome = rs.getString("cli_nome");
                String rsCpf = rs.getString("cli_cpf");
                String rsEnd = rs.getString("cli_endereco");
                String rsSexo = rs.getString("cli_sexo");
                if(rsSexo.equals("M")){
                    rsSexo = "Masculino";
                }else{
                    rsSexo = "Feminino";
                }
                
                Date rsNasc = rs.getDate("cli_dt_nasc");
                String rsFone = rs.getString("cli_fone");
                                
                //preenche os dados na Jtable que estão retornando do banco de dados
                model.addRow(new Object[]{rsCodigo,rsNome,rsCpf,rsSexo,Util.converteToString(rsNasc),rsEnd,rsFone});               
            }
                  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    private void getSexoSelecionado(String rowSexo) {
        if(rowSexo.equals("Masculino")){
            rbMasculino.setSelected(true);
            rbFeminino.setSelected(false);
        }else{
            rbMasculino.setSelected(false);
            rbFeminino.setSelected(true);
        }
    }

    private void fecharCampos() {
        txtNome.setEnabled(false);
        txtCpf.setEnabled(false);
        txtFone.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtDtNasc.setEnabled(false);
        rbMasculino.setEnabled(false);
        rbFeminino.setEnabled(false);
        
    }

    private void excluirDados() {
        
        String msg = "Deletar o cliente: "+getNomeCliente() + "?";
        
        int opcaoEscolhida = JOptionPane.showConfirmDialog(null, msg, "Exclusão", JOptionPane.YES_NO_OPTION);
        if(opcaoEscolhida == JOptionPane.YES_OPTION){
            PreparedStatement ps = null;

        String sql = "DELETE FROM cliente WHERE cli_cod = ?";
        Connection conn = ConnectionFactory.getConexao();
        try {
            
                           
                ps = conn.prepareStatement(sql);
                ps.setInt(1, getCodigo());                  
                ps.executeUpdate();
                 //remover a linha da tabela selecionada
                model.removeRow(tabelaCliente.getSelectedRow());

                JOptionPane.showMessageDialog(null, "O cliente "+getNomeCliente()+ 
                            " foi excluído com sucesso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            
            
        } catch (SQLException e) {
            e.printStackTrace();
            
            
        }finally{
                try {
                    ConnectionFactory.closeConnection(conn,ps);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }//Finally
        
        }//IF
        
    }//método excluirDados
        
    }

    


