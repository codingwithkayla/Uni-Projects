/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses7;

import java.util.Scanner;

/**
 *
 * @author kayla
 */
public class PrjClasses7 {

    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter number One:");
        int intNumberOne = scan.nextInt();
        
        System.out.print("Please enter number Two:");
        int intNumberTwo = scan.nextInt();
        
        Calculations a = new Calculations(intNumberOne, intNumberTwo);
        
        printDetails(a);
        
    }
    
    public static void printDetails(Calculations a)
    {
        System.out.println("\n ADDITION: " + a.getAddition());
        System.out.println("DIVISION: " + a.getDivision());
        System.out.println("MULTIPLICATION: " + a.getMultiplication());
        System.out.println("SUBTRACTION: " + a.getSubtraction());
    }
    }


    


