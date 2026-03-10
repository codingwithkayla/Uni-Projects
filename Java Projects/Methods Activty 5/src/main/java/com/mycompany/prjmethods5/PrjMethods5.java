/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethods5;

import javax.swing.JOptionPane;

/**
 *
 * @author kayla
 */
public class PrjMethods5 {
    
    public static final int intTicketPrice = 100; //global variable thingy

    public static void main(String[] args) {
        
                //Movie ticket Program:
                
                int intQuantity = 0;
                int intTotalCost = 0;
                
                intQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the amount of tickets you want: "));
                
                intTotalCost = calculateTotal(intQuantity); //intTotal returns here
                
                JOptionPane.showMessageDialog(null, "Total Cost is : R " + intTotalCost);
            
    }
    
    
    
    private static int calculateTotal (int intQuantity){
        
        int intTotal = intQuantity * intTicketPrice;
        
        return intTotal;
        
    }
}
