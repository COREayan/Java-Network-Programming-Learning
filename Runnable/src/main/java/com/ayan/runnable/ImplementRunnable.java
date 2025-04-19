/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.runnable;

/**
 *
 * @author ayana
 */
public class ImplementRunnable implements Runnable {
    private int threadIndex;
    
    public ImplementRunnable(int index) {
        this.threadIndex = index;
    }
    
    public void run() {
        int clientNumber = 1;
        while (clientNumber != 100) {
            System.out.println("Server " + this.threadIndex +  " sent data to client: " + clientNumber);
            clientNumber++;
        }
    }
    
    public void start() {
        Thread thread = new Thread(this); 
        thread.start();
    }
}
