/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.javasocket;

import java.net.*; 
import java.io.*; 

/**
 *
 * @author ayana
 */
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9090);
        System.out.println("wanting for clients...");
        Socket socket = serverSocket.accept(); 
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  
        out.println("Hello client!");
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
        String clientInput = input.readLine(); 
        System.out.println(clientInput);
        input.close();
        out.close(); 
        socket.close();
    }
}
