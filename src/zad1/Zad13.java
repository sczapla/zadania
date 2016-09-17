/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Tomek
 */
public class Zad13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int n;
        System.out.println("Podaj dowolną liczbę.\n");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Suma nieparzystych liczb: " + sumaNieparzyste(n));
    }
    
    private static int sumaNieparzyste(int liczba){
        int wynik = 0;
        for(int i=0; i<=liczba; i++){
            if(i%2!=0){
                wynik = wynik + i;
            }
        }
        return wynik;
    }
    
}
