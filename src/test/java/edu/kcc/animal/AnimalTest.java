/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
/**
 *
 * @author marchauschildt
 */
public class AnimalTest {

    private Animal animal;
    
    @Before
    public void setUp() {
        animal = new Animal();
    }
    
    // TODO - Need testGetId method
    
    @org.junit.Test
    public void testGetName() {
        setUp();
        String expected = "Unknown";
        String actual = animal.getName();
        assertEquals(expected, actual);
    }
    
    // TODO - Need testGetSpecies method (Jamesser)
    
    // TODO - Need testGetGender method (Asaad)
    
    // TODO - Need testGetName method (Mitchell)
    
    // TODO - Need testGetAge method (Ramiro)
    
    // TODO - Need testGetFixed method (Calvin)
    
    // TODO - Need testGetId method (Richard)
    
    // TODO - Need testGeLegs method (Thomas)
    
    // TODO - Need testGetWeight method (Nathaniel)
    
    // TODO - Need testGetDateAdded method (Christopher)
    
    // TODO - Need testGetLastFeedingTime method (Ramiro)
    
}
