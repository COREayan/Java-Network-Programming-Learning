/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.filetransfer;

import java.io.IOException;
import java.net.*;

/**
 *
 * @author ayana
 */
public class Server {
    public static void main(String[] args) {
        try {
            // initialize the Server Socket class 
            ServerSocket serverSocket = new ServerSocket(9090);
            
            // boolean variable to stop the server
            boolean isStopped = false;
            while (!isStopped) {
                // create client socket object
                Socket clientSocket = serverSocket.accept(); 
                // create and start client thread 
                ClientThread clientThread = new ClientThread(clientSocket); 
                clientThread.start(); 
            }
        } catch (IOException e) {
            System.out.println("Port 9090 is already opened! Please use another port.");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
