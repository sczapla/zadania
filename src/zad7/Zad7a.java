/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad7;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

/**
 *
 * @author Tomek
 */
public class Zad7a {

    public static void main(String[] args) {
        String nazwahosta;
        if (args.length > 0) {
            nazwahosta = args[0];
        } else {
            nazwahosta = "time-a.nist.gov";
        }
        try {
            Socket gniazdo = new Socket(nazwahosta, 37);
            InputStream strumien = gniazdo.getInputStream();
            int wynik = 0;
            long wynikL = 0l;
            while (true) {
                wynik = strumien.read();
                if(wynik < 0){
                    break;
                }
                wynikL = wynikL << 8;
                wynikL = wynikL | wynik;
            };
            Date d = new Date(wynikL);
            System.out.println(d);
        } catch (UnknownHostException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
