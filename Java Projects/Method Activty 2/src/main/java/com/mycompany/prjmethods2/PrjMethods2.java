/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethods2;

/**
 *
 * @author kayla
 */
public class PrjMethods2 {

    public static void main(String[] args) 
    {
        outputName("Deej"); //This is called an argument,, Kachow
    }
    public static void outputName(String strName)
    {
        System.out.println("Your name is: " + strName);
        
        outputAge(21);
    }
    public static void outputAge(int intAge)
    {
        System.out.println("Your age is: " + intAge);
    }
}
