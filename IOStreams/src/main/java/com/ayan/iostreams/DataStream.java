/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.iostreams;

import java.io.*; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ayana
 */
public class DataStream {
    public static void main(String[] args) {
        File file = new File("example3.txt");
        
        if (file.exists()) {
            System.out.println("File already exists!" + file.getName());
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File was created!");
                    System.out.println("file path: " + file.getAbsolutePath());
                } else {
                    System.out.println("Cannot create file");
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file.getName()));
            DataInputStream in = new DataInputStream(new FileInputStream(file.getName()));
            
            out.writeInt(72);
            out.writeDouble(678.00); 
            out.writeFloat(123.45F);
            
            int var1 = in.readInt();  
            double var2 = in.readDouble(); 
            float var3 = in.readFloat();  
            
            out.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
