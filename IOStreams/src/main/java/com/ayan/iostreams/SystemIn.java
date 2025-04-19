/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.iostreams;

import java.io.*;

/**
 *
 * @author ayana
 */
public class SystemIn {
    public static void main(String[] args) {
        System.out.print("Please enter the port number: ");
        
        InputStreamReader in = new InputStreamReader(System.in); 
        
        /*
        int data = in.read(); 
        while (data != -1) {
            System.out.print((char) data);
            data = in.read(); 
        }
        */ 
        
        BufferedReader reader = new BufferedReader(in);  
        
        boolean isValid = false; 
        int port = 0; 
        
        while (!isValid) {
            try {
                String portString = reader.readLine(); 
                port = Integer.parseInt(portString); 
                System.out.println("Port is accepted!");
                isValid = true; 
            } catch (Exception e) {
                System.out.println("Please insert a number!");
                System.out.println("Please enter the port number: ");
            }
        }
        System.out.print("Please enter Server IP address: ");
        
        String ipAddress = "";  
        
        try {
            ipAddress = reader.readLine(); 
        } catch (Exception e) {
            System.out.println("Cannot read the ip address! " + e.toString());
        }
        
        System.out.println("");
        System.out.println("__________________________________");
        System.out.println("");
        
        System.out.println("Trying to connect to IP: " + ipAddress + " on port: " + port + "...");
    }
}
