/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjclasses6;

/**
 *
 * @author kayla
 */
public class Doctor {
    
    
    private String strDoctor, strPatient;
    private double dblFee;
    private int intConsultation;
    
    //Constructor recieves the variables from the main class to be set.
    public Doctor(String strDoctorName, String strPatientName, double dblConsultationFee, int intConsultationAmount)
    {
        strDoctor = strDoctorName;
        strPatient = strPatientName;
        dblFee = dblConsultationFee;
        intConsultation = intConsultationAmount;
    }
    
    public String getDoctor ()
    {
        return strDoctor;
    }
    
    public String getPatient ()
    {
        return strPatient;
    }
    
    public double getTotalDue()
    {
        return (dblFee * intConsultation);
    }
    
    
}

