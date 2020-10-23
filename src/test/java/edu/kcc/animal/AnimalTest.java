/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
<<<<<<< HEAD
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
=======
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
>>>>>>> d7cf15101410e1b1e1258289ec83185362337d79
/**
 *
 * @author marchauschildt
 */
public class AnimalTest {
    
<<<<<<< HEAD
=======
    private Animal instance;

    @Before
>>>>>>> d7cf15101410e1b1e1258289ec83185362337d79
    public void setUp() {
        instance = new Animal();
    }
    
<<<<<<< HEAD
    // TODO - Need testGetId method
   
=======
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
>>>>>>> d7cf15101410e1b1e1258289ec83185362337d79
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
    
<<<<<<< HEAD
    // TODO - Need testGetAge method (Ramiro)
    public void testGetAge(){
        setUp();
        int expResult = 0;
        int result = animal.getAge();
        assertEquals(expResult, result);
=======
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
>>>>>>> d7cf15101410e1b1e1258289ec83185362337d79
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
    
<<<<<<< HEAD
    // TODO - Need testGetLastFeedingTime method (Ramiro)
        public void testGetLastFeedingTime()
        {
            setUp();
            LocalDateTime expResult = LocalDateTime.of(2020, 10, 1, 23, 59);
            LocalDateTime result = animal.getLastFeedingTime();
            assertEquals(expResult, result);
        }
=======
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
    
>>>>>>> d7cf15101410e1b1e1258289ec83185362337d79
}
