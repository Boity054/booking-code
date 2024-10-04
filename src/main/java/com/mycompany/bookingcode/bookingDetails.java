/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookingcode;

/**
 *
 * @author RC_Student_lab
 */
public class bookingDetails {
      private String code;
    private String password;
    
    //Getters and Setters
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code=code;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public boolean checkBookingCode(String code){ 
           if (code.contains("_") && code.length()>=12){
               return true;
           }
           else{
               return false;
           }
       }
public boolean checkPasswordComplexity(String password){
    if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[!@#$%^&*().]*")){
        return true;
    }
    else {
        return false;
    }
}

public String makeReservation(String code, String password){
    if (!checkBookingCode(code)){
        System.out.println("The booking code is incorrectly formated.");
    }
    else if (!checkPasswordComplexity(password)){
        System.out.println("The password does not meet the complexity requirements. Please try again.");
    }
    
    else {
       System.out.println("Reservation successfully made!");
    }
        return null;
}
}
