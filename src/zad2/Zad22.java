/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

public class Zad22 {

    public static void main(String[] args) {
        Rownanie r = new Rownanie();
        r.setAll(2, 4, 9);
        
        System.out.println(r.obliczY(3) + "\n");
        System.out.println(r.liczbaPierwiastkow() + "\n");
        
        Rownanie r2 = new Rownanie();
        r2.setAll(2, 4, 1);
        
        System.out.println(r2.obliczY(3) + "\n");
        System.out.println(r2.liczbaPierwiastkow() + "\n");
    }
}
