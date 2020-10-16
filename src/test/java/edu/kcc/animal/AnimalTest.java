/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Asaad Moah
 */
public class AnimalTest {
     private static final String N = "N";
     private static final String S = "S";
     private static final String GENDER = "M";
     private static final int A = 9;
     private static final boolean T = true;
     private static final int L = 8;
    private static final BigDecimal B = new BigDecimal("4.00");
     private static final LocalDateTime D = LocalDateTime.now();
     private static final LocalDateTime TM = LocalDateTime.now();
     
     private Animal instance;
    
    public AnimalTest() {
    }

    @Test
    public void testSomeMethod() {
    }
    @BeforeEach
    public void setUp() {
        instance  = new  Animal(N,S,GENDER,A,T,L,B,D,TM);
       
    }
    @Test
    public void getGender() {
        setUp();
        String expResult = "M";
        String result = instance.getGender();
        assertEquals(expResult, result);
    }
    
}
