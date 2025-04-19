/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.javasocket;

import java.net.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author ayana
 */
public class LocalPortScanner {
    public static void main(String[] args) {
        int port = 1;
        while (port <= 65535) {
            try {
                ServerSocket server = new ServerSocket(port);
//                ServerSocket server = new ServerSocket(135);
            } catch (IOException ex) {
                System.out.println("Port " + port + " is open!");
            }
            port++;
        }
    }
}
