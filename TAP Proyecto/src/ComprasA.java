
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ComprasA extends javax.swing.JFrame {

    Connection con = conexion();
    juguetesAlmacen juguetesA = new juguetesAlmacen();

    miniCombo minic = new miniCombo();
    menuInf mini = new menuInf(minic);
    datosAlmacen datosA = new datosAlmacen();

    int id = 1;
    int ingDisp = 0;

    public ComprasA() {
        initComponents();

        actualizarDatos();
        actualizarCompras();
        actualizarJuguetes();

    }

    public void verificarIngredientes() {
        if (datosA.getCarne() <= -1) {
            JOptionPane.showMessageDialog(null, "FALTAN INGREDIENTES = Carne ");
            ingDisp++;
        }
        if (datosA.getLechuga() <= -1) {
            JOptionPane.showMessageDialog(null, "FALTAN INGREDIENTES = Lechuga");
            ingDisp++;
        }
        if (datosA.getPan() <= -1) {
            JOptionPane.showMessageDialog(null, "FALTAN INGREDIENTES = Pan");
            ingDisp++;
        }
        if (datosA.getQueso() <= -1) {
            JOptionPane.showMessageDialog(null, "FALTAN INGREDIENTES = Queso");
            ingDisp++;
        }
        if (datosA.getTomate() <= -1) {
            JOptionPane.showMessageDialog(null, "FALTAN INGREDIENTES = Tomate");
            ingDisp++;
        }

    }

    public void actualizarAlmacen() {

        Statement st;

        try {
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
        String[] columnas = {"Cantidad", "Tipo Hamburgesa", "Refresco", "Nombre", "Fecha", "Total", "Combo", "Juguete"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        tCompras.setModel(modelo);

        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM compras");

            while (rs.next()) {
                String[] datos = new String[8];
                datos[0] = rs.getString("cantidad");
                datos[1] = rs.getString("tipoh");
                datos[2] = rs.getString("ref");
                datos[3] = rs.getString("nombc");
                datos[4] = rs.getString("fecha");
                datos[5] = rs.getString("total");
                datos[6] = rs.getString("cajita");
                datos[7] = rs.getString("juguete");

                modelo.addRow(datos);

            }

        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
    }

    public void actualizarJuguetes() {

        String[] columnas = {"id", "Pelota", "Muñeca", "Barco", "Carro", "Boomerang", "Crayones", "Legos"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        tJuguetes.setModel(modelo);

        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM cajita");

            while (rs.next()) {
                String[] datos = new String[8];
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("pelota");
                datos[2] = rs.getString("muñeca");
                datos[3] = rs.getString("barco");
                datos[4] = rs.getString("carrito");
                datos[5] = rs.getString("bom");
                datos[6] = rs.getString("crayones");
                datos[7] = rs.getString("lego");

                modelo.addRow(datos);

            }

        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
    }

    public void actualizarDatos() {

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

    public void actualizarAlmacenJ() {

        Statement st;

        try {

            st = con.createStatement();
            System.out.println(juguetesA.pelota);
            String query = "UPDATE cajita SET "
                    + "id = " + id + ","
                    + "pelota = " + juguetesA.pelota + ","
                    + "muñeca = " + juguetesA.muñeca + ","
                    + "barco = " + juguetesA.barco + ","
                    + "carrito = " + juguetesA.carrito + ","
                    + "bom = " + juguetesA.bom + ","
                    + "crayones = " + juguetesA.crayones + ","
                    + "lego = " + juguetesA.lego + " "
                    + "WHERE id = " + id;

            st.executeUpdate(query);
            System.out.println(query);

        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
        actualizarDatos();
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
        jButton4 = new javax.swing.JButton();
        wea = new javax.swing.JScrollPane();
        tJuguetes = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMuñeca = new javax.swing.JTextField();
        txtBom = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPelota = new javax.swing.JTextField();
        txtCarrito = new javax.swing.JTextField();
        txtBarco = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtCrayones = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtLegos = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

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

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton4.setText("Mini Menú");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tJuguetes.setModel(new javax.swing.table.DefaultTableModel(
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
        wea.setViewportView(tJuguetes);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Inventario Juguetes");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Inventario Hamburgesa");

        txtMuñeca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMuñecaActionPerformed(evt);
            }
        });

        txtBom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBomActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Muñeca");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Carrito");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Pelota");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Boomerang");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Barco");

        txtBarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarcoActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton5.setText("Actualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton6.setText("Seleccionar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtCrayones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrayonesActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Crayones");

        txtLegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLegosActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Legos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                            .addComponent(wea)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(264, 264, 264)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTomate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtLechuga, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtQueso, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPan, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBom, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMuñeca, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPelota, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCrayones, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtLegos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(705, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(193, 193, 193)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(wea, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtQueso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLechuga, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTomate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(257, 257, 257))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPelota, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMuñeca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBarco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCrayones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLegos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(694, Short.MAX_VALUE)))
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

        int Pan, Lechuga, Tomate, Queso, Carne;
        int pelota, muñeca, barco, carrito, bom, crayones, lego;

        switch (tipoh) {
            case "normal":
                Pan = Integer.parseInt(tAlmacen.getValueAt(0, 1).toString()) - (1 * Integer.parseInt(cantidad));
                datosA.setPan(Pan);
                Lechuga = Integer.parseInt(tAlmacen.getValueAt(0, 2).toString()) - (1 * Integer.parseInt(cantidad));
                datosA.setLechuga(Lechuga);
                Tomate = Integer.parseInt(tAlmacen.getValueAt(0, 3).toString()) - (1 * Integer.parseInt(cantidad));
                datosA.setTomate(Tomate);
                Queso = Integer.parseInt(tAlmacen.getValueAt(0, 4).toString()) - (1 * Integer.parseInt(cantidad));
                datosA.setQueso(Queso);
                Carne = Integer.parseInt(tAlmacen.getValueAt(0, 5).toString()) - (1 * Integer.parseInt(cantidad));
                datosA.setCarne(Carne);
                break;

            case "doble":
                Pan = Integer.parseInt(tAlmacen.getValueAt(0, 1).toString()) - (1 * Integer.parseInt(cantidad));
                datosA.setPan(Pan);
                Lechuga = Integer.parseInt(tAlmacen.getValueAt(0, 2).toString()) - (1 * Integer.parseInt(cantidad));
                datosA.setLechuga(Lechuga);
                Tomate = Integer.parseInt(tAlmacen.getValueAt(0, 3).toString()) - (1 * Integer.parseInt(cantidad));
                datosA.setTomate(Tomate);
                Queso = Integer.parseInt(tAlmacen.getValueAt(0, 4).toString()) - (1 * Integer.parseInt(cantidad));
                datosA.setQueso(Queso);
                Carne = Integer.parseInt(tAlmacen.getValueAt(0, 5).toString()) - (2 * Integer.parseInt(cantidad));
                datosA.setCarne(Carne);
                break;

            case "especial":
                Pan = Integer.parseInt(tAlmacen.getValueAt(0, 1).toString()) - (1 * Integer.parseInt(cantidad));
                datosA.setPan(Pan);
                Lechuga = Integer.parseInt(tAlmacen.getValueAt(0, 2).toString()) - (1 * Integer.parseInt(cantidad));
                datosA.setLechuga(Lechuga);
                Tomate = Integer.parseInt(tAlmacen.getValueAt(0, 3).toString()) - (1 * Integer.parseInt(cantidad));
                datosA.setTomate(Tomate);
                Queso = Integer.parseInt(tAlmacen.getValueAt(0, 4).toString()) - (2 * Integer.parseInt(cantidad));
                datosA.setQueso(Queso);
                Carne = Integer.parseInt(tAlmacen.getValueAt(0, 5).toString()) - (2 * Integer.parseInt(cantidad));
                datosA.setCarne(Carne);
                break;

            default:
                JOptionPane.showMessageDialog(null, "INSERTE UN TIPO DE HAMBURGUESA REGISTRADO");

        }

        switch (minic.combo) {
            case "1":
                Pan = Integer.parseInt(tAlmacen.getValueAt(0, 1).toString()) - (1);
                datosA.setPan(Pan);
                Lechuga = Integer.parseInt(tAlmacen.getValueAt(0, 2).toString()) - (1);
                datosA.setLechuga(Lechuga);
                Tomate = Integer.parseInt(tAlmacen.getValueAt(0, 3).toString()) - (1);
                datosA.setTomate(Tomate);
                Queso = Integer.parseInt(tAlmacen.getValueAt(0, 4).toString()) - (1);
                datosA.setQueso(Queso);
                Carne = Integer.parseInt(tAlmacen.getValueAt(0, 5).toString()) - (1);
                datosA.setCarne(Carne);
                break;

            case "2":
                Pan = Integer.parseInt(tAlmacen.getValueAt(0, 1).toString()) - (1);
                datosA.setPan(Pan);
                Lechuga = Integer.parseInt(tAlmacen.getValueAt(0, 2).toString()) - (1);
                datosA.setLechuga(Lechuga);
                Tomate = Integer.parseInt(tAlmacen.getValueAt(0, 3).toString()) - (1);
                datosA.setTomate(Tomate);
                Queso = Integer.parseInt(tAlmacen.getValueAt(0, 4).toString()) - (1);
                datosA.setQueso(Queso);
                Carne = Integer.parseInt(tAlmacen.getValueAt(0, 5).toString()) - (2);
                datosA.setCarne(Carne);
                break;
                
            case "3":
                 Pan = Integer.parseInt(tAlmacen.getValueAt(0, 1).toString()) - (1);
                datosA.setPan(Pan);
                Lechuga = Integer.parseInt(tAlmacen.getValueAt(0, 2).toString()) - (1);
                datosA.setLechuga(Lechuga);
                Tomate = Integer.parseInt(tAlmacen.getValueAt(0, 3).toString()) - (1);
                datosA.setTomate(Tomate);
                Queso = Integer.parseInt(tAlmacen.getValueAt(0, 4).toString()) - (2);
                datosA.setQueso(Queso);
                Carne = Integer.parseInt(tAlmacen.getValueAt(0, 5).toString()) - (2);
                datosA.setCarne(Carne);
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "NO SE REGISTRÓ EL COMBO");
        }
        
       /* switch (minic.juguete){
            case "Pelota":
                pelota = Integer.parseInt(tJuguetes.getValueAt(0, 1).toString()) - (1);               
                juguetesA.setPelota(pelota);
                break;
            case "Muñeca":
                muñeca = Integer.parseInt(tJuguetes.getValueAt(0, 2).toString()) - (1);
                juguetesA.setMuñeca(muñeca);
                break;
            case "Barquito":
                barco = Integer.parseInt(tJuguetes.getValueAt(0, 3).toString()) - (1);
                juguetesA.setBarco(barco);
                break;
            case "Carrito":
                carrito = Integer.parseInt(tJuguetes.getValueAt(0, 4).toString()) - (1);
                juguetesA.setCarrito(carrito);
                break;
            case "Boomerang":
                bom = Integer.parseInt(tJuguetes.getValueAt(0, 5).toString()) - (1);
                juguetesA.setBom(bom);
                break;
            case "Crayones":
                crayones = Integer.parseInt(tJuguetes.getValueAt(0, 6).toString()) - (1);
                juguetesA.setCrayones(crayones);
                break;
            case "Legos":
                lego = Integer.parseInt(tJuguetes.getValueAt(0, 7).toString()) - (1);
                juguetesA.setLego(lego);
                break;
            default: 
                JOptionPane.showMessageDialog(null, "NO SE REGISTRÓ JUGUETE");
                
        }*/
      
        verificarIngredientes();
        if (ingDisp == 0) {
            try {
                Statement st = con.createStatement();
                String query = "INSERT INTO compras (cantidad,tipoh,ref,nombc,fecha,total,cajita,juguete) VALUES (\"" + cantidad + "\",\"" + tipoh + "\",\"" + ref + "\",\"" + nombc + "\",\"" + fecha + "\",\"" + total + "\",\"" + minic.combo + "\",\"" + minic.juguete + "\")";
                st.execute(query);

            } catch (SQLException ex) {
                System.out.println("Error" + ex);
            }
            actualizarCompras();
            actualizarAlmacen();
            actualizarJuguetes();
            txtCantidad.setText("");
            txtTipo.setText("");
            txtRef.setText("");
            txtNombc.setText("");
            txtTotal.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mini.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtMuñecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMuñecaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMuñecaActionPerformed

    private void txtBomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBomActionPerformed

    private void txtBarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBarcoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        juguetesA.setPelota((txtPelota.getText().toString()));
        juguetesA.setMuñeca((txtMuñeca.getText().toString()));
        juguetesA.setBarco((txtBarco.getText().toString()));
        juguetesA.setCarrito((txtCarrito.getText().toString()));
        juguetesA.setBom((txtBom.getText().toString()));
        juguetesA.setCrayones((txtCrayones.getText().toString()));
        juguetesA.setLego((txtLegos.getText().toString()));
        actualizarAlmacenJ();
        actualizarJuguetes();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        id = 1;
        txtPelota.setText(tJuguetes.getValueAt(0, 1).toString());
        txtMuñeca.setText(tJuguetes.getValueAt(0, 2).toString());
        txtBarco.setText(tJuguetes.getValueAt(0, 3).toString());
        txtCarrito.setText(tJuguetes.getValueAt(0, 4).toString());
        txtBom.setText(tJuguetes.getValueAt(0, 5).toString());
        txtCrayones.setText(tJuguetes.getValueAt(0, 6).toString());
        txtLegos.setText(tJuguetes.getValueAt(0, 7).toString());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtCrayonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrayonesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCrayonesActionPerformed

    private void txtLegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLegosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLegosActionPerformed

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
            java.util.logging.Logger.getLogger(ComprasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprasA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprasA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JTable tJuguetes;
    private javax.swing.JTextField txtBarco;
    private javax.swing.JTextField txtBom;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCarne;
    private javax.swing.JTextField txtCarrito;
    private javax.swing.JTextField txtCrayones;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtLechuga;
    private javax.swing.JTextField txtLegos;
    private javax.swing.JTextField txtMuñeca;
    private javax.swing.JTextField txtNombc;
    private javax.swing.JTextField txtPan;
    private javax.swing.JTextField txtPelota;
    private javax.swing.JTextField txtQueso;
    private javax.swing.JTextField txtRef;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTomate;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JScrollPane wea;
    // End of variables declaration//GEN-END:variables
}
