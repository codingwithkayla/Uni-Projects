/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjclasses7;

/**
 *
 * @author kayla
 */
public class Calculations {
    
     private int intNumberOne, intNumberTwo;
    
    //Constructor recieves the variables from the main class to be set. // reflect here specificially, lol
    public Calculations (int intNumberOne, int intNumberTwo)
    {
        intNumberOne = intNumberOne;
        intNumberTwo = intNumberTwo;
    }
    
    public double getMultiplication()
    {
        return (intNumberOne * intNumberTwo);
    }
     public double getDivision()
    {
        return (intNumberOne / intNumberTwo);
    }
      public double getSubtraction()
    {
        return (intNumberOne - intNumberTwo);
    }
       public double getAddition()
    {
        return (intNumberOne + intNumberTwo);
    }
    

    
}
