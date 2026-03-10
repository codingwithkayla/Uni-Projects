/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethods6;

import javax.swing.JOptionPane;

/**
 *
 * @author kayla
 */
public class PrjMethods6 {

    public static final double VAT = 0.15;

    public static void main(String[] args) {

        String strProduct = "";
        double dblPrice = 0.0;
        int intQuantity = 0;
        double dblTotalDiscount = 0.0;

        strProduct = JOptionPane.showInputDialog("Enter product name:");
        dblPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter product price:"));
        intQuantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));
        dblTotalDiscount = amountDue(dblPrice, intQuantity);

        JOptionPane.showMessageDialog(null,
                "PRODUCT REPORT\n"
                + "----------------------\n"
                + "Product: " + strProduct + "\n"
                + "Price: R" + dblPrice + "\n"
                + "Quantity: " + intQuantity + "\n"
                + "VAT Amount: R" + dblTotalDiscount
        );
    }

    public static double amountDue(double price, int quantity) {

        double total;
        double dblVatAmount;
        total = price * quantity;
        dblVatAmount = total * VAT;
        return dblVatAmount;
    }
  }

  