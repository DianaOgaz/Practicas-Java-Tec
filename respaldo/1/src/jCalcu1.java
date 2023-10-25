
import java.awt.event.KeyEvent;

public class jCalcu1 extends javax.swing.JFrame {

    String cadena;
    int cadena1;
    double cadena1Dob;
    int cadena2;
    double cadena2Dob;
    boolean bCont = false;
    int iResu;
    double iResuDob;

    public jCalcu1() {
        initComponents();

    }

    public void Suma(java.awt.event.KeyEvent evt) {
        if (bCont == false) {

            for (int i = 0; i <= cadena.length(); i++) {

                if (!cadena.contains("+")) {
                    cadena1 = Integer.parseInt(txt1.getText());

                } else if (cadena.contains("+")) {
                    txt1.setText("");
                    cadena = "";
                    bCont = true;
                }

            }
        }
        if (bCont == true) {
            for (int i = 0; i < cadena.length(); i++) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadena2 = Integer.parseInt(cadena);
                    iResu = cadena1 + cadena2;
                    lbl1.setText(cadena1 + "+" + cadena2 + "=" + iResu);
                    bCont = false;
                }
            }
        }
    }

    public void Resta(java.awt.event.KeyEvent evt) {
        if (bCont == false) {

            for (int i = 0; i < cadena.length(); i++) {

                if (!cadena.contains("-")) {
                    cadena1 = Integer.parseInt(txt1.getText());

                } else if (cadena.contains("-")) {
                    txt1.setText("");
                    cadena = "";
                    bCont = true;
                }

            }
        }
        if (bCont == true) {
            for (int i = 0; i < cadena.length(); i++) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadena2 = Integer.parseInt(cadena);
                    iResu = cadena1 - cadena2;
                    lbl1.setText(cadena1 + "-" + cadena2 + "=" + iResu);
                    bCont = false;
                }
            }
        }
    }

    public void Div(java.awt.event.KeyEvent evt) {
        if (bCont == false) {

            for (int i = 0; i < cadena.length(); i++) {

                if (!cadena.contains("/")) {
                    cadena1Dob = Integer.parseInt(txt1.getText());

                } else if (cadena.contains("/")) {
                    txt1.setText("");
                    cadena = "";
                    bCont = true;
                }

            }
        }
        if (bCont == true) {
            for (int i = 0; i < cadena.length(); i++) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadena2Dob = Integer.parseInt(cadena);
                    iResuDob = cadena1Dob / cadena2Dob;
                    lbl1.setText(cadena1 + "/" + cadena2 + "=" + iResuDob);
                    bCont = false;
                }
            }
        }
    }

    public void Multi(java.awt.event.KeyEvent evt) {
        if (bCont == false) {

            for (int i = 0; i < cadena.length(); i++) {

                if (!cadena.contains("*")) {
                    cadena1 = Integer.parseInt(txt1.getText());

                } else if (cadena.contains("*")) {
                    txt1.setText("");
                    cadena = "";
                    bCont = true;
                }

            }
        }
        if (bCont == true) {
            for (int i = 0; i < cadena.length(); i++) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    cadena2 = Integer.parseInt(cadena);
                    iResu = cadena1 * cadena2;
                    lbl1.setText(cadena1 + "*" + cadena2 + "=" + iResu);
                    bCont = false;
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed

    }//GEN-LAST:event_txt1ActionPerformed

    private void txt1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyPressed
        lbl1.setText(String.valueOf(txt1.getText()));
        cadena = txt1.getText();
        char iOperacion = evt.getKeyChar() ;
        
        switch (iOperacion) {
            case '+':
                Suma(evt);
                break;
            case '-':
                Resta(evt);
                break;
            case '*':
                Multi(evt);
                break;
            case '/':
                Div(evt);
                break;
        }

        //System.out.println(KeyEvent.VK_PLUS);

    }//GEN-LAST:event_txt1KeyPressed

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
            java.util.logging.Logger.getLogger(jCalcu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jCalcu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jCalcu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jCalcu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jCalcu1().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
