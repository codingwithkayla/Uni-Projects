/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjuserinput3;

import javax.swing.JOptionPane;

/**
 *
 * @author kayla
 */
public class PrjUserInput3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
    String strName = JOptionPane.showInputDialog
        (null,"Please enter your name: ");
    
    int intSubjects = Integer.parseInt
        (JOptionPane.showInputDialog
        (null,"How many subjects are you taking?"));
    
    double dblCostPerSubject = Double.parseDouble
        (JOptionPane.showInputDialog
        (null, "Please enter your cost per subjects"));
    
    double dblTotal = intSubjects * dblCostPerSubject;
   
        JOptionPane.showMessageDialog(null, 
                "Student Name: " + strName +
                "\nNumber of Subjects: " + intSubjects +
                "\nTotal Cost: " + dblTotal);
    }
    
    
    
    
    
}
