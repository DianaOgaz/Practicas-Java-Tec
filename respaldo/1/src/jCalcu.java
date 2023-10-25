
public class jCalcu extends javax.swing.JFrame {

    static int iValA;
    public jCalcu() {
        initComponents();
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMostrar = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnPor = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblMostrar.setBackground(new java.awt.Color(204, 255, 255));
        lblMostrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMostrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn1.setBackground(new java.awt.Color(255, 204, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 204, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 204, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(255, 204, 255));
        btn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.setToolTipText("");
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn0MouseClicked(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 204, 255));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 204, 255));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 204, 255));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 204, 255));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 204, 255));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 204, 255));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });

        btnMas.setBackground(new java.awt.Color(255, 204, 255));
        btnMas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMas.setText("+");
        btnMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasMouseClicked(evt);
            }
        });

        btnMenos.setBackground(new java.awt.Color(255, 204, 255));
        btnMenos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMenos.setText("-");
        btnMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenosMouseClicked(evt);
            }
        });

        btnPor.setBackground(new java.awt.Color(255, 204, 255));
        btnPor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPor.setText("X");
        btnPor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPorMouseClicked(evt);
            }
        });

        btnDiv.setBackground(new java.awt.Color(255, 204, 255));
        btnDiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDiv.setText("/");
        btnDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDivMouseClicked(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(255, 204, 255));
        btnIgual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnPor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        lblMostrar.setText(lblMostrar.getText() + "1");
        
    }//GEN-LAST:event_btn1MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        lblMostrar.setText(lblMostrar.getText() + "2");
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        lblMostrar.setText(lblMostrar.getText() + "3");
    }//GEN-LAST:event_btn3MouseClicked

    private void btnMasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasMouseClicked
       lblMostrar.setText(lblMostrar.getText() + "+");
    }//GEN-LAST:event_btnMasMouseClicked

    private void btnMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMouseClicked
        lblMostrar.setText(lblMostrar.getText() + "-");
    }//GEN-LAST:event_btnMenosMouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
       lblMostrar.setText(lblMostrar.getText() + "4");
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
       lblMostrar.setText(lblMostrar.getText() + "5");
    }//GEN-LAST:event_btn5MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        lblMostrar.setText(lblMostrar.getText() + "6");
    }//GEN-LAST:event_btn6MouseClicked

    private void btnPorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPorMouseClicked
        lblMostrar.setText(lblMostrar.getText() + "X");
    }//GEN-LAST:event_btnPorMouseClicked

    private void btnDivMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivMouseClicked
               lblMostrar.setText(lblMostrar.getText() + "/");

    }//GEN-LAST:event_btnDivMouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
                lblMostrar.setText(lblMostrar.getText() + "7");

    }//GEN-LAST:event_btn7MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8MouseClicked

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked
                lblMostrar.setText(lblMostrar.getText() + "9");

    }//GEN-LAST:event_btn9MouseClicked

    private void btnIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIgualMouseClicked
         
          

    }//GEN-LAST:event_btnIgualMouseClicked

    private void btn0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseClicked
                lblMostrar.setText(lblMostrar.getText() + "0");

    }//GEN-LAST:event_btn0MouseClicked

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
            java.util.logging.Logger.getLogger(jCalcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jCalcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jCalcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jCalcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jCalcu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnPor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMostrar;
    // End of variables declaration//GEN-END:variables
}
