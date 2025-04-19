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
        }
    }
}
