/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author k0519415
 */
public class Animal {

    private String id;
    private static List<String> idList = new ArrayList<>();
    private String name;
    private String species;
    private String gender;
    private int age;
    private boolean fixed;
    private int legs;
    private BigDecimal weight;
    private LocalDate dateAdded;
    private LocalDateTime lastFeedingTime;

    // TODO: Need full constructor (Cash)
    public Animal() {
        id = "0";
        idList.add(id);
        name = "Unknown";
        species = "Unknown";
        gender = "Unknown";
        age = 0;
        fixed = false;
        legs = 4;
        weight = BigDecimal.valueOf(0);
        dateAdded = LocalDate.of(2020, 9, 1); // September 1, 2020
        lastFeedingTime = LocalDateTime.of(2020, 10, 1, 23, 59); // October 1, 2020 at 11:59pm
    }

    // TODO: Need getId method (Daniel)
    // TODO: Need setId method (Sheryl)
    public void setId(String id) {
        this.id = id;
    }

    // TODO: Need idValidator method (Nate)
    private void idValidator(String id) {

        for (id.equals(id)) {
            if (if != 0) {
                throw new IllegalArgumentException("The id enterd is not a valid id. "
                        + "make sure the id is not already in the id list.");
            }

        }
        if (id != "0") {
            throw new IllegalArgumentException("The id can only "
                    + "change if it's \"0\".");
        }
    }
    // Only allow it to change if it's "0". 
    // Do not allow an id to be set if the id is already in the idList

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    // TODO: Need setSpecies method (Jakub)
    public void setSpecies(String species) {
        this.species = species;
    }
    // TODO: Need speciesValidator method (Musab)
    // Only allow cat and dog. Only allow it to change if it's "Unknown".

    public String getGender() {
        return gender;
    }

    // TODO: Need setGender method (Jamesser)
    // TODO: Need genderValidator method (Asaad)
    // Only allow male and female. Only allow it to change if it's "Unknown".
    public int getAge() {
        return age;
    }
    // TODO: Need setAge method (Mitchell)

    // TODO: Need ageValidator method - only allow ages 0 to 100 (Calvin)
    public void validateAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
    }

    // TODO: Need getFixed method (Richard)
    public void setFixed(boolean fix) {
        fixed = fix;
    }

    // TODO: Need fixedValidator method (Thomas)
    // don't allow an animal that is already fixed to be fixed again
    // TODO: Need getLegs method (Nathaniel)
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    // TODO: Need legsValidator method - only allow legs 0 to 4(Christopher)
    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal animalWeight) {
        weight = animalWeight;
    }

    // TODO: Need weightValidator method - only allow weight 0.0 to 1000.0 (Daniel)
    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    // TODO: Need dateValidator method (Cash)
    // only allow dates up to a week in the past
    // TODO: Need getLastFeedingTime method (Sheryl)
    public LocalDateTime getLastFeedingTime() {
        return lastFeedingTime;
    }

    public void setLastFeedingTime(LocalDateTime ldt) {
        lastFeedingTime = ldt;
    }

    // TODO: Need feedingValidator method (Nate)
//<<<<<<< HEAD
    private void feedingValidator(LocalDateTime lastFeedingTime) {
        if (LocalDateTime.now().minusDays(2).isBefore(lastFeedingTime)) {
            throw new IllegalArgumentException("Last feeding times"
                    + "no less than two days in the past");
        }
    }    // only allow day/times up to two days in the past

//=======
    // only allow day/times up to two days in the past
//>>>>>>> 084e0f8f8bd7e909fa9eec88069f31a883ffa682
    // TODO: Need toString method (Jakub)
    @Override
    public String toString() {
        return name + " the " + gender + " " + species + " is " + age
                + " and has a weight of " + weight.toString();
        /*
        return "Name: " + name + "\n" +
                "Gender: " + gender + "\n" +
                "Species: " + species + "\n" +
                "Age: " + age + "\n" +
                "Weight: " + weight;
         */
    }
    //include name, species, gender, age, and weight 

    // TODO: Need compareTo method //Musab
    // Compare by their species first, then by their name 
    boolean getFixed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
