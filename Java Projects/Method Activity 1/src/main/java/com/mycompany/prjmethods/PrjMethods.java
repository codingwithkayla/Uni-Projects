/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethods;

import java.util.Scanner;

/**
 *
 * @author kayla
 */
public class PrjMethods {

    public static void main(String[] args) 
    {
       System.out.println("We are in the main method, Kachow") ;
       calculateVat(); //method call method thing
       displayData(); //Another method call thing
    }
    
    private static void calculateVat() 
    {
      System.out.println("We are in the calculate vat method, Kachow");
      
      Scanner scan = new Scanner(System.in); //object of scanner class, Kachow
      double dblPrice= 0.0;
      
      System.out.println("Please enter the price  excluding VAT, Kachow: ");
      dblPrice = scan.nextDouble(); // Input from user where they provide the price excluding the vat, kachow
       
      double vatTotal = dblPrice * 0.15;
      double totalPrice = dblPrice + vatTotal;
      System.out.println( "Original Price: R" + dblPrice);
      System.out.println("VAT AMOUNT: R" + vatTotal);
      System.out.println("Final price: R" + totalPrice);
      
    } //Access specifier, return type and method name
    private static void displayData() //This is the display data method header, Kachow
    {
        System.out.println("We are in the display data method, Kachow"); 
    }
}
