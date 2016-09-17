/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

/**
 *
 * @author Tomek
 */
public class Dzialanie extends Wierzcholek {

    private final char op; // operator +, -, / lub * 

    public Dzialanie(char znak) throws Exception{
        if(znak != '-' && znak != '+' && znak != '*' && znak != '*'){
            throw new NiepoprawnaSkladnia("Niepoprawne dzialanie: " + znak);
        }
        op = znak;
    }

    public void dodajLewyArg(Wierzcholek arg) {
        lewy = arg;
    }

    public void dodajPrawyArg(Wierzcholek arg) {
        prawy = arg;
    }

    @Override
    public int wartosc() throws Exception{
        switch (op) {
            case 
                '+':
                return lewy.wartosc() + prawy.wartosc();
            case 
                '-':
                return lewy.wartosc() - prawy.wartosc();
            case 
                '/':
                if(prawy.wartosc() == 0){
                    throw new DzieleniePrzezZero("Dzielenie przez zero");
                }
                return lewy.wartosc() / prawy.wartosc();
            case 
                '*':
                return lewy.wartosc() * prawy.wartosc();
        }
        return 0;
    }
}
