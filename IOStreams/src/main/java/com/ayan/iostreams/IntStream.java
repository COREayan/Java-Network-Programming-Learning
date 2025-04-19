/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ayan.iostreams;

import java.io.*; 

/**
 *
 * @author ayana
 */
public class IntStream {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        try {
            FileInputStream inputStream = new FileInputStream("example1.txt");
            
            int data = inputStream.read();
            
            while (data != -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }
            
            inputStream.close();
        } catch (Exception e) {
            
        } 
    }
}
