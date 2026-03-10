/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethods4;

/**
 *
 * @author kayla
 */
public class PrjMethods4 {

    public static void main(String[] args) {
        String strDisplay = hello();
       
        System.out.println("The method said: " + strDisplay);
    }
   
    public static String hello() //return type of string, static mean it belongs to this method
    {
        String strGreeting = "Greetings";//local variable - can only be used inside this method
        return strGreeting;
    }
           
}