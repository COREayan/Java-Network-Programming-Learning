/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ayan.uwebserver;

import java.net.*;
import java.net.*; 

/**
 *
 * @author ayana
 */
public class Main {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(80); // create a server socket object 
            boolean isStop = false; 
            
            while (!isStop) { // while server is not stopped
                Socket clientSocket = serverSocket.accept(); // accept a client 
                System.out.println("Cleint " + clientSocket.getInetAddress().getHostAddress() + " is connected"); // preint client
                ClientThread clientThread = new ClientThread(clientSocket); // create a new thread for each client
                clientThread.start(); // start the thread
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
