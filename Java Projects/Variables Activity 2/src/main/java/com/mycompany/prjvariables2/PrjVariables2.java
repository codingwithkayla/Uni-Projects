/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjvariables2;

import javax.swing.JOptionPane;

/**
 *
 * @author kayla
 */
public class PrjVariables2 {

    public static void main(String[] args) {
        String strStudentNum = " ";
        String strName; 
        String strCourse;
        
        strStudentNum = JOptionPane.showInputDialog
        (null, "Please enter your student ID Number:");
        strName = JOptionPane.showInputDialog(null, "Please enter your Name");
        strCourse = JOptionPane.showInputDialog(null, "Please enter your course");
        
        JOptionPane.showMessageDialog(null, 
                "\nStudent Number: " + strStudentNum +
                "\nStudent Name: " + strName +
                "\nStudent Course: " + strCourse);
        
       
        
    }
}

