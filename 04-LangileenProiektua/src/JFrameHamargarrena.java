/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uribe
 */
public class JFrameHamargarrena extends javax.swing.JFrame {

    private int n=0;
    private Langilea a[] = Langilea.nireHamarLagunLangile();
    
    public JFrameHamargarrena() {
        initComponents();
        
        Id.setText(""+a[n].getId());
        Izena.setText(""+a[n].getIzena());
        Abizena.setText(""+a[n].getAbizena());
        Soldata.setText(""+String.format("%.2f",a[n].getSoldata()));
        zenbakitzaile.setText(""+a[n].getZenbakitzailea());
        izendatzaile.setText(""+a[n].getIzendatzailea());
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
        Izena = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Abizena = new javax.swing.JTextField();
        gh = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        Abizena1 = new javax.swing.JLabel();
        Soldata = new javax.swing.JTextField();
        Abizena2 = new javax.swing.JLabel();
        izendatzaile = new javax.swing.JTextField();
        Abizena3 = new javax.swing.JLabel();
        zenbakitzaile = new javax.swing.JTextField();
        Aurrera = new javax.swing.JButton();
        Atzera1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Igo = new javax.swing.JToggleButton();
        portzentaia = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Izena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IzenaActionPerformed(evt);
            }
        });

        jLabel2.setText("Izena");

        Abizena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbizenaActionPerformed(evt);
            }
        });

        gh.setText("Abizena");

        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });

        Abizena1.setText("Id");

        Soldata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoldataActionPerformed(evt);
            }
        });

        Abizena2.setText("Soldata");

        izendatzaile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izendatzaileActionPerformed(evt);
            }
        });

        Abizena3.setText("Lanaldia");

        zenbakitzaile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zenbakitzaileActionPerformed(evt);
            }
        });

        Aurrera.setText("Aurrera");
        Aurrera.setActionCommand("");
        Aurrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AurreraActionPerformed(evt);
            }
        });

        Atzera1.setText("Atzera");
        Atzera1.setActionCommand("");
        Atzera1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atzera1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Igo Soldata");

        Igo.setText("Igo");
        Igo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgoActionPerformed(evt);
            }
        });

        portzentaia.setText("Portzentaia");
        portzentaia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portzentaiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Abizena1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Atzera1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Aurrera))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(Izena, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(gh)
                                            .addComponent(Abizena, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Abizena2)
                                            .addComponent(Soldata, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Abizena3)
                                    .addComponent(zenbakitzaile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(izendatzaile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(portzentaia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Igo)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Abizena2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Soldata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zenbakitzaile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Abizena1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Abizena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Izena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Abizena3)
                        .addGap(30, 30, 30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Atzera1)
                        .addComponent(Aurrera))
                    .addComponent(izendatzaile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Igo)
                    .addComponent(portzentaia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IzenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IzenaActionPerformed

    private void AbizenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbizenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbizenaActionPerformed

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        
    }//GEN-LAST:event_IdActionPerformed

    private void SoldataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoldataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SoldataActionPerformed

    private void izendatzaileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izendatzaileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_izendatzaileActionPerformed

    private void zenbakitzaileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zenbakitzaileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zenbakitzaileActionPerformed

    private void AurreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AurreraActionPerformed
        
        n+=1;
        
        Id.setText(""+a[n].getId());
        Izena.setText(""+a[n].getIzena());
        Abizena.setText(""+a[n].getAbizena());
        Soldata.setText(""+String.format("%.2f",a[n].getSoldata()));
        zenbakitzaile.setText(""+a[n].getZenbakitzailea());
        izendatzaile.setText(""+a[n].getIzendatzailea());
        
    }//GEN-LAST:event_AurreraActionPerformed

    private void Atzera1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atzera1ActionPerformed
        n-=1;
        
        Id.setText(""+a[n].getId());
        Izena.setText(""+a[n].getIzena());
        Abizena.setText(""+a[n].getAbizena());
        Soldata.setText(""+String.format("%.2f" ,a[n].getSoldata()));
        zenbakitzaile.setText(""+a[n].getZenbakitzailea());
        izendatzaile.setText(""+a[n].getIzendatzailea());
    }//GEN-LAST:event_Atzera1ActionPerformed

    private void IgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgoActionPerformed
        
        a[n].soldataIgo(Integer.parseInt(portzentaia.getText()));
        Soldata.setText(""+String.format("%.2f",a[n].getSoldata()));
        
    }//GEN-LAST:event_IgoActionPerformed

    private void portzentaiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portzentaiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portzentaiaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameHamargarrena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameHamargarrena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameHamargarrena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameHamargarrena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameHamargarrena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Abizena;
    private javax.swing.JLabel Abizena1;
    private javax.swing.JLabel Abizena2;
    private javax.swing.JLabel Abizena3;
    private javax.swing.JButton Atzera1;
    private javax.swing.JButton Aurrera;
    private javax.swing.JTextField Id;
    private javax.swing.JToggleButton Igo;
    private javax.swing.JTextField Izena;
    private javax.swing.JTextField Soldata;
    private javax.swing.JLabel gh;
    private javax.swing.JTextField izendatzaile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField portzentaia;
    private javax.swing.JTextField zenbakitzaile;
    // End of variables declaration//GEN-END:variables
}