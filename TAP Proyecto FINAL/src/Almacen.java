
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Almacen extends javax.swing.JFrame {

    datosAlmacen datosA = new datosAlmacen();
    Connection con = conexion();

    int id = 1; 
    int ingDisp = 0;

    public Almacen() {
        initComponents();

        actualizarDatos();
        actualizarCompras();

    }

    public void verificarIngredientes() {
        if (datosA.getCarne() <= 0) {
            JOptionPane.showMessageDialog(null, "FALTAN INGREDIENTES = Carne ");
            ingDisp++;
        }
        if (datosA.getLechuga() <= 0) {
            JOptionPane.showMessageDialog(null, "FALTAN INGREDIENTES = Lechuga");
            ingDisp++;
        }
        if (datosA.getPan() <= 0) {
            JOptionPane.showMessageDialog(null, "FALTAN INGREDIENTES = Pan");
            ingDisp++;
        }
        if (datosA.getQueso() <= 0) {
            JOptionPane.showMessageDialog(null, "FALTAN INGREDIENTES = Queso");
            ingDisp++;
        }
        if (datosA.getTomate() <= 0) {
            JOptionPane.showMessageDialog(null, "FALTAN INGREDIENTES = Tomate");
            ingDisp++;
        }
       
    }

    public void actualizarAlmacen() {
        System.out.println("Metodo " + datosA.pan + " " + datosA.queso + " " + datosA.lechuga + " " + datosA.tomate + " " + datosA.carne);

        Statement st;

        try {
            System.out.println("ENTRÓ AL TRY");
            st = con.createStatement();

            String query = "UPDATE almacen SET "
                    + "id = " + id + ","
                    + "pan = " + datosA.pan + ","
                    + "lechuga = " + datosA.lechuga + ","
                    + "tomate = " + datosA.tomate + ","
                    + "queso = " + datosA.queso + ","
                    + "carne = " + datosA.carne + " "
                    + "WHERE id = " + id;
            System.out.println("ID ---------------------" + id);
            st.executeUpdate(query);
            System.out.println(query);

        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
        actualizarDatos();
    }

    public void actualizarCompras() {
        String[] columnas = {"Cantidad", "Tipo Hamburgesa", "Refresco", "Nombre", "Fecha", "Cantidad"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        tCompras.setModel(modelo);

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

    public void actualizarDatos() {
        System.out.println("ACTUALIZAR DATOS " + datosA.pan + " " + datosA.queso + " " + datosA.lechuga + " " + datosA.tomate + " " + datosA.carne);
        String[] columnas = {"id", "Pan", "Lechuga", "Tomate", "Queso", "Carne"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        tAlmacen.setModel(modelo);

        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM almacen");

            while (rs.next()) {
                String[] datos = new String[6];
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("pan");
                datos[2] = rs.getString("lechuga");
                datos[3] = rs.getString("tomate");
                datos[4] = rs.getString("queso");
                datos[5] = rs.getString("carne");

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPan = new javax.swing.JTextField();
        txtTomate = new javax.swing.JTextField();
        txtLechuga = new javax.swing.JTextField();
        txtQueso = new javax.swing.JTextField();
        txtCarne = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tAlmacen = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCompras = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtRef = new javax.swing.JTextField();
        txtNombc = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Lechuga");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tomate");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Pan");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Carne");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Queso");

        txtLechuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLechugaActionPerformed(evt);
            }
        });

        txtQueso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuesoActionPerformed(evt);
            }
        });

        txtCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarneActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tAlmacen.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tAlmacen);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tCompras.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tCompras);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Cantidad");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Tipo");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Refresco");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Total");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Fecha");

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setText(" Realizar Compra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTomate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLechuga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQueso, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLechuga, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQueso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTomate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLechugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLechugaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLechugaActionPerformed

    private void txtQuesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuesoActionPerformed

    private void txtCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        datosA.setPan(Integer.parseInt(txtPan.getText()));
        datosA.setLechuga(Integer.parseInt(txtLechuga.getText()));
        datosA.setTomate(Integer.parseInt(txtTomate.getText()));
        datosA.setQueso(Integer.parseInt(txtQueso.getText()));
        datosA.setCarne(Integer.parseInt(txtCarne.getText()));
        actualizarAlmacen();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        id = 1;
        txtPan.setText(tAlmacen.getValueAt(0, 1).toString());
        txtLechuga.setText(tAlmacen.getValueAt(0, 2).toString());
        txtTomate.setText(tAlmacen.getValueAt(0, 3).toString());
        txtQueso.setText(tAlmacen.getValueAt(0, 4).toString());
        txtCarne.setText(tAlmacen.getValueAt(0, 5).toString());

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String cantidad = txtCantidad.getText();
        String tipoh = txtTipo.getText();
        String ref = txtRef.getText();
        String nombc = txtNombc.getText();
        String fecha = txtFecha.getText();
        String total = txtTotal.getText();

        //La amborgeza normal tiene todos los ingredientes.
        if (tipoh.equals("normal")) {
            int Pan = Integer.parseInt(tAlmacen.getValueAt(0, 1).toString()) - (1 * Integer.parseInt(cantidad));
            datosA.setPan(Pan);
            int Lechuga = Integer.parseInt(tAlmacen.getValueAt(0, 2).toString()) - (1 * Integer.parseInt(cantidad));
            datosA.setLechuga(Lechuga);
            int Tomate = Integer.parseInt(tAlmacen.getValueAt(0, 3).toString()) - (1 * Integer.parseInt(cantidad));
            datosA.setTomate(Tomate);
            int Queso = Integer.parseInt(tAlmacen.getValueAt(0, 4).toString()) - (1 * Integer.parseInt(cantidad));
            datosA.setQueso(Queso);
            int Carne = Integer.parseInt(tAlmacen.getValueAt(0, 5).toString()) - (1 * Integer.parseInt(cantidad));
            datosA.setCarne(Carne);

            
        } else //DOBLE Todos los ingredientes más doble carne.
        if (tipoh.equals("doble")) {
            int Pan = Integer.parseInt(tAlmacen.getValueAt(0, 1).toString()) - (1 * Integer.parseInt(cantidad));
            datosA.setPan(Pan);
            int Lechuga = Integer.parseInt(tAlmacen.getValueAt(0, 2).toString()) - (1 * Integer.parseInt(cantidad));
            datosA.setLechuga(Lechuga);
            int Tomate = Integer.parseInt(tAlmacen.getValueAt(0, 3).toString()) - (1 * Integer.parseInt(cantidad));
            datosA.setTomate(Tomate);
            int Queso = Integer.parseInt(tAlmacen.getValueAt(0, 4).toString()) - (1 * Integer.parseInt(cantidad));
            datosA.setQueso(Queso);
            int Carne = Integer.parseInt(tAlmacen.getValueAt(0, 5).toString()) - (2 * Integer.parseInt(cantidad));
            datosA.setCarne(Carne);

           
        } else //especia: todos los ingredientes con doble carne y queso
        if (tipoh.equals("especial")) {
            int Pan = Integer.parseInt(tAlmacen.getValueAt(0, 1).toString()) - (1 * Integer.parseInt(cantidad));
            datosA.setPan(Pan);
            int Lechuga = Integer.parseInt(tAlmacen.getValueAt(0, 2).toString()) - (1 * Integer.parseInt(cantidad));
            datosA.setLechuga(Lechuga);
            int Tomate = Integer.parseInt(tAlmacen.getValueAt(0, 3).toString()) - (1 * Integer.parseInt(cantidad));
            datosA.setTomate(Tomate);
            int Queso = Integer.parseInt(tAlmacen.getValueAt(0, 4).toString()) - (2 * Integer.parseInt(cantidad));
            datosA.setQueso(Queso);
            int Carne = Integer.parseInt(tAlmacen.getValueAt(0, 5).toString()) - (2 * Integer.parseInt(cantidad));
            datosA.setCarne(Carne);

            // System.out.println("COMPRA " + tipoh + " " + datosA.pan + " " + datosA.queso + " " + datosA.lechuga + " " + datosA.tomate + " " + datosA.carne);
        } else {
            JOptionPane.showMessageDialog(null, "INSERTE UN TIPO DE HAMBURGUESA REGISTRADO");
        }
        verificarIngredientes();
        if (ingDisp == 0) {
            try {
                Statement st = con.createStatement();
                String query = "INSERT INTO compras (cantidad,tipoh,ref,nombc,fecha,total) VALUES (\"" + cantidad + "\",\"" + tipoh + "\",\"" + ref + "\",\"" + nombc + "\",\"" + fecha + "\",\"" + total + "\")";
                st.execute(query);

            } catch (SQLException ex) {
                System.out.println("Error" + ex);
            }
            actualizarCompras();
            actualizarAlmacen();
            txtCantidad.setText("");
            txtTipo.setText("");
            txtRef.setText("");
            txtNombc.setText("");
            txtTotal.setText("");
        }


    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tAlmacen;
    private javax.swing.JTable tCompras;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCarne;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtLechuga;
    private javax.swing.JTextField txtNombc;
    private javax.swing.JTextField txtPan;
    private javax.swing.JTextField txtQueso;
    private javax.swing.JTextField txtRef;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTomate;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
