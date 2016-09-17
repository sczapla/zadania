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
public class FunkcjaLiniowa implements Wielomian{

    private final double a;
    private final double b;

    public FunkcjaLiniowa(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
            
    @Override
    public void wypiszMiejscaZerowe() {
        if(a == 0){
            System.out.println("brak");
        }
        System.out.println(String.valueOf(-b/a));
    }
    
}
