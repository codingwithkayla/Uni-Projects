/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjvariables;

/**
 *
 * @author kayla
 */
public class PrjVariables {

    public static void main(String[] args) {
        String strName = "Deej"; // String refers to names
        int intAge = 21; // Int dec refers to digits only, no symbols
        double dblPayRate = 90.50; // double refers to numbers that contain decimals
        
        strName = "Habibi Louis";
        
        final double dblVat = 0.15; // constant variable
        
        System.out.println("PERSONAL DETAILS");
        System.out.println("----------------");
        System.out.println("NAME:" + strName);
        System.out.println("AGE:" + intAge);
        System.out.println("PAY RATE: " + dblPayRate);
    }
}
