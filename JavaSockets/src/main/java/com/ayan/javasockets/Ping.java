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
public class Ping {
    public static void main(String[] args) {
        try {
            String hostAddress = "google.com";
            InetAddress host = InetAddress.getByName(hostAddress); 
            System.out.println(host.isReachable(1000));
            
            Process p = Runtime.getRuntime().exec("ping " + hostAddress); 
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream())); 
            
            String commandOutput = ""; 
            boolean isReachable = true; 
            // reading output stream of the command 
            while ((commandOutput = inputStream.readLine()) != null) {
                // System.out.println(commandOutput); 
                if (commandOutput.contains("DEstination host unreachable")) {
                    isReachable = false; 
                    break;
                }
            }
            if (isReachable) {
                System.out.println("Host is reachable!");
            } else {
                System.out.println("Host is not reachable!");
            }
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
