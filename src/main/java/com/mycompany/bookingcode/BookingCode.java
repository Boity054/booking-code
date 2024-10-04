/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookingcode;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class BookingCode {

    public static void main(String[] args) {
        //declarations
        String code= "Event_123";
        String password;
        
        bookingDetails book=new bookingDetails();
        
         //create an object of the scanner
        Scanner input=new Scanner(System.in);
        
        //prompt the user to enter the code and password
        
        do{
        System.out.println("Enter booking code:");
        code=input.next();
        book.setCode("Event_123");
        }while (book.checkBookingCode(code));
        
       do{
        System.out.println("Enter password:");
        password=input.next();
        book.setPassword("Password1@");
       }while(book.checkPasswordComplexity(password));
       
       
        //dispaly  Reservation Status
        String reservationMessage=book.makeReservation("Event_123","Password1@");
        System.out.println(reservationMessage);
    }      
}
