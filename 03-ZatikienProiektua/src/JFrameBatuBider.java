
public class JFrameBatuBider extends javax.swing.JFrame {

    /**
     * Creates new form JFrame1
     */
    public JFrameBatuBider() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextZenbakitzaile1 = new javax.swing.JTextField();
        jTextIzendatzaile1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextZenbakitzaile2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextIzendatzaile2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabelZenbakitzaile3 = new javax.swing.JLabel();
        jLabelIzendatzaile3 = new javax.swing.JLabel();
        jButtonOK = new javax.swing.JButton();
        jButtonEragilea = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextZenbakitzaile1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextZenbakitzaile1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextZenbakitzaile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextZenbakitzaile1ActionPerformed(evt);
            }
        });

        jTextIzendatzaile1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextIzendatzaile1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("_____");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextZenbakitzaile2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextZenbakitzaile2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("_____");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextIzendatzaile2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextIzendatzaile2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("_____");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabelZenbakitzaile3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelZenbakitzaile3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelIzendatzaile3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelIzendatzaile3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButtonOK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonOK.setText("=");
        jButtonOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOKMouseClicked(evt);
            }
        });
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jButtonEragilea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEragilea.setText("+");
        jButtonEragilea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEragileaMouseClicked(evt);
            }
        });
        jButtonEragilea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEragileaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Zatikien arteko Batuketa eta Biderketen Framea");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextIzendatzaile1)
                                .addComponent(jTextZenbakitzaile1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEragilea)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextIzendatzaile2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTextZenbakitzaile2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jButtonOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelZenbakitzaile3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIzendatzaile3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButtonOK)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextZenbakitzaile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelZenbakitzaile3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextIzendatzaile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelIzendatzaile3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jButtonEragilea))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextZenbakitzaile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextIzendatzaile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(49, 49, 49))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOKMouseClicked
   
    }//GEN-LAST:event_jButtonOKMouseClicked

    private void jButtonEragileaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEragileaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEragileaMouseClicked

    private void jButtonEragileaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEragileaActionPerformed
        if (jButtonEragilea.getText().equals("+"))
            jButtonEragilea.setText("x");
        else
            jButtonEragilea.setText("+");
        jLabelZenbakitzaile3.setText(" ");
        jLabelIzendatzaile3.setText(" ");
    }//GEN-LAST:event_jButtonEragileaActionPerformed

    private void jTextZenbakitzaile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextZenbakitzaile1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextZenbakitzaile1ActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
         Zatikia zatiki1 = new Zatikia(Integer.parseInt(jTextZenbakitzaile1.getText()),
                                     Integer.parseInt(jTextIzendatzaile1.getText()));
         Zatikia zatiki2 = new Zatikia(Integer.parseInt(jTextZenbakitzaile2.getText()),
                                     Integer.parseInt(jTextIzendatzaile2.getText()));
         Zatikia zatiki3;
         if (jButtonEragilea.getText().equals("+"))
             zatiki3 = Zatikia.batu(zatiki1, zatiki2);
         else
             zatiki3 = Zatikia.biderkatu(zatiki1, zatiki2);
         
         jLabelZenbakitzaile3.setText(" "+zatiki3.getZenbakitzailea());
         jLabelIzendatzaile3.setText(" "+zatiki3.getIzendatzailea());
    }//GEN-LAST:event_jButtonOKActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameBatuBider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameBatuBider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameBatuBider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameBatuBider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameBatuBider().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEragilea;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelIzendatzaile3;
    private javax.swing.JLabel jLabelZenbakitzaile3;
    private javax.swing.JTextField jTextIzendatzaile1;
    private javax.swing.JTextField jTextIzendatzaile2;
    private javax.swing.JTextField jTextZenbakitzaile1;
    private javax.swing.JTextField jTextZenbakitzaile2;
    // End of variables declaration//GEN-END:variables
}