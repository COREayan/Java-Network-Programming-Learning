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
public class CharacterStream {
    public static void main(String[] args) {
        try {
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("example4.txt"));
            InputStreamReader in = new InputStreamReader(new FileInputStream("example4.txt")); 
            
            System.out.println(out.getEncoding());
            
            out.write("Hello CharacterStream!");
            
//            out.flush();
            
            out.close(); 
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
