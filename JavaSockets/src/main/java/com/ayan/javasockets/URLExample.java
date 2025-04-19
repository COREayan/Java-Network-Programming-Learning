/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.javasockets;

/**
 *
 * @author ayana
 */

import java.io.*; 
import java.net.*; 
import java.util.regex.*; 

public class URLExample {
    public static void main(String[] args) throws Exception {
        // URL 
        // URLConnection
        /*
            http://example.com
        */
        
        URL url = new URL("https://www.google.com"); 
        URLConnection myURL = url.openConnection(); 
        BufferedReader in = new BufferedReader(new InputStreamReader(myURL.getInputStream())); 
        String inputLine; 
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
    }
}
