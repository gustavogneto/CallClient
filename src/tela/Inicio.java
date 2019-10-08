/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;


import persistence.ConnectionFactory;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author ggomes
 */
public class Inicio extends javax.swing.JFrame {

    private Object[] obj = null;
    private String nullable = "";

    public Object[] getObj() {
        return obj;
    }

    public void setObj(Object[] obj) {
        this.obj = obj;
    }

    public Inicio() {
        initComponents();
        BuscaCall();
        BuscaClienteChamados();
        Buscarc5clients("%-%");
        ///   DefaultTableModel modelDestino = (DefaultTableModel) recClientesCall.getModel();
        //Cria uma linha para ser incluida na tabela de destino, no meu caso tem duas colunas, adapte para as suas tabelas
        //   modelDestino.setNumRows(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RecClientes = new javax.swing.JTable()
        ;
        txtBuscaClie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        recClientesCall = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        bntChamaClie = new javax.swing.JButton();
        btnRemoveCall = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        recChamados = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnReChamar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtApelido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FreeCliv0");

        RecClientes.setAutoCreateRowSorter(true);
        RecClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Fantasia", "Carga"
            }
        ));
        RecClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(RecClientes);
        if (RecClientes.getColumnModel().getColumnCount() > 0) {
            RecClientes.getColumnModel().getColumn(0).setMinWidth(150);
            RecClientes.getColumnModel().getColumn(0).setPreferredWidth(150);
            RecClientes.getColumnModel().getColumn(0).setMaxWidth(150);
            RecClientes.getColumnModel().getColumn(2).setMinWidth(150);
            RecClientes.getColumnModel().getColumn(2).setPreferredWidth(150);
            RecClientes.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        txtBuscaClie.setDocument( new PlainDocument()
            {
                @Override
                public void insertString( int offs, String str, AttributeSet a )
                throws BadLocationException
                {
                    super.insertString( offs, str.toUpperCase(), a );
                }
            } );
            txtBuscaClie.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    txtBuscaClieKeyPressed(evt);
                }
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    txtBuscaClieKeyReleased(evt);
                }
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    txtBuscaClieKeyTyped(evt);
                }
            });

            jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
            jLabel1.setText("Buscar Cliente");

            recClientesCall.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Id Chamado", "Codigo Cliente", "Fantasia", "Data Hora Liberação"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane2.setViewportView(recClientesCall);
            if (recClientesCall.getColumnModel().getColumnCount() > 0) {
                recClientesCall.getColumnModel().getColumn(0).setMinWidth(0);
                recClientesCall.getColumnModel().getColumn(0).setPreferredWidth(0);
                recClientesCall.getColumnModel().getColumn(0).setMaxWidth(0);
            }

            jLabel2.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
            jLabel2.setText("Clientes No Monitor");

            bntChamaClie.setText("Chamar cliente");
            bntChamaClie.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bntChamaClieActionPerformed(evt);
                }
            });

            btnRemoveCall.setText("Remove do monitor");
            btnRemoveCall.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnRemoveCallActionPerformed(evt);
                }
            });

            recChamados.setAutoCreateRowSorter(true);
            recChamados.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null}
                },
                new String [] {
                    "Codigo", "Fantasia", "Ultima data/hora chamada"
                }
            ));
            recChamados.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    recChamadosMouseClicked(evt);
                }
            });
            jScrollPane4.setViewportView(recChamados);

            jLabel3.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
            jLabel3.setText("Clientes Chamados");

            btnReChamar.setText("Re-chamar");
            btnReChamar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnReChamarActionPerformed(evt);
                }
            });

            jButton1.setText("Atualizar");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            txtApelido.setDocument( new PlainDocument()
                {
                    @Override
                    public void insertString( int offs, String str, AttributeSet a )
                    throws BadLocationException
                    {
                        super.insertString( offs, str.toUpperCase(), a );
                    }
                } );

                jLabel5.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
                jLabel5.setText("Apelido do Cliente");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(157, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBuscaClie, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(bntChamaClie)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnRemoveCall))
                                .addComponent(btnReChamar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(16, 16, 16))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bntChamaClie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRemoveCall, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtBuscaClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReChamar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                );

                pack();
            }// </editor-fold>//GEN-END:initComponents


    private void txtBuscaClieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaClieKeyTyped


    }//GEN-LAST:event_txtBuscaClieKeyTyped

    private void txtBuscaClieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaClieKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER || evt.getKeyCode() == evt.VK_F8) {
            Buscarc5clients(txtBuscaClie.getText());
        }
    }//GEN-LAST:event_txtBuscaClieKeyPressed

    private void bntChamaClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntChamaClieActionPerformed

        if (RecClientes.getSelectedRowCount() != 0) { //Verifica se existe linha selecionada para não dar erro na hora de pegar os valores
            //Pega os models das listas, para fazer as inserções e remoções
            DefaultTableModel modelOrigem = (DefaultTableModel) RecClientes.getModel();
            DefaultTableModel modelDestino = (DefaultTableModel) recClientesCall.getModel();
            //Cria uma linha para ser incluida na tabela de destino, no meu caso tem duas colunas, adapte para as suas tabelas
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            Object[] obj = {RecClientes.getValueAt(RecClientes.getSelectedRow(), 0), RecClientes.getValueAt(RecClientes.getSelectedRow(), 1), dateFormat.format(cal.getTime())};
            //Adiciona no destino e remove da origem

            modelDestino.addRow(obj);

            try {
                if (txtApelido.getText().equals(null) || txtApelido.getText().equals("")) {
                    txtApelido.setText("");
                } else {
                    nullable = txtApelido.getText() + " - ";
                }
                InsertThis(Integer.parseInt(RecClientes.getValueAt(RecClientes.getSelectedRow(), 0).toString()), nullable + RecClientes.getValueAt(RecClientes.getSelectedRow(), 1).toString().substring(0,RecClientes.getValueAt(RecClientes.getSelectedRow(), 1).toString().indexOf("-")).toString().replaceAll("[^a-zA-Z0-9. ]", "").trim(), dateFormat.format(cal.getTime()));
                //  InsertCall(Integer.parseInt(RecClientes.getValueAt(RecClientes.getSelectedRow(), 0).toString()), RecClientes.getValueAt(RecClientes.getSelectedRow(), 1).toString(), dateFormat.format(cal.getTime()));
                InsertCall(Integer.parseInt(RecClientes.getValueAt(RecClientes.getSelectedRow(), 0).toString()), nullable + RecClientes.getValueAt(RecClientes.getSelectedRow(), 1).toString().substring(0,RecClientes.getValueAt(RecClientes.getSelectedRow(), 1).toString().indexOf("-")).toString().replaceAll("[^a-zA-Z0-9. ]", "").trim(), dateFormat.format(cal.getTime()));               
// InsertCall(Integer.parseInt(RecClientes.getValueAt(RecClientes.getSelectedRow(), 0).toString()), nullable + RecClientes.getValueAt(RecClientes.getSelectedRow(), 1).toString().substring(RecClientes.getValueAt(RecClientes.getSelectedRow(), 1).toString().indexOf("-"), RecClientes.getValueAt(RecClientes.getSelectedRow(), 1).toString().length()).toString().replaceAll("[^a-zA-Z0-9. ]", "").trim(), dateFormat.format(cal.getTime()));
                // InsertLogs(Integer.parseInt(RecClientes.getValueAt(RecClientes.getSelectedRow(), 0).toString()), RecClientes.getValueAt(RecClientes.getSelectedRow(), 1).toString(), dateFormat.format(cal.getTime()));
            } catch (SQLException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                BuscaClienteChamados();
                BuscaCall();
                txtApelido.setText("");
                nullable = "";
            }

        } else {
//Não tem nenhuma linha selecionada na tabela de origem, faça um aviso para o usuário ou algo do tipo.
        }

    }//GEN-LAST:event_bntChamaClieActionPerformed
    private void InsertThis(int seqpessoa, String fantasia, String datas) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://192.168.168.194/teste", "root", "mysql");
        String sql = "INSERT INTO tb_clientechamado( seqpessoa,fantasia,datahorachamada)VALUES(?,?,?);";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, seqpessoa);
        stmt.setString(2, fantasia);
        stmt.setString(3, datas);
        stmt.execute();
        stmt.close();
        con.close();

    }

    private void InsertCall(int seqpessoa, String fantasia, String datas) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://192.168.168.194/teste", "root", "mysql");
        String sql = "INSERT INTO tb_callclient( seqpessoa,fantasia,datahorachamada )VALUES(?,?,?);";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, seqpessoa);
        stmt.setString(2, fantasia);
        stmt.setString(3, datas);
        stmt.execute();
        stmt.close();
        con.close();

    }

    private void removeAcntion() {
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.168.194/teste", "root", "mysql");
            String sql = "delete from tb_callclient where seqpessoa = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            int linha = this.recClientesCall.getSelectedRow();
            stmt.setInt(1, Integer.parseInt(recClientesCall.getValueAt(linha, 0).toString()));
            stmt.execute();
            stmt.close();
            con.close();
            DefaultTableModel model = (DefaultTableModel) recClientesCall.getModel();
            model.removeRow(linha);
            JOptionPane.showMessageDialog(this, "Codigo Excluído com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }
    private void btnRemoveCallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveCallActionPerformed
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.168.194/teste", "root", "mysql");
            String sql = "delete from tb_callclient where id_callclient = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            int linha = this.recClientesCall.getSelectedRow();
            stmt.setInt(1, Integer.parseInt(recClientesCall.getValueAt(linha, 0).toString()));
            stmt.execute();
            stmt.close();
            con.close();
            DefaultTableModel model = (DefaultTableModel) recClientesCall.getModel();
            model.removeRow(linha);
            JOptionPane.showMessageDialog(this, "Codigo Excluído com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        } finally {
            BuscaCall();
            BuscaClienteChamados();
        }     // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveCallActionPerformed

    private void recChamadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recChamadosMouseClicked
        /* DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Calendar cal = Calendar.getInstance();
        if(evt.getClickCount() == 1) 
           {    
 try{              
 InsertCall(Integer.parseInt(recChamados.getValueAt(recChamados.getSelectedRow(), 0).toString()), recChamados.getValueAt(recChamados.getSelectedRow(), 1).toString(), dateFormat.format(cal.getTime()));
 }catch (SQLException e) {
      JOptionPane.showMessageDialog(this, e);
 }       
 }*/

    }//GEN-LAST:event_recChamadosMouseClicked

    private void btnReChamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReChamarActionPerformed
        if (recChamados.getSelectedRowCount() != 0) { //Verifica se existe linha selecionada para não dar erro na hora de pegar os valores
            //Pega os models das listas, para fazer as inserções e remoções
            DefaultTableModel modelOrigem = (DefaultTableModel) recChamados.getModel();
            DefaultTableModel modelDestino = (DefaultTableModel) recClientesCall.getModel();
            //Cria uma linha para ser incluida na tabela de destino, no meu caso tem duas colunas, adapte para as suas tabelas
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            Object[] obj = {recChamados.getValueAt(recChamados.getSelectedRow(), 0), recChamados.getValueAt(recChamados.getSelectedRow(), 1), dateFormat.format(cal.getTime())};
            //Adiciona no destino e remove da origem

            modelDestino.addRow(obj);

            try {
                InsertThis(Integer.parseInt(recChamados.getValueAt(recChamados.getSelectedRow(), 0).toString()), recChamados.getValueAt(recChamados.getSelectedRow(), 1).toString(), dateFormat.format(cal.getTime()));
                InsertCall(Integer.parseInt(recChamados.getValueAt(recChamados.getSelectedRow(), 0).toString()), recChamados.getValueAt(recChamados.getSelectedRow(), 1).toString(), dateFormat.format(cal.getTime()));
                //       InsertCall(Integer.parseInt(recChamados.getValueAt(recChamados.getSelectedRow(), 0).toString()), recChamados.getValueAt(recChamados.getSelectedRow(), 1).toString().substring(RecClientes.getValueAt(recChamados.getSelectedRow(), 1).toString().indexOf("-"),recChamados.getValueAt(recChamados.getSelectedRow(), 1).toString().length()).toString().replaceAll("[^a-zA-Z0-9. ]", "").trim(), dateFormat.format(cal.getTime()));
                // InsertLogs(Integer.parseInt(RecClientes.getValueAt(RecClientes.getSelectedRow(), 0).toString()), RecClientes.getValueAt(RecClientes.getSelectedRow(), 1).toString(), dateFormat.format(cal.getTime()));
            } catch (SQLException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                BuscaClienteChamados();
                BuscaCall();
            }

        } else {
//Não tem nenhuma linha selecionada na tabela de origem, faça um aviso para o usuário ou algo do tipo.
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReChamarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Buscarc5clients("%-%");        // TODO add your handling code here:
        BuscaCall();
        BuscaClienteChamados();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtBuscaClieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaClieKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaClieKeyReleased

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RecClientes;
    private javax.swing.JButton bntChamaClie;
    private javax.swing.JButton btnReChamar;
    private javax.swing.JButton btnRemoveCall;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable recChamados;
    private javax.swing.JTable recClientesCall;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JTextField txtBuscaClie;
    // End of variables declaration//GEN-END:variables

    private void Buscarc5clients(String fantasia) {
        try {

            Connection con = ConnectionFactory.getConnection("oracle");
            String sql = "SELECT seqpessoa, fantasia, carga FROM cadan_getClientCall WHERE fantasia LIKE '" + fantasia + "'";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) RecClientes.getModel();
            model.setNumRows(0);
            while (rs.next()) {
                String[] linhas = {rs.getString("SEQPESSOA"), rs.getString("FANTASIA"),rs.getString("CARGA")};
                model.addRow(linhas);
            }

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.print(e);
        }

    }

    /* try {

            Connection con = ConnectionFactory.getConnection("oracle");
            String sql = "SELECT a.seqpessoa, b.fantasia FROM mrl_cliente a"
                    + "JOIN ge_pessoa b ON (b.seqpessoa = a.seqpessoa)"
                    + "WHERE a.statuscliente = 'A' AND LIKE '" + fantasia + "'";

            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) RecebeCarga.getModel();
            model.setNumRows(0);
            while (rs.next()) {
                String[] linhas = {rs.getString("SEQPESSOA"), rs.getString("FANTASIA")};
                model.addRow(linhas);
            }

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.print(e);
        }*/
    private void BuscaClienteChamados() {
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.168.194/teste", "root", "mysql");
            String sql = "SELECT seqpessoa , fantasia, datahorachamada FROM tb_clientechamado";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) recChamados.getModel();
            model.setNumRows(0);
            while (rs.next()) {
                String[] linhas = {rs.getString("SEQPESSOA"), rs.getString("FANTASIA"),
                    rs.getString("datahorachamada")};
                model.addRow(linhas);
            }

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.print(e);
        }

    }

    private void BuscaCall() {
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.168.194/teste", "root", "mysql");
            String sql = "SELECT id_callclient, seqpessoa , fantasia, datahorachamada FROM tb_callclient";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) recClientesCall.getModel();
            model.setNumRows(0);
            while (rs.next()) {
                String[] linhas = {rs.getString("id_callclient"),rs.getString("SEQPESSOA"), rs.getString("FANTASIA"),
                    rs.getString("datahorachamada")};
                model.addRow(linhas);
            }

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.print(e);
        }

    }
    
}
