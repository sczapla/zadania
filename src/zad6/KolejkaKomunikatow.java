/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad6;

import java.util.HashMap;

class KolejkaKomunikatow {

    HashMap<String,Integer> mapa = new HashMap<String, Integer>();

    public synchronized void wyslij(String klucz, Integer wartosc) {
        mapa.put(klucz, wartosc);
        System.out.println("Klucz: "+klucz + ", wartosc: "+wartosc);
    }

    public synchronized Integer odbierz(String klucz) {
        if (mapa.size() == 0) {
            return null;
        }
        Integer wartosc = mapa.get(klucz);
        mapa.remove(klucz);
        return wartosc;
    }
}
