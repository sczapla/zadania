/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author Tomek
 */
public class Zad42 {

    private static final String OUTPUT_GZIP_FILE = "filename.gz";
    private static final String SOURCE_FILE = "filename.txt";
    
    private static final String INPUT_GZIP_FILE = "filename.gz";
    private static final String OUTPUT_FILE = "filename2.txt";

    public static void main(String[] args) {
        Zad42 zad = new Zad42();
        zad.gunzipIt();
    }

    public void gunzipIt() {

        byte[] buffer = new byte[1024];

        try {

            GZIPInputStream gzis
                    = new GZIPInputStream(new FileInputStream(INPUT_GZIP_FILE));

            FileOutputStream out
                    = new FileOutputStream(OUTPUT_FILE);

            int len;
            while ((len = gzis.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }

            gzis.close();
            out.close();

            System.out.println("Done");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void gzipIt() {

        byte[] buffer = new byte[1024];

        try {

            GZIPOutputStream gzos
                    = new GZIPOutputStream(new FileOutputStream(OUTPUT_GZIP_FILE));

            FileInputStream in
                    = new FileInputStream(SOURCE_FILE);

            int len;
            while ((len = in.read(buffer)) > 0) {
                gzos.write(buffer, 0, len);
            }

            in.close();

            gzos.finish();
            gzos.close();

            System.out.println("Done");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
