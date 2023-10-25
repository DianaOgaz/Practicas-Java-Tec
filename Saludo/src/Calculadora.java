/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }
int total = 0, n =0;
        
       String op = "";
    




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        bnt4 = new javax.swing.JButton();
        bnt5 = new javax.swing.JButton();
        bnt2 = new javax.swing.JButton();
        bnt3 = new javax.swing.JButton();
        bnt6 = new javax.swing.JButton();
        bnt7 = new javax.swing.JButton();
        bnt8 = new javax.swing.JButton();
        bnt9 = new javax.swing.JButton();
        bntSuma = new javax.swing.JButton();
        bntMulti = new javax.swing.JButton();
        bntDiv = new javax.swing.JButton();
        bntResta = new javax.swing.JButton();
        bntIgual = new javax.swing.JButton();
        bnt0 = new javax.swing.JButton();
        lblMostrar = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        bntPunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OwO");
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn1.setBackground(new java.awt.Color(255, 153, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        bnt4.setBackground(new java.awt.Color(255, 153, 255));
        bnt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnt4.setText("4");
        bnt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt4ActionPerformed(evt);
            }
        });

        bnt5.setBackground(new java.awt.Color(255, 153, 255));
        bnt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnt5.setText("5");
        bnt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt5ActionPerformed(evt);
            }
        });

        bnt2.setBackground(new java.awt.Color(255, 153, 255));
        bnt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnt2.setText("2");
        bnt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt2ActionPerformed(evt);
            }
        });

        bnt3.setBackground(new java.awt.Color(255, 153, 255));
        bnt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnt3.setText("3");
        bnt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt3ActionPerformed(evt);
            }
        });

        bnt6.setBackground(new java.awt.Color(255, 153, 255));
        bnt6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnt6.setText("6");
        bnt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt6ActionPerformed(evt);
            }
        });

        bnt7.setBackground(new java.awt.Color(255, 153, 255));
        bnt7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnt7.setText("7");
        bnt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt7ActionPerformed(evt);
            }
        });

        bnt8.setBackground(new java.awt.Color(255, 153, 255));
        bnt8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnt8.setText("8");
        bnt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt8ActionPerformed(evt);
            }
        });

        bnt9.setBackground(new java.awt.Color(255, 153, 255));
        bnt9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnt9.setText("9");
        bnt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt9ActionPerformed(evt);
            }
        });

        bntSuma.setBackground(new java.awt.Color(255, 153, 255));
        bntSuma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntSuma.setText("+");
        bntSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSumaActionPerformed(evt);
            }
        });

        bntMulti.setBackground(new java.awt.Color(255, 153, 255));
        bntMulti.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntMulti.setText("x");
        bntMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMultiActionPerformed(evt);
            }
        });

        bntDiv.setBackground(new java.awt.Color(255, 153, 255));
        bntDiv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntDiv.setText("/");
        bntDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDivActionPerformed(evt);
            }
        });

        bntResta.setBackground(new java.awt.Color(255, 153, 255));
        bntResta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntResta.setText("--");
        bntResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRestaActionPerformed(evt);
            }
        });

        bntIgual.setBackground(new java.awt.Color(153, 153, 255));
        bntIgual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntIgual.setText("=");
        bntIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntIgualActionPerformed(evt);
            }
        });

        bnt0.setBackground(new java.awt.Color(255, 153, 255));
        bnt0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bnt0.setText("0");
        bnt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt0ActionPerformed(evt);
            }
        });

        lblMostrar.setBackground(new java.awt.Color(255, 204, 255));

        btnBorrar.setBackground(new java.awt.Color(255, 153, 255));
        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBorrar.setText("c");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 153, 255));
        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCerrar.setText("off");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        bntPunto.setBackground(new java.awt.Color(255, 153, 255));
        bntPunto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bntPunto.setText(".");
        bntPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bnt7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bnt8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bnt9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bnt3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(bnt4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bnt0, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bntPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bntDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(bntMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bntIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bnt5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bnt6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(bntSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(bntResta, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnt4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntResta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnt7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bnt9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnt0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt5ActionPerformed
        total = Integer.parseInt(lblMostrar.getText());
        lblMostrar.setText(lblMostrar.getText() + "5");    

    }//GEN-LAST:event_bnt5ActionPerformed

    private void bnt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt8ActionPerformed
       lblMostrar.setText(lblMostrar.getText() + "8");
    }//GEN-LAST:event_bnt8ActionPerformed

    private void bnt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt9ActionPerformed
      lblMostrar.setText(lblMostrar.getText() + "9");
    }//GEN-LAST:event_bnt9ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
 lblMostrar.setText(lblMostrar.getText() + "1");
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void bnt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt2ActionPerformed
lblMostrar.setText(lblMostrar.getText() + "2");        // TODO add your handling code here:
    }//GEN-LAST:event_bnt2ActionPerformed

    private void bnt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt3ActionPerformed
 lblMostrar.setText(lblMostrar.getText() + "3");
    }//GEN-LAST:event_bnt3ActionPerformed

    private void bnt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt4ActionPerformed
