/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.javasockets;

import java.io.*;
import java.net.*; 

/**
 *
 * @author ayana
 */
public class Client {
    public static void main(String[] args) {
        try {
//            Socket socket = new Socket("localhost", 9090);
            InetAddress serverAddress = InetAddress.getByName("localhost"); 
            System.out.println("server ip address: " + serverAddress.getHostAddress());
            Socket socket = new Socket(serverAddress, 9090);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); 
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
            System.out.println(input.readLine());
            out.println("hello server!");
            input.close(); 
            out.close();
            socket.close(); 
        } catch (UnknownHostException e1) {
            System.out.println("Unknown host exception " + e1.toString());
        } catch (IOException e2) {
            System.out.println("IOException " + e2.toString());
        } catch (IllegalArgumentException e3) {
            System.out.println("Illegal Argument Exception " + e3.toString());
        } catch (Exception e4) {
            System.out.println("Other exception " + e4.toString());
        }
    }
}
