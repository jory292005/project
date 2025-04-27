/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

public class Fine {

    String fineId;
    String userId;
    double amount;
    boolean isPaid;

    public Fine(String fId, String uId, double fineAmount) {
        fineId = fId;
        userId = uId;
        amount = fineAmount;
        isPaid = false;
    }

    public void showFine() {
        System.out.println("Fine ID: " + fineId);
        System.out.println("User ID: " + userId);
        System.out.println("Amount: " + amount);
        if (isPaid) {
            System.out.println("Status: Paid");
        } else {
            System.out.println("Status: Not Paid");
        }
    }

    public void payFine() {
        if (!isPaid) {
            isPaid = true;
            System.out.println("Fine has been paid. Thank you!");
        } else {
            System.out.println("Fine is already paid.");
        }
    }
}