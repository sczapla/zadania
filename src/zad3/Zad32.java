/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tomek
 */
public class Zad32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Wyrazenie wyr;
        try {
            wyr = new Wyrazenie("(3*((1+2)-1))");
            System.out.println("" + wyr.oblicz());
        } catch (Exception ex) {
            Logger.getLogger(Zad32.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
