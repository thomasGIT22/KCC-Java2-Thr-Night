/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author marchauschildt
 */
public class AnimalTest {
    
    private Animal instance;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        instance = new Animal();
    }

    @After
    public void tearDown() throws Exception {
    }
    
    // TODO
    @org.junit.Test
    public void testGetId() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetId() {
        fail("The test case is a prototype.");
    }
    
    // TODO - This should not allow a second animal to have the same id as the first animal
    @org.junit.Test
    public void testSetIdBad() {
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetName() {
        setUp();
        String expected = "Unknown";
        String actual = instance.getName();
        assertEquals(expected, actual);
    }

    // TODO
    @org.junit.Test
    public void testSetName() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testGetGender() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetGender() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    public void testSetGenderNotMaleFemaleBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    public void testSetGenderMaleToFemaleBad() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testGetSpecies() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetSpecies() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetSpeciesNotCatorDogBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetSpeciesCatToDogBad() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testGetAge() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetAge0Good() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetAge100Good() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetAgeNegativeBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetAgeAbove100Bad() {
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetFixed() {
        setUp();
        boolean expResult = false;
        boolean result = instance.getFixed();
        assertEquals(expResult, result);
    }

    // TODO
    @org.junit.Test
    public void testSetFixedFalseToTrueGood() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetFixedTruetoFalseBad() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testGetLegs() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetLegsTo4Good() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetLegsTo0Good() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetLegsTo5Bad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetLegsToNegativeBad() {
        fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testGetWeight() {
        setUp();
        BigDecimal expected = new BigDecimal(0);
        BigDecimal actual = instance.getWeight();
        assertEquals(expected, actual);
    }

    // TODO
    @org.junit.Test
    public void testSetWeightToZeroGood() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetWeightTo1000Good() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetWeightNegativeBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetWeightAbove1000Bad() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testGetDateAdded() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetDateAddedTodayGood() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetDateAddedAWeekAgoGood() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetDateAdded8DaysAgoBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetDateAddedTomorrowBad() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testGetLastFeedingTime() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetLastFeedingTimeAnHourAgoGood() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetLastFeedingTime2DaysAgoGood() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetLastFeedingTime3DaysAgoBad() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testSetLastFeedingTime1HourInTheFutureBad() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testToString() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testCompareToCattoDog() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testCompareToDogtoCat() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testCompareToCatAlphatoCatBeta() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testCompareToCatBetatoCatAlpha() {
        fail("The test case is a prototype.");
    }
    
    // TODO
    @org.junit.Test
    public void testCompareToCatAlphatoCatAlpha() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of idValidator method, of class Animal.
     */
    @Test
    public void testIdValidator() {
        System.out.println("idValidator");
        String id = "";
        Animal instance = new Animal();
        instance.idValidator(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Animal.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        Animal instance = new Animal();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFixed method, of class Animal.
     */
    @Test
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
    @Test
    public void testSetLegs() {
        System.out.println("setLegs");
        int legs = 0;
        Animal instance = new Animal();
        instance.setLegs(legs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class Animal.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        BigDecimal animalWeight = null;
        Animal instance = new Animal();
        instance.setWeight(animalWeight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateAdded method, of class Animal.
     */
    @Test
    public void testSetDateAdded() {
        System.out.println("setDateAdded");
        LocalDate dateAdded = null;
        Animal instance = new Animal();
        instance.setDateAdded(dateAdded);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dateValidator method, of class Animal.
     */
    @Test
    public void testDateValidator() {
        System.out.println("dateValidator");
        LocalDate date = null;
        Animal instance = new Animal();
        instance.dateValidator(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastFeedingTime method, of class Animal.
     */
    @Test
    public void testSetLastFeedingTime() {
        System.out.println("setLastFeedingTime");
        LocalDateTime ldt = null;
        Animal instance = new Animal();
        instance.setLastFeedingTime(ldt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Animal.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Animal other = null;
        Animal instance = new Animal();
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
