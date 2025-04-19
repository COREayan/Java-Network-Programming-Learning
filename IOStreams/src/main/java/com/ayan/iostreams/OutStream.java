/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.iostreams;

import java.io.FileOutputStream;

/**
 *
 * @author ayana
 */
public class OutStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutput = new FileOutputStream("example2.txt", true); 
            
            char H = 'H';  
            
            fileOutput.write((char) H);
            
//            String string = "Hello Java Network Programming!"; 
            String string = "Hello OutputStream!";
    
            fileOutput.write(string.getBytes());   
            
            fileOutput.close();  
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
