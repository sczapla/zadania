/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author Tomek
 */
public class Zad41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = null;
        StringBuilder st = new StringBuilder();
        try {

            br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.print("Enter something : ");
                String input = br.readLine();
                st.append(input);
                st.append("\n");
                if ("q1".equals(input)) {
                    writeToFile(st.toString(), "utf-8");
                    System.out.println("Exit!");
                    System.exit(0);
                } else if("q2".equals(input)) {
                    writeToFile(st.toString(), "cp1250");
                    System.out.println("Exit!");
                    System.exit(0);
                } else if("q3".equals(input)) {
                    writeToFile(st.toString(), "ISO-8859-1");
                    System.out.println("Exit!");
                    System.exit(0);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void writeToFile(String toFile, String charSet) {
        Writer writer = null;
        try {

            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("filename.txt"), charSet));
            writer.write(toFile);
            writer.flush();
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
