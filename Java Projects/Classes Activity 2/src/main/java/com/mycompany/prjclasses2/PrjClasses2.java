/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjclasses2;

import javax.swing.JOptionPane;

/**
 *
 * @author kayla
 */
public class PrjClasses2 {

    private static Student s = new Student();

    public static void main(String[] args) {

        String strName = JOptionPane.showInputDialog(null, "Please eneter ja name");
        String strCourse = JOptionPane.showInputDialog(null, "Please ennter ja course");
        double dblAverage = Double.parseDouble(JOptionPane.showInputDialog(null, 0.0);

        
        s.setName(strName);
        s.setCourse(strCourse);
        s.setAverage(dblAverage);
        
        print();
        
    }
    
    public static void print () 
    {
        String strDisplay = " Student Report: \n" 
                + "STUDENT: \n" + s.getname()
                + "\n" 
                + "COURSE: " + s.getCourse() 
                + "\n" 
                + "UPDATE AVERAGE: " + s.getAverage();
        
        JOptionPane.showMessageDialog(null, strDisplay);
    }
}
