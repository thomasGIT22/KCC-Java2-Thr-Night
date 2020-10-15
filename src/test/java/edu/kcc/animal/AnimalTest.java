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

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    /*@org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }*/

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
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
    
    // TODO - Need testGetSpecies method (Becky)
    
    // TODO - Need testGetGender method (Whitney)
    
    // TODO - Need testGetName method (Chase)
    
    // TODO - Need testGetAge method (Fadwa)
    
    // TODO - Need testGetFixed method (Calvin)
    /**
     * Test of getFixed method, of class Animal.
     */
    @org.junit.jupiter.api.Test
    public void testGetFixed() {
        System.out.println("getFixed");
        Animal instance = animal;
        boolean expResult = false;
        boolean result = instance.getFixed();
        assertEquals(expResult, result);
    }
    
    // TODO - Need testGetId method (Joseph)
    
    // TODO - Need testGetLegs method (Thomas)
    @org.junit.Test
    public void testGetLegs() {
        setUp();
        int expected = 4;
        String actual = animal.getLegs();
        assertEquals(expected, actual);
    }
    // TODO - Need testGetWeight method (Chantal)
    
    // TODO - Need testGetDateAdded method
    
    // TODO - Need testGetLastFeedingTime method

    /**
     * Test of setName method, of class Animal.
     */
    @org.junit.jupiter.api.Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Animal instance = new Animal();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecies method, of class Animal.
     */
    @org.junit.jupiter.api.Test
    public void testGetSpecies() {
        System.out.println("getSpecies");
        Animal instance = new Animal();
        String expResult = "";
        String result = instance.getSpecies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Animal.
     */
    @org.junit.jupiter.api.Test
    public void testGetGender() {
        System.out.println("getGender");
        Animal instance = new Animal();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Animal.
     */
    @org.junit.jupiter.api.Test
    public void testGetAge() {
        System.out.println("getAge");
        Animal instance = new Animal();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFixed method, of class Animal.
     */
    @org.junit.jupiter.api.Test
    public void testSetFixed() {
        System.out.println("setFixed");
        boolean fix = false;
        Animal instance = new Animal();
        instance.setFixed(fix);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLegs method, of class Animal.
     */
    @org.junit.jupiter.api.Test
    public void testSetLegs() {
        System.out.println("setLegs");
        int legs = 0;
        Animal instance = new Animal();
        instance.setLegs(legs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Animal.
     */
    @org.junit.jupiter.api.Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Animal instance = new Animal();
        BigDecimal expResult = null;
        BigDecimal result = instance.getWeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class Animal.
     */
    @org.junit.jupiter.api.Test
    public void testSetWeight() {
        System.out.println("setWeight");
        BigDecimal animalWeight = null;
        Animal instance = new Animal();
        instance.setWeight(animalWeight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateAdded method, of class Animal.
     */
    @org.junit.jupiter.api.Test
    public void testGetDateAdded() {
        System.out.println("getDateAdded");
        Animal instance = new Animal();
        LocalDate expResult = null;
        LocalDate result = instance.getDateAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateAdded method, of class Animal.
     */
    @org.junit.jupiter.api.Test
    public void testSetDateAdded() {
        System.out.println("setDateAdded");
        LocalDate dateAdded = null;
        Animal instance = new Animal();
        instance.setDateAdded(dateAdded);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastFeedingTime method, of class Animal.
     */
    @org.junit.jupiter.api.Test
    public void testSetLastFeedingTime() {
        System.out.println("setLastFeedingTime");
        LocalDateTime ldt = null;
        Animal instance = new Animal();
        instance.setLastFeedingTime(ldt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
