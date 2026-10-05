package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(3000);
        Socket s = serverSocket.accept();

        System.out.println("connesso al client");

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        

        String string = " ";

        while (true) {
            string = in.readLine();
            if (string.equals("!"))
                break;
            out.println(string.toUpperCase());
        }
        
    }
}