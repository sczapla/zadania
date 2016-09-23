/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import javax.swing.JOptionPane;


public class Zad11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Wpisz ciąg znaków.");
        String inputUpper = input.toUpperCase();
        JOptionPane.showMessageDialog(null, "Zmienony ciąg znaków: " + inputUpper);
        System.exit(0);
    }
    
}
