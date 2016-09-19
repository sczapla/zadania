/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5;

import java.util.LinkedList;
import java.util.StringTokenizer;

public class Graf {

    private int n; // liczba wierzchołków, V = {0,1,...,n-1} 
    private LinkedList[] tab; // tablica wierzchołków połączo- 
    // nych z danym wierzcholkiem 

    public Graf(String lan) {
        StringTokenizer st = new StringTokenizer(lan, "() ,");
        n = Integer.parseInt(st.nextToken());
        tab = new LinkedList[n];
        for (int i = 0; i < n; ++i) {
            tab[i] = new LinkedList();
        }
        while (st.hasMoreTokens()) {
            tab[Integer.parseInt(st.nextToken())].add(
                    new Integer(st.nextToken()));
        }
    }

    @Override
    public String toString() {
        StringBuilder wynik = new StringBuilder();
        for(int i=0; i<n; i++){
            wynik.append(i).append(": ");
            LinkedList<Integer> tabi = tab[i];
            for(Integer liczba : tabi){
                wynik.append(liczba).append(" ");
            }
            wynik.append("\n");
        }
        return wynik.toString();
    }
}
