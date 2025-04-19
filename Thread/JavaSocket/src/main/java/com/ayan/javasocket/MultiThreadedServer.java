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

class ClientThread extends Thread {
    private Socket socket = null; 
    
    
    public ClientThread(Socket socket) {
        this.socket = socket;
    }
    
    public void run() {
        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  
            out.println("Hello client!");
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


public class MultiThreadedServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            boolean stop = false;
            while (!stop) {
                System.out.println("Waiting for clients...");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client is connected");
                
                ClientThread clientThread = new ClientThread(clientSocket); 
                clientThread.start();
                
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
