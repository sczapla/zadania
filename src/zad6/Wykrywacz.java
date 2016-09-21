/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad6;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Wykrywacz extends Thread {

    JTextArea okno;
    private JScrollPane jScrollPane1;
    volatile boolean zakonczyc;

    public Wykrywacz(JTextArea comp, JScrollPane jScrollPane1) {
        okno = comp;
        this.jScrollPane1 = jScrollPane1;
        zakonczyc = false;
    }

    @Override
    public void run() {
        while (!zakonczyc) {
            try {
                String tekst = okno.getText();
                int indeks = tekst.indexOf("cholera");
                if (indeks >= 0) {
                    okno.replaceRange("*******", indeks, indeks + 7);
                    okno.setCaretPosition(tekst.length());
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            JOptionPane.showMessageDialog(jScrollPane1, "Cenzura!");
                        }
                    });
                }
                sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
