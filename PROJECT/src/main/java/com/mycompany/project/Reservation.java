/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

public class Reservation {

    String reservationId;
    String userId;
    String bookId;
    String reservationDate;

    public Reservation(String rId, String uId, String bId, String rDate) {
        reservationId = rId;
        userId = uId;
        bookId = bId;
        reservationDate = rDate;
    }

    public void showReservation() {
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("User ID: " + userId);
        System.out.println("Book ID: " + bookId);
        System.out.println("Reservation Date: " + reservationDate);
    }
}