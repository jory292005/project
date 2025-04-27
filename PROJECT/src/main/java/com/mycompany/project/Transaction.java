/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

public class Transaction {
    private String transactionId;
    private String userId;
    private String isbn;
    private String type;
    private String date;

    public Transaction(String transactionId, String userId, String isbn, String type, String date) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.isbn = isbn;
        this.type = type;
        this.date = date;
    }

    public void showTransaction() {
        System.out.println("Transaction: " + transactionId + " | User: " + userId + " | ISBN: " + isbn + " | Type: " + type + " | Date: " + date);
    }
}

class Reservation {
    private String reservationId;
    private String userId;
    private String isbn;
    private String reservationDate;

    public Reservation(String reservationId, String userId, String isbn, String reservationDate) {
        this.reservationId = reservationId;
        this.userId = userId;
        this.isbn = isbn;
        this.reservationDate = reservationDate;
    }

    public void showReservation() {
        System.out.println("Reservation: " + reservationId + " | User: " + userId + " | ISBN: " + isbn + " | Date: " + reservationDate);
    }
}

class Fine {
    private String fineId;
    private String userId;
    private double amount;

    public Fine(String fineId, String userId, double amount) {
        this.fineId = fineId;
        this.userId = userId;
        this.amount = amount;
    }

    public void showFine() {
        System.out.println("Fine ID: " + fineId + " | User: " + userId + " | Amount: " + amount);
    }

    public void payFine() {
        System.out.println("Fine paid: " + amount);
        amount = 0;
    }
}
