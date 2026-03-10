/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjuserinput;

import java.util.Scanner;

/**
 *
 * @author kayla
 */
public class PrjUserInput {

    public static void main(String[] args) {
        
        //created an object of the scanner class - needs import 
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Please enter the customers name: ");
            String strCustomer = scan.nextLine();
        System.out.print("Enter produt name: ");
            String strProduct = scan.nextLine();
        System.out.print("Please provide your address: ");
            String strAddress = scan.nextLine();
        
        System.out.println("DELIVERY REPORT");
        System.out.println("---------------");
     
        System.out.println("Customer Name:\t " + strCustomer);
        System.out.println("Product Name:\t " + strProduct);
        System.out.println("Home Address:\t " + strAddress);
        // get the delivery address
    }
}
