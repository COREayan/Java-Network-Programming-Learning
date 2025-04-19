/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.iostreams;

import java.io.PrintStream;

/**
 *
 * @author ayana
 */
public class PrtStream {
    public static void main(String[] args) {
        try {
            PrintStream out = new PrintStream("example8.txt"); 
            
            int var1 = 10; 
            
            System.out.println("The value of var1 is: " + var1);
            
            out.println("The value of var1 is: " + var1);
            out.close();
        } catch (Exception e) {
            
        }
    }
}
