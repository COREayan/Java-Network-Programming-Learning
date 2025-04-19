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
public class BufferStream {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("example6.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("example7.txt"));
            
            String line = null;  
            
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            
            writer.close();
            reader.close();
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
