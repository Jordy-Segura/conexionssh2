/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.mavenproject2;

import javax.swing.JOptionPane;

/**
 *
 * @author jordy
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String cadena=JOptionPane.showInputDialog("Ingresa una cadena");
        JOptionPane.showMessageDialog(null, "esta es tu cadena\n"+"--- "+cadena+" ---");
        
        int entero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa una cadena"));
        JOptionPane.showMessageDialog(null, "este es tu entero\n"+"--- "+entero+" ---");
        
    }
}
