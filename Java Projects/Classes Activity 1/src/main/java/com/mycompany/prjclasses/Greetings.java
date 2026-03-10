/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjclasses;

/**
 *
 * @author kayla
 */
public class Greetings {
  
    /*
    
    This our blueprint class 
    In the main class / method, we will create an object that is a real thing
    created from the blueprint
    
    Why do we use classes?
    - grouped related data (attributes, methods)
    - keep our code organized
    - to reuse code 
    - encapsulation
    - make our programs modular. Kachow 
    
    */  
    
    private String strMessage = "Testing, Kachow!"; // private attribute encapsulation
    
    public String getMessage()
    {
        return strMessage; 
    }
    
    public String getHello()
            
    {
        return "Hello Stephen, hope my Java activity finds you - Kayla";
    }
    
    //No system.out.println, JOptonPane mobs spawn here.
    
}
