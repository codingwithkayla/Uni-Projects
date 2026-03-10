/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethod3;

import javax.swing.JOptionPane;

/**
 *
 * @author kayla
 */
public class PrjMethod3 {

    public static void main(String[] args) 
    {
        System.out.println("This is attempt 1 Kachow");

        // Input from user
        String strName = JOptionPane.showInputDialog("Enter your name:");
        String strDob = JOptionPane.showInputDialog("Enter your date of birth:");
        String strCell = JOptionPane.showInputDialog("Enter your cell phone number:");
        String strId = JOptionPane.showInputDialog("Enter your ID number:");

        // Method call - arguments
        printDetails(strName, strDob, strCell, strId);
    }

    // Method header
    private static void printDetails(String strName, String strDob, String strCell, String strId)
    {
        System.out.println("We are in the printDetails method I hope, Kachow");

        JOptionPane.showMessageDialog(null,
                "User Details" +
                "\n---------------------" +
                "\nName: " + strName +
                "\nDate of Birth: " + strDob +
                "\nCell Phone Number: " + strCell +
                "\nID Number: " + strId);
        // The code above basically displays how the output of the code will look when the output has Joptionpane. Kachow!                                                                                     
       
    }
    
    private static void exitApplication() //Private class, only this class below can access it, kachow
    {
    JOptionPane.showMessageDialog(null, "Thank you for using our program, seeya.");    
    }
}       // public methods, other classes may access it, Kachow

