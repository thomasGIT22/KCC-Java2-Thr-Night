/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AnimalTest {
    private Animal instance;

    @Before
    public void setUp() {
        instance = new Animal();
    }
    
    // TODO
    @org.junit.Test
    public void testGetId() {
        assertTrue(false);
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
    

    public void testGetAge(){
        setUp();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }
    
    // TODO
    @org.junit.Test
    public void testSetSpeciesCatToDogBad() {
        fail("The test case is a prototype.");
    }

    // TODO
    @org.junit.Test
    public void testSetAge0Good() {
        instance.setAge(0);
        assertEquals(0, instance.getAge());
    }
    
    // TODO
    @org.junit.Test
    public void testSetAge100Good() {
        instance.setAge(100);
        assertEquals(100, instance.getAge());
    }
    
    @org.junit.Test
    public void testSetAgeNegativeBad() {
        try {
            setUp();
            instance.setAge(-10);
            fail("Test Failed. setAge allowed a negative number.");
        } catch (Exception ex) {
            assertTrue(true);
        }
    }
    

    // TODO  Asaad good
    @org.junit.Test
    public void testSetAgeAbove100Bad() {
        setUp();
        try  {
            instance.setAge(102);
            fail("you can't set age above 100");
        }catch( IllegalArgumentException ex)
        {
            assertTrue(true);
        }
            
        
    }

    @org.junit.Test
    public void testGetFixed() {
        System.out.println("getFixed");
        Animal instance = new Animal();
        boolean expResult = false;
        boolean result = instance.getFixed();
        assertEquals(expResult, result);
    }


    // TODO gooodddddd
    @org.junit.Test
    public void testSetFixedFalseToTrueGood() {
        setUp();
        instance.setFixed(true);
        assertEquals(true, instance.getFixed());
    }
     
    // TODO
    @org.junit.Test
    public void testSetFixedTruetoFalseBad() {
        
         setUp();
         try {
            instance.setFixed(false);
            fail("Test Failed. setFixed allowed a true.");
        } catch (Exception ex) {
            assertTrue(true);
        }
    }
        
    

    
    //Sheryl
    @org.junit.Test
    public void testGetLegs() {
        setUp();
        int expResult = 4;
        int result = instance.getLegs();
        assertEquals(expResult, result);
    }

    //Sheryl
    @org.junit.Test
    public void testSetLegsTo4Good() {
        setUp();
        instance.setLegs(4);
        int expResult = 4;
        assertEquals(expResult, instance.getLegs());

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
        setUp();
        try{
            instance.setWeight(BigDecimal.valueOf(-1.00));
            fail("You cant set weight as a negative number.");
        }catch(Exception e){
            assertTrue(true);
        }
    }
    
    // TODO
    @org.junit.Test
    public void testSetWeightAbove1000Bad() {
        setUp();
        try{
            instance.setWeight(BigDecimal.valueOf(1001));
            fail("You cant set weight over 1000.");
        }catch(Exception e){
            assertTrue(true);
        }
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
    
    // TODO - Need testGetLastFeedingTime method (Ramiro)
    public void testGetLastFeedingTime()
    {
        setUp();
        LocalDateTime expResult = LocalDateTime.of(2020, 10, 1, 23, 59);
        LocalDateTime result = instance.getLastFeedingTime();
        assertEquals(expResult, result);
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
        instance.setName("Frodo");
        instance.setAge(2);
        instance.setSpecies("cat");
        instance.setGender("male");
        instance.setWeight(new BigDecimal(10.5));
        assertEquals("Frodo the male cat is 2 and has a weight of 10.5", instance.toString());
    }

    // TODO
    @org.junit.Test
    public void testCompareToCattoDog() {
        Animal cat = new Animal();
        cat.setSpecies("Cat");
        Animal dog = new Animal();
        dog.setSpecies("Dog");
        int result = cat.compareTo(dog);
        assertTrue(result==-1, "failed compare cat to dog");
    }
    
    // TODO
    @org.junit.Test
    public void testCompareToDogtoCat() {
        Animal cat = new Animal();
        cat.setSpecies("Cat");
        Animal dog = new Animal();
        dog.setSpecies("Dog");
        int result = dog.compareTo(cat);
        assertTrue(result==1, "failed compare dog to cat");
    }

    // TODO
    @org.junit.Test
    public void testCompareToCatAlphatoCatBeta() {
        Animal alpha = new Animal();
        alpha.setSpecies("Cat");
        alpha.setName("Alpha");
        Animal beta = new Animal();
        beta.setSpecies("Cat");
        beta.setName("Beta");
        int result = alpha.compareTo(beta);
        assertTrue(result==-1, "failed compare cat alpha to cat beta");
    }
    
    // TODO
    @org.junit.Test
    public void testCompareToCatBetatoCatAlpha() {
        Animal alpha = new Animal();
        alpha.setSpecies("Cat");
        alpha.setName("Alpha");
        Animal beta = new Animal();
        beta.setSpecies("Cat");
        beta.setName("Beta");
        int result = beta.compareTo(alpha);
        assertTrue(result==1, "failed compare cat beta to cat alpha");
    }

    // TODO
    @org.junit.Test
    public void testCompareToCatAlphatoCatAlpha() {
        Animal alpha = new Animal();
        alpha.setSpecies("Cat");
        alpha.setName("Alpha");
        Animal alpha2 = new Animal();
        alpha2.setSpecies("Cat");
        alpha2.setName("Alpha");
        int result = alpha.compareTo(alpha2);
        assertTrue(result==-1, "failed compare cat alpha to cat alpha");
    }
    
}
