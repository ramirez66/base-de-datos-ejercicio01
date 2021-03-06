/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.de.datos.ejercicio01;

import static base.de.datos.ejercicio01.articulos.r;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *clase de articulos contiene informacion de articulos
 * @author Erick Ramirez Churata
 * @version 3.0 Febrero 2017
 */
public final class articulos extends javax.swing.JFrame {
/**
 * variable que crea y guarda la consulta
 */
    static public ResultSet r;
    static Connection connection;
    private String vcod_fabricante;
/**
 * hace invisible los botones de aceptar y cancelar
 * @throws SQLException excepción de un tipo especifico o general sobre lo
 * errores en la conexion a la base de datos
 */
    public articulos() throws SQLException {
        initComponents();
        Aceptar.setVisible(false);
        Cancelar.setVisible(false);
        String url = "jdbc:mysql://localhost:3306/base de datos";
        String user = "root";
        String pass = "";
        connection = DriverManager.getConnection(url, user, pass);
/**
 * Una conexión con una base de datos específica
 */
        Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String query = "select * from articulos";
        r = s.executeQuery(query);
        r.first();
        cod_articulo.setText(r.getString("COD_ARTICULO"));
        articulo.setText(r.getString("ARTICULO"));
        peso.setText(r.getString("PESO"));
        categoria.setText(r.getString("CATEGORIA"));
        precio_venta.setText(r.getString("PRECIO_VENTA"));
        precio_coste.setText(r.getString("PRECIO_COSTE"));
        existencias.setText(r.getString("EXISTENCIAS"));
/**
 * es la creacion del metodo del combo box para mostrar opciones de fabricantes
 */
        connection = DriverManager.getConnection(url, user, pass);
        String query2 = "select * from fabricantes";
        ResultSet r2;
        Statement s2 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        r2 = s2.executeQuery(query2);
        DefaultComboBoxModel value1 = new DefaultComboBoxModel();

        while (r2.next()) {
            value1.addElement(r2.getString("NOMBRE"));
        }
        Fabricante.setModel(value1);
        Fabricante.setSelectedItem(getNomFabricante(r.getInt("FABRICANTE")));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fabricante = new javax.swing.JTextField();
        COD_ARTICULO = new javax.swing.JLabel();
        ARTICULO = new javax.swing.JLabel();
        FABRICANTE = new javax.swing.JLabel();
        PESO = new javax.swing.JLabel();
        CATEGORIA = new javax.swing.JLabel();
        PRECIO_VENTA = new javax.swing.JLabel();
        PRECIO_COSTE = new javax.swing.JLabel();
        EXISTENCIAS = new javax.swing.JLabel();
        cod_articulo = new javax.swing.JTextField();
        articulo = new javax.swing.JTextField();
        peso = new javax.swing.JTextField();
        categoria = new javax.swing.JTextField();
        precio_venta = new javax.swing.JTextField();
        precio_coste = new javax.swing.JTextField();
        existencias = new javax.swing.JTextField();
        Primero = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        Ultimo = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Borrar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        Fabricante = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        COD_ARTICULO.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        COD_ARTICULO.setText("COD_ARTICULO");

        ARTICULO.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ARTICULO.setText("ARTICULO");

        FABRICANTE.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        FABRICANTE.setText("FABRICANTE");

        PESO.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        PESO.setText("PESO");

        CATEGORIA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CATEGORIA.setText("CATEGORIA");

        PRECIO_VENTA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PRECIO_VENTA.setText("PRECIO_VENTA");

        PRECIO_COSTE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PRECIO_COSTE.setText("PRECIO_COSTE");

        EXISTENCIAS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EXISTENCIAS.setText("EXISTENCIAS");

        cod_articulo.setEditable(false);
        cod_articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_articuloActionPerformed(evt);
            }
        });

        Primero.setText("Primero");
        Primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimeroActionPerformed(evt);
            }
        });

        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        Anterior.setText("Anterior");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });

        Ultimo.setText("Ultimo");
        Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoActionPerformed(evt);
            }
        });

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("ARTICULOS");

        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Fabricante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PESO)
                    .addComponent(COD_ARTICULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ARTICULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FABRICANTE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cod_articulo, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(articulo)
                            .addComponent(peso, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(Aceptar)
                            .addComponent(Fabricante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CATEGORIA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Primero)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Siguiente)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Ultimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Modificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(PRECIO_COSTE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(precio_coste, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(existencias, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Cancelar)
                                        .addComponent(EXISTENCIAS)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Anterior)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(245, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PRECIO_VENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(precio_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(COD_ARTICULO)
                    .addComponent(cod_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CATEGORIA)
                    .addComponent(Primero)
                    .addComponent(Siguiente))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ARTICULO)
                            .addComponent(articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PRECIO_VENTA)
                            .addComponent(precio_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FABRICANTE)
                                .addComponent(Fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PRECIO_COSTE)
                                .addComponent(precio_coste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PESO)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Aceptar)
                                    .addComponent(Cancelar)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EXISTENCIAS)
                                .addComponent(existencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Anterior)
                            .addComponent(Ultimo))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nuevo)
                            .addComponent(Modificar))
                        .addGap(18, 18, 18)
                        .addComponent(Borrar)
                        .addGap(18, 18, 18)
                        .addComponent(Volver)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * metodo getCodFabricante nos devuelve el nombre del fabricante
 * @param nombre -nombre del fabricante
 * @return codigo - codigo del fabricante
 */
    public int getCodFabricante(String nombre) {

        int codigo = 0;

        try {
            Statement s = connection.createStatement();
            String query2 = "select cod_fabricante "
                    + "from fabricantes "
                    + "where nombre='" + nombre + "'";
            ResultSet r2;
            r2 = s.executeQuery(query2);
            r2.first();
            codigo = r2.getInt("COD_FABRICANTE");
        } catch (SQLException ex) {
            Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return codigo;
    }
/**
 * metodo getNomFabricante coje el  cod_fabricante
 * @param cod_fabricante contiene el codigo fabricante
 * @return Nom_fabricante contiene el nombre de fabricante
 */
    public String getNomFabricante(int cod_fabricante) {

        String nombre = "";

        try {
            Statement s = connection.createStatement();
            String query2 = "select nombre "
                    + "from fabricantes "
                    + "where cod_fabricante=" + cod_fabricante;
            ResultSet r2;
            r2 = s.executeQuery(query2);
            r2.first();
            nombre = r2.getString("NOMBRE");
        } catch (SQLException ex) {
            Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nombre;
    }
    private void cod_articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_articuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_articuloActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        /**
         * boton para ir al siguiente accion
         */
        try {
            if (r.next()) {
                cod_articulo.setText(r.getString("COD_ARTICULO"));
                articulo.setText(r.getString("ARTICULO"));
                Fabricante.setSelectedItem(getNomFabricante(r.getInt("FABRICANTE")));
                peso.setText(r.getString("PESO"));
                categoria.setText(r.getString("CATEGORIA"));
                precio_venta.setText(r.getString("PRECIO_VENTA"));
                precio_coste.setText(r.getString("PRECIO_COSTE"));
                existencias.setText(r.getString("EXISTENCIAS"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SiguienteActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        /**
         * boton para modificar una accion
         */
        try {
            String vcod_articulo, varticulo, vfabricante, vpeso, vcategoria, vprecio_venta, vprecio_coste, vexistencias;
            vcod_articulo = cod_articulo.getText();
            varticulo = articulo.getText();
            vfabricante = (String) Fabricante.getSelectedItem();
            int cod = getCodFabricante(vfabricante);

            vpeso = peso.getText();
            vcategoria = categoria.getText();
            vprecio_venta = precio_venta.getText();
            vprecio_coste = precio_coste.getText();
            vexistencias = existencias.getText();
            String url = "jdbc:mysql://localhost:3306/base de datos";
            String user = "root";
            String pass = "";
            connection = DriverManager.getConnection(url, user, pass);
          /**
            * Una conexión con una base de datos específica
            */
            Statement s = connection.createStatement();
            String query = "update articulos set  ARTICULO='" + varticulo + "', FABRICANTE='" + cod + "', PESO='" + vpeso + "', CATEGORIA='" + vcategoria + "', PRECIO_VENTA='" + vprecio_venta + "', PRECIO_COSTE='" + vprecio_coste + "', EXISTENCIAS='" + vexistencias + "' WHERE COD_ARTICULO='" + vcod_articulo + "'";
            int resultado = s.executeUpdate(query);
            r.refreshRow();
        } catch (SQLException ex) {
            Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        /**
       * boton para aceptar una accion 
       */
        try {
            String vcod_articulo, varticulo, vfabricante, vpeso, vcategoria, vprecio_venta, vprecio_coste, vexistencias;
            vcod_articulo = cod_articulo.getText();
            varticulo = articulo.getText();
            vfabricante = (String) Fabricante.getSelectedItem();
            vpeso = peso.getText();
            vcategoria = categoria.getText();
            vprecio_venta = precio_venta.getText();
            vprecio_coste = precio_coste.getText();
            vexistencias = existencias.getText();
            String url = "jdbc:mysql://localhost:3306/base de datos";
            String user = "root";
            String pass = "";
            connection = DriverManager.getConnection(url, user, pass);
           /**
            * Una conexión con una base de datos específica
            */
            Statement s = connection.createStatement();
            String query = "insert into articulos values ('" + vcod_articulo + "','" + varticulo + "','" + getCodFabricante(vfabricante) + "','" + vpeso + "','" + vcategoria + "','" + vprecio_venta + "','" + vprecio_coste + "','" + vexistencias + "')";
            int resultado = s.executeUpdate(query);
            Primero.setVisible(true);
            Anterior.setVisible(true);
            Siguiente.setVisible(true);
            Ultimo.setVisible(true);
            Nuevo.setVisible(true);
            Modificar.setVisible(true);
            Borrar.setVisible(true);
            Volver.setVisible(true);
            Aceptar.setVisible(false);
            Cancelar.setVisible(false);
            String query2 = "select * from articulos";
            r = s.executeQuery(query2);
            //r.refreshRow();
            r.first();
            cod_articulo.setText(r.getString("COD_ARTICULO"));
            articulo.setText(r.getString("ARTICULO"));
            Fabricante.setSelectedItem(r.getString("FABRICANTE"));
            peso.setText(r.getString("PESO"));
            categoria.setText(r.getString("CATEGORIA"));
            precio_venta.setText(r.getString("PRECIO_VENTA"));
            precio_coste.setText(r.getString("PRECIO_COSTE"));
            existencias.setText(r.getString("EXISTENCIAS"));
        } catch (SQLException ex) {
            Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void PrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimeroActionPerformed
        /**
        * boton para ir al primera accion de registro
        */
        try {
            if (r.first()) {
                cod_articulo.setText(r.getString("COD_ARTICULO"));
                articulo.setText(r.getString("ARTICULO"));
                Fabricante.setSelectedItem(getNomFabricante(r.getInt("FABRICANTE")));
                peso.setText(r.getString("PESO"));
                categoria.setText(r.getString("CATEGORIA"));
                precio_venta.setText(r.getString("PRECIO_VENTA"));
                precio_coste.setText(r.getString("PRECIO_COSTE"));
                existencias.setText(r.getString("EXISTENCIAS"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

                        }//GEN-LAST:event_PrimeroActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        /**
        * boton para ir al anterior accion de registro
        */
        try {
            if (r.previous()) {
                cod_articulo.setText(r.getString("COD_ARTICULO"));
                articulo.setText(r.getString("ARTICULO"));
                Fabricante.setSelectedItem(getNomFabricante(r.getInt("FABRICANTE")));
                peso.setText(r.getString("PESO"));
                categoria.setText(r.getString("CATEGORIA"));
                precio_venta.setText(r.getString("PRECIO_VENTA"));
                precio_coste.setText(r.getString("PRECIO_COSTE"));
                existencias.setText(r.getString("EXISTENCIAS"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AnteriorActionPerformed

    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
        /**
         * boton para ir a la ultima accion de registro
         */
        try {
            if (r.last()) {
                cod_articulo.setText(r.getString("COD_ARTICULO"));
                articulo.setText(r.getString("ARTICULO"));
                Fabricante.setSelectedItem(getNomFabricante(r.getInt("FABRICANTE")));
                peso.setText(r.getString("PESO"));
                categoria.setText(r.getString("CATEGORIA"));
                precio_venta.setText(r.getString("PRECIO_VENTA"));
                precio_coste.setText(r.getString("PRECIO_COSTE"));
                existencias.setText(r.getString("EXISTENCIAS"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UltimoActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        /**
         * boton nuevo para registrar una nueva base de datos 
         */
        Primero.setVisible(false);
        Anterior.setVisible(false);
        Siguiente.setVisible(false);
        Ultimo.setVisible(false);
        Nuevo.setVisible(false);
        Modificar.setVisible(false);
        Borrar.setVisible(false);
        Volver.setVisible(false);
        Aceptar.setVisible(true);
        Cancelar.setVisible(true);
        cod_articulo.setEditable(true);
        cod_articulo.setText("");
        articulo.setText("");
        Fabricante.setSelectedItem("");
        peso.setText("");
        categoria.setText("");
        precio_venta.setText("");
        precio_coste.setText("");
        existencias.setText("");
    }//GEN-LAST:event_NuevoActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        /**
         * boton para cancelar una accion
         */
        try {
            Primero.setVisible(true);
            Anterior.setVisible(true);
            Siguiente.setVisible(true);
            Ultimo.setVisible(true);
            Nuevo.setVisible(true);
            Modificar.setVisible(true);
            Borrar.setVisible(true);
            Volver.setVisible(true);
            Aceptar.setVisible(false);
            Cancelar.setVisible(false);
            //r.refreshRow();
            r.first();
            cod_articulo.setText(r.getString("COD_ARTICULO"));
            articulo.setText(r.getString("ARTICULO"));
            Fabricante.setSelectedItem(r.getString("FABRICANTE"));
            peso.setText(r.getString("PESO"));
            categoria.setText(r.getString("CATEGORIA"));
            precio_venta.setText(r.getString("PRECIO_VENTA"));
            precio_coste.setText(r.getString("PRECIO_COSTE"));
            existencias.setText(r.getString("EXISTENCIAS"));
        } catch (SQLException ex) {
            Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CancelarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        /**
         * boton para borrar una accion
         */
        try {
            /**
             * es un  panel de opcion para una  accion
             */
            int i = JOptionPane.showConfirmDialog(null, "El registro será eliminado ¿deseas cancelar el borrado?", "Confirmar borrado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (i == 0); else {
                String vcode;
                vcode = cod_articulo.getText();
                String url = "jdbc:mysql://localhost:3306/base de datos";
                String user = "root";
                String pass = "";
                connection = DriverManager.getConnection(url, user, pass);
                   /**
                   * Una conexión con una base de datos específica
                  */
                Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                String query = "delete FROM articulos WHERE COD_ARTICULO='" + vcode + "'";
                int resultado = s.executeUpdate(query);
                String query2 = "select * from articulos";
                r = s.executeQuery(query2);
                r.first();
                cod_articulo.setText(r.getString("COD_ARTICULO"));
                articulo.setText(r.getString("ARTICULO"));
                Fabricante.setSelectedItem(r.getString("FABRICANTE"));
                peso.setText(r.getString("PESO"));
                categoria.setText(r.getString("CATEGORIA"));
                precio_venta.setText(r.getString("PRECIO_VENTA"));
                precio_coste.setText(r.getString("PRECIO_COSTE"));
                existencias.setText(r.getString("EXISTENCIAS"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BorrarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        /**
         * boton volver paar ir al panel de menu
         */
        Menu art = new Menu();
        art.setLocationRelativeTo(null);
        this.setVisible(false);
        art.setVisible(false);
    }//GEN-LAST:event_VolverActionPerformed

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
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new articulos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ARTICULO;
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Anterior;
    private javax.swing.JButton Borrar;
    private javax.swing.JLabel CATEGORIA;
    private javax.swing.JLabel COD_ARTICULO;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel EXISTENCIAS;
    private javax.swing.JLabel FABRICANTE;
    private javax.swing.JComboBox<String> Fabricante;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JLabel PESO;
    private javax.swing.JLabel PRECIO_COSTE;
    private javax.swing.JLabel PRECIO_VENTA;
    private javax.swing.JButton Primero;
    private javax.swing.JButton Siguiente;
    private javax.swing.JButton Ultimo;
    private javax.swing.JButton Volver;
    private javax.swing.JTextField articulo;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField cod_articulo;
    private javax.swing.JTextField existencias;
    private javax.swing.JTextField fabricante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField precio_coste;
    private javax.swing.JTextField precio_venta;
    // End of variables declaration//GEN-END:variables

}
