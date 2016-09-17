/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

public class Rownanie {
    private double a;
    private double b;
    private double c;
    
    public void setAll(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double obliczY(double x){
        return a * x * x + b * x + c;
    }
    
    public int liczbaPierwiastkow(){
        double delta = delta();
        if(delta == 0){
            return 1;
        } else if(delta < 0){
            return 0;
        } else {
            return 2;
        }
    }
    
    private double delta(){
        return b * b - 4 * a * c;
    }
    
    
}
