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
public class FunkcjaKwadratowa implements Wielomian {

    private final double a;
    private final double b;
    private final double c;

    public FunkcjaKwadratowa(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void wypiszMiejscaZerowe() {
        if(delta() < 0){
            System.out.println("brak");
        } else if (delta() == 0){
            System.out.println(String.valueOf(-b/2*a));
        } else {
            String pierwiastek1 = String.valueOf((-b + Math.sqrt(delta()))/(2*c));
            String pierwiastek2 = String.valueOf((-b - Math.sqrt(delta()))/(2*c));
            System.out.println(pierwiastek1 + " " + pierwiastek2);
        }
    }

    private double delta() {
        return b * b - 4 * a * c;
    }

}
