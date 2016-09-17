/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

public class Stala extends Wierzcholek {

    private int wart;

    public Stala(int x) throws Exception {
        if (x < 0 || x > 9) {
            throw new NiepoprawnaSkladnia("Niepoprawna stala: " + x);
        }
        wart = x;
    }

    @Override
    public int wartosc() {
        return wart;
    }
}
