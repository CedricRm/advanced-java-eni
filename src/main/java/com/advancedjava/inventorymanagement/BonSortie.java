/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.advancedjava.inventorymanagement;

/**
 *
 * @author Cedric
 */
public class BonSortie extends javax.swing.JFrame {

    /** Creates new form BonSortie */
    public BonSortie() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuContent = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        num_pro_update_txt = new javax.swing.JTextField();
        num_produit_update_txt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        quantite_update_txt = new javax.swing.JTextField();
        maj_btn1 = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        date_sortie_update_txt1 = new javax.swing.JTextField();
        SidebarPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuContent.setBackground(new java.awt.Color(255, 255, 255));
        MenuContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/advancedjava/inventorymanagement/assets/img_add.png"))); // NOI18N
        MenuContent.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 40, 50));

        jLabel5.setBackground(new java.awt.Color(0, 0, 86));
        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 86));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bon de sortie");
        MenuContent.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 20, 160, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/advancedjava/inventorymanagement/assets/img_left_arrow.png"))); // NOI18N
        MenuContent.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 20, 40, 40));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        MenuContent.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 760, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        MenuContent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 420, 400));

        jPanel1.setBackground(new java.awt.Color(0, 0, 86));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 86));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Panneau de modification");
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Numéro :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, 40));

        num_pro_update_txt.setBackground(new java.awt.Color(255, 255, 255));
        num_pro_update_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                num_pro_update_txtMouseReleased(evt);
            }
        });
        num_pro_update_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_pro_update_txtActionPerformed(evt);
            }
        });
        jPanel1.add(num_pro_update_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 110, 40));

        num_produit_update_txt.setBackground(new java.awt.Color(255, 255, 255));
        num_produit_update_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_produit_update_txtActionPerformed(evt);
            }
        });
        jPanel1.add(num_produit_update_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 110, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Num. produit :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Quantité :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, 40));

        quantite_update_txt.setBackground(new java.awt.Color(255, 255, 255));
        quantite_update_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantite_update_txtActionPerformed(evt);
            }
        });
        jPanel1.add(quantite_update_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 110, 40));

        maj_btn1.setBackground(new java.awt.Color(0, 0, 86));
        maj_btn1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        maj_btn1.setForeground(new java.awt.Color(0, 0, 86));
        maj_btn1.setText("Modifier");
        maj_btn1.setContentAreaFilled(false);
        maj_btn1.setOpaque(true);
        maj_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maj_btn1MouseClicked(evt);
            }
        });
        maj_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maj_btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(maj_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 90, 40));

        delete_btn.setBackground(new java.awt.Color(255, 229, 255));
        delete_btn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(0, 0, 86));
        delete_btn.setText("Supprimer");
        delete_btn.setContentAreaFilled(false);
        delete_btn.setOpaque(true);
        delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_btnMouseClicked(evt);
            }
        });
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        jPanel1.add(delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 100, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Date :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 40));

        date_sortie_update_txt1.setBackground(new java.awt.Color(255, 255, 255));
        date_sortie_update_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_sortie_update_txt1ActionPerformed(evt);
            }
        });
        jPanel1.add(date_sortie_update_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 110, 40));

        MenuContent.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 220, 400));

        getContentPane().add(MenuContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 760, 510));

        SidebarPanel.setBackground(new java.awt.Color(0, 0, 86));
        SidebarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        SidebarPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 180, 10));

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Invigo");
        SidebarPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 80, 30));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/advancedjava/inventorymanagement/assets/img_maximize.png"))); // NOI18N
        jLabel4.setText("Bonde sortie");
        jLabel4.setToolTipText("");
        SidebarPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/advancedjava/inventorymanagement/assets/img_product.png"))); // NOI18N
        jLabel6.setText("Produits");
        jLabel6.setToolTipText("");
        SidebarPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/advancedjava/inventorymanagement/assets/img_minimize.png"))); // NOI18N
        jLabel7.setText("Bonde entrée");
        jLabel7.setToolTipText("");
        SidebarPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        getContentPane().add(SidebarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num_pro_update_txtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num_pro_update_txtMouseReleased

    }//GEN-LAST:event_num_pro_update_txtMouseReleased

    private void num_pro_update_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_pro_update_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_pro_update_txtActionPerformed

    private void num_produit_update_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_produit_update_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_produit_update_txtActionPerformed

    private void quantite_update_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantite_update_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantite_update_txtActionPerformed

    private void maj_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maj_btn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_maj_btn1MouseClicked

    private void maj_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maj_btn1ActionPerformed
        //        DefaultTableModel model = (DefaultTableModel)table_achat.getModel();
        //
        //        String id = (table_achat.getModel().getValueAt(table_achat.getSelectedRow(),5)).toString();
        //
        //        try{
            //            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/evarotra?serverTimezone=UTC&useSSL=false", "root", "yop!123*");
            //
            //            String sql = "update achat set numCli = ?, numMat = ?, qte = ?, date_achat = ? where id = ?";
            //            pst = con.prepareStatement(sql);
            //
            //            pst.setString(1, num_cli_update_txt.getText());
            //            pst.setString(2, num_mat_update_txt.getText());
            //            pst.setString(3, qte_update_txt.getText());
            //            pst.setString(4, date_achat_update_txt.getText());
            //            pst.setString(5, id);
            //
            //            pst.executeUpdate();
            //
            //            con.close();
            //            JOptionPane.showMessageDialog(null, "Matériel mis à jour !");
            //            ListeAchat();
            //        } catch(Exception e){
            //            e.printStackTrace();
            //        }
    }//GEN-LAST:event_maj_btn1ActionPerformed

    private void delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseClicked

    }//GEN-LAST:event_delete_btnMouseClicked

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        //        DefaultTableModel model = (DefaultTableModel)table_achat.getModel();
        //        int selectionner = table_achat.getSelectedRow();
        //
        //        String id = (table_achat.getModel().getValueAt(table_achat.getSelectedRow(),5)).toString();
        //
        //        String numMat = (model.getValueAt(selectionner, 1)).toString();
        //        String qte = (model.getValueAt(selectionner, 2)).toString();
        //
        //        try{
            //            //Suppresion dans la liste des achats
            //            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/evarotra?serverTimezone=UTC&useSSL=false", "root", "yop!123*");
            //            String sql = "delete from Achat where id=?";
            //            pst = con.prepareStatement(sql);
            //
            //            pst.setString(1, id);
            //
            //            pst.executeUpdate();
            //
            //            //Update pour le stock du matériel acheté
            //            int stock = 0;
            //            String sql2 = "select Stock from Matériel where numMat like '%"+numMat+"%'";
            //            Statement st = con.createStatement();
            //            rs = st.executeQuery(sql2);
            //
            //            while(rs.next()){
                //                stock = Integer.parseInt(rs.getString("Stock"));
                //            }
            //
            //            stock = stock + Integer.parseInt(qte);
            //
            //            String sql3 = "update Matériel set Stock= ? where numMat=?";
            //            pst = con.prepareStatement(sql3);
            //
            //            pst.setString(1, String.valueOf(stock));
            //            pst.setString(2, numMat);
            //
            //            pst.executeUpdate();
            //
            //            JOptionPane.showMessageDialog(null, "Suppression effectué !");
            //
            //            con.close();
            //
            //            ListeAchat();
            //        } catch(Exception e){
            //            e.printStackTrace();
            //        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void date_sortie_update_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_sortie_update_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_sortie_update_txt1ActionPerformed

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
            java.util.logging.Logger.getLogger(BonSortie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BonSortie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BonSortie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BonSortie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BonSortie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuContent;
    private javax.swing.JPanel SidebarPanel;
    private javax.swing.JTextField date_sortie_update_txt1;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton maj_btn1;
    private javax.swing.JTextField num_pro_update_txt;
    private javax.swing.JTextField num_produit_update_txt;
    private javax.swing.JTextField quantite_update_txt;
    // End of variables declaration//GEN-END:variables

}
