/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import java.util.Scanner;

/**
 *
 * @author Tomek
 */
public class Zad14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        System.out.println("Podaj dowolną liczbę.\n");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Binarnie: " + Integer.toString(n, 2) + "\n");
        System.out.println("Ósemkowo: " + Integer.toString(n, 8) + "\n");
        System.out.println("Szesnastkowo: " + Integer.toString(n, 16) + "\n");
    }
}
