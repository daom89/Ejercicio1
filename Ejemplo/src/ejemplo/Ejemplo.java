/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import javax.swing.JOptionPane;

/**
 *
 * @author CAPACITACION-PC
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Nombre = JOptionPane.showInputDialog("Ingrese un nombre", null);
        JOptionPane.showMessageDialog(null, "Su nombre es: "+Nombre,"Nombres",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
