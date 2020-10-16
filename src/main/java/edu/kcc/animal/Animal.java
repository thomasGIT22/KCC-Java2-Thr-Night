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
    
    // TODO: Need setName method - Cash
    
    // TODO: Need getSpecies method - Sheryl
    
    // TODO: Need getGender method - Nate
    public  String getGender(){
        return gender;
    }
    
    public void setGender(String g){
        gender = g;
        
    }
    
    // TODO: Need getAge method - Jakub
    
    // TODO: Need setAge method - Musab
    
    // TODO: Need getFixed method - Jamesser
    
    // TODO: Need setFixed method - Asaaad
    public void setFixed (boolean fix){
        fixed = fix;
    }
    
    // TODO: Need getLegs method - Mitchell
    
    // TODO: Need setLegs method - Ramiro
    
    // TODO: Need getWeight method - Calvin
    
    // TODO: Need setWeight method - Richard
    
    // TODO: Need getDateAdded method - Thomas
    
    // TODO: Need setDateAdded method - Nathaniel
    
    // TODO: Need getLastFeedingTime method - Christopher
    
    // TODO: Need setLastFeedingTime method
    public void setLastFeedingTime(LocalDateTime ldt) {
        lastFeedingTime = ldt;
    }
    
    // TODO: Need toString method
    
    // TODO: Need compareTo method
}