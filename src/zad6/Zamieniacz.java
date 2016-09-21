/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad6;

import static java.lang.Thread.sleep;
import javax.swing.JTextArea;

public class Zamieniacz extends Thread{
    JTextArea okno;
    volatile boolean zakonczyc;

    public Zamieniacz(JTextArea comp) {
        okno = comp;
        zakonczyc = false;
    }

    @Override
    public void run() {
        while (!zakonczyc) {
            try {
                String tekst = okno.getText();
                int indeks = tekst.indexOf("{");
                if (indeks >= 0) {
                    okno.replaceRange("begin", indeks, indeks + 1);
                    okno.setCaretPosition(tekst.length() + 4);
                } else {
                    indeks = tekst.indexOf("}");
                    if (indeks >= 0) {
                        okno.replaceRange("end", indeks,
                                indeks + 1);
                        okno.setCaretPosition(tekst.length() + 2);
                    }
                }
                sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}