lblMostrar.setText(lblMostrar.getText() + "4");
    }//GEN-LAST:event_bnt4ActionPerformed

    private void bnt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt6ActionPerformed
        lblMostrar.setText(lblMostrar.getText() + "6");
    }//GEN-LAST:event_bnt6ActionPerformed

    private void bnt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt7ActionPerformed
        lblMostrar.setText(lblMostrar.getText() + "7");
    }//GEN-LAST:event_bnt7ActionPerformed

    private void bnt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt0ActionPerformed
     lblMostrar.setText(lblMostrar.getText() + "0");
    }//GEN-LAST:event_bnt0ActionPerformed

    private void bntSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSumaActionPerformed
        total = Integer.parseInt(lblMostrar.getText());
        lblMostrar.setText(lblMostrar.getText() + "+");
        op = "+";
        
    }//GEN-LAST:event_bntSumaActionPerformed

    private void bntRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRestaActionPerformed
        total = Integer.parseInt(lblMostrar.getText());
    lblMostrar.setText(lblMostrar.getText() + "-");
    op = "-";
    }//GEN-LAST:event_bntRestaActionPerformed

    private void bntMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMultiActionPerformed
        total = Integer.parseInt(lblMostrar.getText());
        lblMostrar.setText( lblMostrar.getText() + "x");
        op = "x";
    }//GEN-LAST:event_bntMultiActionPerformed

    private void bntDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDivActionPerformed
       total = Integer.parseInt(lblMostrar.getText());
        lblMostrar.setText(lblMostrar.getText() + "/");
        op = "/";
    }//GEN-LAST:event_bntDivActionPerformed

    private void bntIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntIgualActionPerformed

       int s = lblMostrar.getText().indexOf(op);
       String t = lblMostrar.getText().substring(s+1);
       lblMostrar.setText(t);
       n = Integer.parseInt(t); 
       
        switch (op) {
            case "+":
                total += n;
                break;
                case "-":
                    total -= n;
                    break;
                case "x":
                    total *= n;
                    break;
                case "/":
                    total /= n;
                    break;
            default:
                throw new AssertionError();
        }
       lblMostrar.setText(total + "");
    }//GEN-LAST:event_bntIgualActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
       
        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void bntPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntPuntoActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt0;
    private javax.swing.JButton bnt2;
    private javax.swing.JButton bnt3;
    private javax.swing.JButton bnt4;
    private javax.swing.JButton bnt5;
    private javax.swing.JButton bnt6;
    private javax.swing.JButton bnt7;
    private javax.swing.JButton bnt8;
    private javax.swing.JButton bnt9;
    private javax.swing.JButton bntDiv;
    private javax.swing.JButton bntIgual;
    private javax.swing.JButton bntMulti;
    private javax.swing.JButton bntPunto;
    private javax.swing.JButton bntResta;
    private javax.swing.JButton bntSuma;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel lblMostrar;
    // End of variables declaration//GEN-END:variables
}
