/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

/**
 *
 * @author Tomek
 */
public class Zad21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1/2 + 1/3 = 5/6
        Rational x = new Rational(1, 2);
        Rational y = new Rational(1, 3);
        Rational z = x.add(y);
        System.out.println(z.toString() + "\n");

        // 8/9 + 1/9 = 1
        x = new Rational(8, 9);
        y = new Rational(1, 9);
        z = x.add(y);
        System.out.println(z.toString() + "\n");

        x = new Rational(1, 2);
        y = new Rational(1, 4);
        z = x.sub(y);
        System.out.println(z.toString() + "\n");

        //  4/17 * 17/4 = 1
        x = new Rational(4, 17);
        y = new Rational(17, 4);
        z = x.mul(y);
        System.out.println(z.toString() + "\n");

        
        x = new Rational(1, 4);
        y = new Rational(1, 2);
        z = x.div(y);
        System.out.println(z.toString() + "\n");

        // 1/6 - -4/-8 = -1/3
        x = new Rational( 1,  4);
        y = new Rational(2, 8);
        int ret = x.compareTo(y);
        System.out.println(ret + "\n");
    }

}
