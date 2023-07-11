/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntt.mainn;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Thanh
 */
public class CauHinh {
    public static final Scanner sc = new Scanner(System.in);
    public static SimpleDateFormat  f = new SimpleDateFormat("dd/MM/yyyy" );
    
    public static int ktYear(int year) {
        if (year <= 1900 || year > 2222) return -1;
        if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
            return 1;
        return 0;
    }   

    public static int ktMonth(int month,int year) {
        switch(month) {
            case 1: 
            case 3:
            case 5:
            case 7:
            case 8: 
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(ktYear(year) == 1)
                    return 29;
                if(ktYear(year) == 0)
                    return 28;
            default: 
                return -1;
        }
    }

    public static String ktHopLe(int day, int month, int year) {

        int isDayMax = ktMonth(month, year);
        if(isDayMax != -1 && (day > 0 && day <= isDayMax))
             return String.format("%d/%d/%d",day, month, year);
        return "";
    }
    
}
