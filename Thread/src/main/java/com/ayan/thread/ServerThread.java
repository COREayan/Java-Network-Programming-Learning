/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ayana
 */
public class ServerThread extends Thread {
    public ServerThread(String threadName) {
        this.setName(threadName);
    }
    
    public void run() {
        int clientNumber = 1;
        
        while (clientNumber != 100) {
            try {
                System.out.println(this.getName() + " Server sent data to client: " + clientNumber);
                Thread.sleep(1000);
                clientNumber++;
            } catch (InterruptedException ex) {
                Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
}
