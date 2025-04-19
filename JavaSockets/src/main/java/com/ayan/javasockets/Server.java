/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.javasockets;

import java.net.*; 
import java.io.*; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ayana
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            System.out.println("waiting for clients..."); 
            Socket socket = serverSocket.accept();
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); 
            out.println("Hello Client");
            
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
            String clientInput = input.readLine(); 
            
            input.close();
            out.close();
            socket.close(); 
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
