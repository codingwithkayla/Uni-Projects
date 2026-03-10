/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses4;

import javax.swing.JOptionPane;

/**
 *
 * @author kayla
 */
public class PrjClasses4 {

    public static void main(String[] args) {
        String strProduct = JOptionPane.showInputDialog
                (null, " Please enter the product Name.");
        
        double dblPrice = Double.parseDouble(JOptionPane.showInputDialog
        (null,"Please enter the price for: " + strProduct));
        
        Product prod = new Product();
        prod.setName(strProduct);
        prod.setPrice(dblPrice);
        
         String strProd2 = JOptionPane.showInputDialog
         (null, " Please enter the product Name.");
         double dblPrice2 = Double.parseDouble(JOptionPane.showInputDialog
         (null,"Please enter the price for: " + strProd2));
        
        Product prod2 = new Product();
        
        
        prod2.setName(strProduct);
        prod2.setPrice(dblPrice2);
        
        String strProd3 = JOptionPane.showInputDialog
         (null, " Please enter the product Name.");
         double dblPrice3 = Double.parseDouble(JOptionPane.showInputDialog
         (null,"Please enter the price for: " + strProd3));
         
          Product prod3 = new Product();
        prod3.setName(strProduct);
        prod3.setPrice(dblPrice3);
        
        printProductOne(prod);
        printProductTwo(prod2);
        printProductThree(prod3);
    }
    public static void printProductOne(Product prod) 
    {
        JOptionPane.showMessageDialog(null,
                "PRODUCT: " + prod.getName() + "\n PRICE: " + prod.getPrice());
    }
    public static void printProductTwo(Product prod2) 
    {
        JOptionPane.showMessageDialog(null,
                "PRODUCT: " + prod2.getName() + "\n PRICE: " + prod2.getPrice());
    }
    public static void printProductThree(Product prod3) 
    {
        JOptionPane.showMessageDialog(null,
                "PRODUCT: " + prod3.getName() + "\n PRICE: " + prod3.getPrice());
    }
}
