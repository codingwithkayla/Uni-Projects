/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjclasses5;

/**
 *
 * @author kayla
 */
public class BankAccount {
    

 private String strAccountHolderName;
    private String strAccountType;
    private double dblCurrentBalance;
    
       public void setName(String strName) 
    {
       strAccountHolderName = strName; 
    }
       public String getName() 
    {
       return strAccountHolderName;
    }
       public void setType (String strType)
    {
       strAccountType = strType; 
    }
        public String getType() 
    {
       return strAccountType;
    }
      
    public void setBalance (double dblCurrent) 
    {
        dblCurrentBalance = dblCurrent;
    }
    public double getBalance()
    {
        return dblCurrentBalance + (dblCurrentBalance * 0.05); 
    }
}