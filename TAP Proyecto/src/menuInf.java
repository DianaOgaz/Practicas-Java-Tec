
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class menuInf extends javax.swing.JFrame {

    miniCombo minic;
    Connection con = conexion();
    int id;

    public menuInf(miniCombo minic) {
        initComponents();
        actualizarDatos();
        
        this.minic = minic;
        
        cmbJuguete.addItem("Pelota");
        cmbJuguete.addItem("Muñeca");
        cmbJuguete.addItem("Barquito");
        cmbJuguete.addItem("Carrito");
        cmbJuguete.addItem("Boomerang");
        cmbJuguete.addItem("Crayones");
        cmbJuguete.addItem("Legos");
    }

    public void actualizarDatos() {

        String[] columnas = {"id", "Hamburgesa", "Total"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        tCombos.setModel(modelo);

        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM combos");

            while (rs.next()) {
                String[] datos = new String[3];
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("tipoh");
                datos[2] = rs.getString("total");

                modelo.addRow(datos);

            }

        } catch (SQLException ex) {
            System.out.println("" + ex);
        }

    }

    public Connection conexion() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/burger?serverTimezone=UTC", "root", "1234");

            System.out.println("Conexion lograda");
        } catch (SQLException ex) {
            System.out.println("Conexion fallida" + ex);
        }
        return con;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tCombos = new javax.swing.JTable();
        cmbJuguete = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        tCombos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tCombos);

        cmbJuguete.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cmbJuguete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleciona juguete" }));
        cmbJuguete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJugueteActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("Seleccionar combo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cmbJuguete, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbJuguete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fila = tCombos.getSelectedRow();
        id = Integer.parseInt(tCombos.getValueAt(fila, 0).toString());

        minic.setCombo(tCombos.getValueAt(fila, 0).toString());
        minic.setJuguete(cmbJuguete.getSelectedItem().toString());
        minic.combo = tCombos.getValueAt(fila, 0).toString();
        minic.juguete = cmbJuguete.getSelectedItem().toString();
        System.out.println(minic.combo +" "+ minic.juguete);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbJugueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJugueteActionPerformed

    }//GEN-LAST:event_cmbJugueteActionPerformed

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
            java.util.logging.Logger.getLogger(menuInf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuInf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuInf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuInf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbJuguete;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tCombos;
    // End of variables declaration//GEN-END:variables
}
