/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses5;

import javax.swing.JOptionPane;

/**
 *
 * @author kayla
 */
public class PrjClasses5 {

     private static BankAccount M = new BankAccount(); //Testing something - attempt 1
    public static void main(String[] args)
    {
       
        String strName = JOptionPane.showInputDialog
                (null, "Please enter your name");
        String strType = JOptionPane.showInputDialog
                (null, "Please enter your account type");
        double dblCurrent = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter your current balance"));
        
        M.setName(strName);
        M.setType(strType);
        M.setBalance(dblCurrent);
        
        printAccount();
        
    }
    public static void printAccount()
    {
        String strDisplay = 
        " BANK REPORT: \n"+ "NAME : \n"
                + M.getName() 
                + "ACC TYPE: \n" 
                + M.getType()
                + "CURRENT BAL: \n" 
                + M.getBalance();
        
        JOptionPane.showMessageDialog(null, strDisplay);
    }
}
