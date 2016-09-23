/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;


public class Zad12 {

    private static BigInteger silnia(BigInteger i) {
        if (i.intValue() < 1) {
            return BigInteger.ONE;
        } else {
            return i.multiply(silnia(i.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String[] args) throws IOException {
        int n;
        System.out.println("Podaj dla jakiej liczby obliczyc silnie.\n");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(n + "! = " + silnia(BigInteger.valueOf(n)));
    }

}
