/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad7;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Zad7b {

    public static void main(String argv[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int liczbaPol = 71;
        String serverOdp = "";
        try (Socket clientSocket = new Socket("localhost", 9696)) {
            PrintWriter outToServer = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            serverOdp = inFromServer.readLine();
            if (serverOdp.equals("OK.")) {
                while (!serverOdp.equals("bum") && liczbaPol > 0) {
                    System.out.println("Podaj numer pola:");
                    String n = in.nextLine();
                    outToServer.println(n);
                    serverOdp = inFromServer.readLine();
                    System.out.println("Odpowiedz serwera: "+ serverOdp);
                    liczbaPol--;
                }
            }
        }
    }
}
