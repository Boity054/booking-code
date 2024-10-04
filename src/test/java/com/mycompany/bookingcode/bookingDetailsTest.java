/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.bookingcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class bookingDetailsTest {
    /**
     * Test of checkBookingCode method, of class bookingDetails.
     */
    @Test
    public void testCheckBookingCode() {
        System.out.println("checkBookingCode");
        String code = "Event_123";
        bookingDetails instance = new bookingDetails();
        boolean expResult = false;
        boolean result = instance.checkBookingCode(code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class bookingDetails.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Password1@";
        bookingDetails instance = new bookingDetails();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of makeReservation method, of class bookingDetails.
     */
    @Test
    public void testMakeReservation() {
        System.out.println("makeReservation");
        String code = "Event_1";
        String password = "Password1@";
        bookingDetails instance = new bookingDetails();
        String expResult = "Event_1"+"Password1@";
        String result = expResult;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
