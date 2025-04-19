/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.thread;

/**
 *
 * @author ayana
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");

        /*
        ServerThread thread = new ServerThread("Server1");
        ServerThread thread2 = new ServerThread("Server2");
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        thread2.start();
        */
//        thread.start(); // we cant call start method twice!

        int second = 1;
        try {
            while (second <= 100) {
                Thread.sleep(100);
                System.out.println("Second: " + second);
                second++;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
