/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ayan.javasockets;

import java.util.*; 
import java.net.*; 
import org.apache.commons.validator.routines.InetAddressValidator;

/**
 *
 * @author ayana
 */
public class ValidateIP {
    public static void main(String[] args) {
        InetAddressValidator validator = new InetAddressValidator();
        String ipAddress = "192.168.0.10";
        boolean isValid = validator.isValid(ipAddress); 
        if (isValid) {
            System.out.println(ipAddress + " is valid");
        } else {
            System.out.println(ipAddress + " is not valid");
        }
    }
    
    public boolean validateIpAddress(String ipAddress) {
        String[] numbers = ipAddress.split("\\."); 
        if (numbers.length != 4) {
            return false;
        }
        
        for (String str : numbers) {
            int i = Integer.parseInt(str); 
            if ((i<0) || equals(i>255)) {
                return false; 
            }
        }
        return true;
    }
}
