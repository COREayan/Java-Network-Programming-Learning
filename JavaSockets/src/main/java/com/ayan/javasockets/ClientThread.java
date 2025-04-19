/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.javasockets;

import java.net.*; 
import java.io.*;

/**
 *
 * @author ayana
 */
public class ClientThread extends Thread {
    private Socket socket = null;
    
    public ClientThread(Socket socket) {
        this.socket = socket;
    }
    
    public void run() {
        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); 
            out.println("Hello Client");
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
            String clientInput = input.readLine();       
            System.out.println(clientInput);
            input.close();
            out.close();
            socket.close(); 
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
