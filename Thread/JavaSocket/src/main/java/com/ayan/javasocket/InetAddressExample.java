/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.javasocket;

import java.io.*; 
import java.net.*; 

/**
 *
 * @author ayana
 */
public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());
            
            InetAddress address2 = InetAddress.getByName("google.com"); 
            System.out.println(address2.getHostAddress());
            System.out.println(address2.getHostName());
            Socket socket = new Socket(address, 9090);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
