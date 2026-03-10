/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses6;

import java.util.Scanner;

/**
 *
 * @author kayla
 */
public class PrjClasses6 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please eneter the doctors name:");
        String strDoctor = scan.nextLine();
        
        System.out.print("Please enter the patient name:");
        String strPatient = scan.nextLine();
        
        System.out.print("Please enter consultation fee:");
        double dblFee = scan.nextDouble();
        
        System.out.print("Please enter the amount of consultations: ");
        int intConsultations = scan.nextInt();
        
        Doctor House = new Doctor (strDoctor, strPatient, dblFee, intConsultations);
        
        printDetails(House);
        
    }
    
    public static void printDetails(Doctor House)
    {
        System.out.println("\nDOCTOR NAME: " + House.getDoctor());
        System.out.println("PATIENT NAME: " + House.getPatient());
        System.out.println("AMOUNT DUE: " + House.getTotalDue());
    }
}
