/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc.animal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author k0519415
 */
public abstract class Animal{

    private String name;
    private String species;
    private String gender;
    private int age;
    private boolean fixed;
    private int legs;
    private BigDecimal weight;
    private LocalDate dateAdded;
    private LocalDateTime lastFeedingTime;

    // TODO: Need full constructor
    
    // TODO: Need default constructor

    // TODO: Need getName method - Daniel
    
    /**
     * An setter method to set the name of an Animal.
     * 
     * @author Cash Carlson
     * @param name The name of an animal
     */
    public void setName(String name) {
        this.name = name;
    }
    
    // TODO: Need getSpecies method - Sheryl
    public String getSpecies() {
        return species;
    }
    
    // TODO: Need getGender method - Nate
    
    // TODO: Need getAge method - Jakub
    public int getAge(){
        return age;
    }
    // TODO: Need setAge method - Musab
    
    // TODO: Need getFixed method - Jamesser
    
    // TODO: Need setFixed method - Asaaad
    
    // TODO: Need getLegs method - Mitchell
    
    // TODO: Need setLegs method - Ramiro
    public void setLegs(int legs){
        this.legs = legs;
    }
    // TODO: Need getWeight method - Calvin
    /**
     * @return the weight
     */
    public BigDecimal getWeight() {
        return weight;
    }
   
    
    // TODO: Need setWeight method - Richard
    public void setWeight(BigDecimal animalWeight){
        weight = animalWeight;
    }
    
    // TODO: Need getDateAdded method - Thomas
    public LocalDate getDateAdded(){
        return dateAdded;
    }
    
    /**
     * Need setDateAdded method - Nathaniel
     * @param dateAdded the dateAdded to set
     */
    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }
    
    // TODO: Need getLastFeedingTime method - Christopher
    
    // TODO: Need setLastFeedingTime method
    public void setLastFeedingTime(LocalDateTime ldt) {
        lastFeedingTime = ldt;
    }
    
    // TODO: Need toString method
    
    // TODO: Need compareTo method

}