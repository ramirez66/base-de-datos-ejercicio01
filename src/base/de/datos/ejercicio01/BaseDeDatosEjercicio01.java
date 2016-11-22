/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.de.datos.ejercicio01;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FranS
 */
public class BaseDeDatosEjercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clientes cli = null;
        try {
            cli = new clientes();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatosEjercicio01.class.getName()).log(Level.SEVERE, null, ex);
        }
        cli.setVisible(true);
    }
    
}
