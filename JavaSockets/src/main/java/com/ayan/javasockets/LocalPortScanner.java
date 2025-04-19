/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.javasockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ayana
 */
public class LocalPortScanner {
    public static void main(String[] args) {
        int port = 1;
        while (port <= 65535) {
            try {
                ServerSocket server = new ServerSocket(9090);
            } catch (IOException ex) {
                System.out.println("Port : " + port + " is open");
            }
            port++; 
        }
    }
}
