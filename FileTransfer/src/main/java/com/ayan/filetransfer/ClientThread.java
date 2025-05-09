/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.filetransfer;

import java.io.*;
import java.net.*; 

/**
 *
 * @author ayana
 */
public class ClientThread extends Thread {    
    private Socket socket; 
    private BufferedReader reader;
    private BufferedOutputStream out; 
    private BufferedInputStream fileReader;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }
    
    public void run() {
        try {
            // create the buffered reader
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // create the output buffered reader 
            out = new BufferedOutputStream(socket.getOutputStream()); 
            
            // read the filename 
            String fileName = reader.readLine(); 
            System.out.println("file name: " + fileName + " has been requested by " + socket.getInetAddress().getHostAddress());
            File file = new File(fileName); 
            // String rootDirectory = "D:\\rootDirectory";
            // File file = new File(rootDirectory + "" + file); 
            // verify that the file exists
            if (!file.exists()) {
                // if file does not exists send coe 0 and close the connection
                byte code = (byte)0; 
                out.write(code);
                closeConnection(); 
            } else {
                // if the file exists send code 1 and send the file 
                out.write((byte) 1);
                // create a buffered input stream variable
                fileReader = new BufferedInputStream(new FileInputStream(file)); 
                // set the buffer size
                byte[] buffer = new byte[1024]; 
                // this interger is stores the 
                int bytesRead = 0; 
                while ((bytesRead = fileReader.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead); 
                    // System.out.println(bytesRead); 
                    out.flush();
                }
                // close the connection after the download is finished
                closeConnection(); 
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public void closeConnection() {
        try {
            if (out != null) {
                out.close(); 
            }
            if (reader != null) {
                reader.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
            if (out != null) {
                socket.close();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
