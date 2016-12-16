/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.de.datos.ejercicio01;

import static base.de.datos.ejercicio01.fabricantes.r;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class fabricantes extends javax.swing.JFrame {

    static public ResultSet r;

    public fabricantes() throws SQLException {
        initComponents();
        String url = "jdbc:mysql://localhost:3306/base de datos";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url, user, pass);

        Statement s = connection.createStatement();
        String query = "select * from fabricantes";
        r = s.executeQuery(query);
        r.first();
        cod_fabricante.setText(r.getString("COD_FABRICANTE"));
        nombre.setText(r.getString("NOMBRE"));
        pais.setText(r.getString("PAIS"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        COD_FABRICANTE = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JLabel();
        PAIS = new javax.swing.JLabel();
        cod_fabricante = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        pais = new javax.swing.JTextField();
        Primero = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        Anterior = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Ultimo = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton5.setText("Aceptar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        COD_FABRICANTE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        COD_FABRICANTE.setText("COD_FABRICANTE");

        NOMBRE.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        NOMBRE.setText("NOMBRE");

        PAIS.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        PAIS.setText("PAIS");

        cod_fabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_fabricanteActionPerformed(evt);
            }
        });

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisActionPerformed(evt);
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

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
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

        Ultimo.setText("Ultimo");
        Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(COD_FABRICANTE)
                    .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PAIS, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(cod_fabricante, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pais))
                .addGap(89, 89, 89)
                .addComponent(Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Cancelar)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Primero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Siguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Anterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(Ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(COD_FABRICANTE)
                    .addComponent(cod_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar)
                    .addComponent(Aceptar))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOMBRE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PAIS)
                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Primero)
                    .addComponent(Siguiente)
                    .addComponent(Anterior)
                    .addComponent(Ultimo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nuevo)
                    .addComponent(Modificar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cod_fabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_fabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_fabricanteActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisActionPerformed

    private void PrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimeroActionPerformed
        try {
            if (r.first()) {
                cod_fabricante.setText(r.getString("COD_FABRICANTE"));
                nombre.setText(r.getString("NOMBRE"));
                pais.setText(r.getString("PAIS"));
    }//GEN-LAST:event_PrimeroActionPerformed
        } catch (SQLException ex) {
            Logger.getLogger(fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        try {
            if (r.next()) {
                cod_fabricante.setText(r.getString("COD_FABRICANTE"));
                nombre.setText(r.getString("NOMBRE"));
                pais.setText(r.getString("PAIS"));
    }//GEN-LAST:event_SiguienteActionPerformed
        } catch (SQLException ex) {
            Logger.getLogger(fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        try {
            if (r.previous()) {
                cod_fabricante.setText(r.getString("COD_FABRICANTE"));
                nombre.setText(r.getString("NOMBRE"));
                pais.setText(r.getString("PAIS"));
    }//GEN-LAST:event_AnteriorActionPerformed
        } catch (SQLException ex) {
            Logger.getLogger(fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
        try {
            if (r.last()) {
                cod_fabricante.setText(r.getString("COD_FABRICANTE"));
                nombre.setText(r.getString("NOMBRE"));
                pais.setText(r.getString("PAIS"));
    }//GEN-LAST:event_UltimoActionPerformed
        } catch (SQLException ex) {
            Logger.getLogger(fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed

        Primero.setVisible(false);
        Anterior.setVisible(false);
        Siguiente.setVisible(false);
        Ultimo.setVisible(false);
        Nuevo.setVisible(false);
        Modificar.setVisible(false);
        Aceptar.setVisible(true);
        Cancelar.setVisible(true);
        cod_fabricante.setText("");
        nombre.setText("");
        pais.setText("");

    }//GEN-LAST:event_NuevoActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        try {
            String vcod_fabricante, vnombre, vpais;
            vcod_fabricante = cod_fabricante.getText();
            vnombre = nombre.getText();
            vpais = pais.getText();
            String url = "jdbc:mysql://localhost:3306/base de datos";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement s = connection.createStatement();
            String query = "update fabricantes set COD_FABRICANTE='" + vcod_fabricante + "', NOMBRE='" + vnombre + "', PAIS='" + vpais + "' WHERE COD_FABRICANTE='" + vcod_fabricante +"'";
            int resultado = s.executeUpdate(query);
            r.refreshRow();
        } catch (SQLException ex) {
            Logger.getLogger(fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        try {
            String vcod_fabricante, vnombre, vpais;
            vcod_fabricante = cod_fabricante.getText();
            vnombre = nombre.getText();
            vpais = pais.getText();
            String url = "jdbc:mysql://localhost:3306/base de datos";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement s = connection.createStatement();
            String query = "insert into fabricantes values ('" + vcod_fabricante + "','" + vnombre + "','" + vpais + "')";
            int resultado = s.executeUpdate(query);
            Primero.setVisible(true);
            Anterior.setVisible(true);
            Siguiente.setVisible(true);
            Ultimo.setVisible(true);
            Nuevo.setVisible(true);
            Modificar.setVisible(true);
            Aceptar.setVisible(false);
            Cancelar.setVisible(false);
            String query2 = "select * from fabricantes";
            r = s.executeQuery(query2);
            //r.refreshRow();
            r.first();
            cod_fabricante.setText(r.getString("COD_FABRICANTE"));
            nombre.setText(r.getString("NOMBRE"));
            pais.setText(r.getString("PAIS"));
        } catch (SQLException ex) {
            Logger.getLogger(fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        try {
            Primero.setVisible(true);
            Anterior.setVisible(true);
            Siguiente.setVisible(true);
            Ultimo.setVisible(true);
            Nuevo.setVisible(true);
            Modificar.setVisible(true);
            Aceptar.setVisible(false);
            Cancelar.setVisible(false);
            r.refreshRow();
            r.first();
            cod_fabricante.setText(r.getString("COD_FABRICANTE"));
            nombre.setText(r.getString("NOMBRE"));
            pais.setText(r.getString("PAIS"));
        } catch (SQLException ex) {
            Logger.getLogger(fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new fabricantes().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(fabricantes.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Anterior;
    private javax.swing.JLabel COD_FABRICANTE;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JButton Nuevo;
    private javax.swing.JLabel PAIS;
    private javax.swing.JButton Primero;
    private javax.swing.JButton Siguiente;
    private javax.swing.JButton Ultimo;
    private javax.swing.JTextField cod_fabricante;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField pais;
    // End of variables declaration//GEN-END:variables
}
