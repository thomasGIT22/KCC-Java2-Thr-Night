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
public class Animal{

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
    
    // TODO: Need idValidator method (Nate)
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
    
    // TODO: Need speciesValidator method (Musab)
        // Only allow cat and dog. Only allow it to change if it's "Unknown".
    
    public String getGender() {
        return gender;
    }
    
    // TODO: Need setGender method (Jamesser)
    
    // TODO: Need genderValidator method (Asaad)
        // Only allow male and female. Only allow it to change if it's "Unknown".
    
    public int getAge(){
        return age;
    }
    // TODO: Need setAge method (Mitchell)
    
    // TODO: Need ageValidator method - only allow ages 0 to 100 (Calvin)
    
    // TODO: Need getFixed method (Richard)
    
    public void setFixed (boolean fix){
        fixed = fix;
    }
    
    // TODO: Need fixedValidator method (Thomas)
        // don't allow an animal that is already fixed to be fixed again
    
    
    // TODO: Need getLegs method (Nathaniel)
    public int getLegs() {
        return legs;
    }
    
    public void setLegs(int legs){
        this.legs = legs;
    }
    
    // TODO: Need legsValidator method - only allow legs 0 to 4(Christopher)
    
    public BigDecimal getWeight() {
        return weight;
    }
   
    public void setWeight(BigDecimal animalWeight){
        weight = animalWeight;
    }
    
    // TODO: Need weightValidator method - only allow weight 0.0 to 1000.0 (Daniel)
    
    
    public LocalDate getDateAdded(){
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }
    
    // TODO: Need dateValidator method (Cash)
        // only allow dates up to a week in the past
    
    
    // TODO: Need getLastFeedingTime method (Sheryl)
    
    public void setLastFeedingTime(LocalDateTime ldt) {
        lastFeedingTime = ldt;
    }
    
    // TODO: Need feedingValidator method (Nate)
        // only allow day/times up to two days in the past
    
    // TODO: Need toString method (Jakub)
        //include name, species, gender, age, and weight 
    
    // TODO: Need compareTo method //Musab
        // Compare by their species first, then by their name 

}