
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Ventas extends java.awt.Frame {

    int id;

    public Ventas() {
        initComponents();
        actualizarDatos();
    }

    public void actualizarDatos() {
        String[] columnas = {"Cantidad", "Tipo Hamburgesa", "Refresco", "Nombre", "Fecha", "Cantidad"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        tVentas.setModel(modelo);

        Connection con = conexion();

        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM compras");

            while (rs.next()) {
                String[] datos = new String[6];
                datos[0] = rs.getString("cantidad");
                datos[1] = rs.getString("tipoh");
                datos[2] = rs.getString("ref");
                datos[3] = rs.getString("nombc");
                datos[4] = rs.getString("fecha");
                datos[5] = rs.getString("total");
                modelo.addRow(datos);

            }

        } catch (SQLException ex) {
            System.out.println("" + ex);
        }

    }

    public void consultas() {
        String[] columnas = {"Cantidad", "Tipo Hamburgesa", "Refresco", "Nombre", "Fecha", "Cantidad"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        tVentas.setModel(modelo);

        Connection con = conexion();

        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM compras WHERE fecha ='" +txtFecha.getText()+"'");

            while (rs.next()) {
                String[] datos = new String[6];
                datos[0] = rs.getString("cantidad");
                datos[1] = rs.getString("tipoh");
                datos[2] = rs.getString("ref");
                datos[3] = rs.getString("nombc");
                datos[4] = rs.getString("fecha");
                datos[5] = rs.getString("total");
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

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tVentas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtSelect = new javax.swing.JButton();
        txtSelect1 = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        tVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tVentas);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Busqueda por fecha");

        txtFecha.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtFecha.setText("00-00-2020");

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtSelect.setBackground(new java.awt.Color(204, 204, 255));
        txtSelect.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtSelect.setText("Seleccionar");
        txtSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectActionPerformed(evt);
            }
        });

        txtSelect1.setBackground(new java.awt.Color(204, 204, 255));
        txtSelect1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        txtSelect1.setText("Mostrar todo");
        txtSelect1.setActionCommand("Mostrar todos \nlos registros");
        txtSelect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelect1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtSelect1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addComponent(txtSelect1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      consultas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectActionPerformed
        int fila = tVentas.getSelectedRow();
        id = Integer.parseInt(tVentas.getValueAt(0, 0).toString());
        txtFecha.setText(tVentas.getValueAt(fila, 4).toString());
        

    }//GEN-LAST:event_txtSelectActionPerformed

    private void txtSelect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelect1ActionPerformed
        actualizarDatos();
    }//GEN-LAST:event_txtSelect1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tVentas;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JButton txtSelect;
    private javax.swing.JButton txtSelect1;
    // End of variables declaration//GEN-END:variables
}
