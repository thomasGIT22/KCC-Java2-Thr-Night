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
public class Animal implements Comparable<Animal>{

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

    public Animal(String id, String name, String species, 
            String gender, int age, boolean fixed, int legs, BigDecimal weight,
            LocalDate dateAdded, LocalDateTime lastFeedingTime) {
        setId(id);
        idList.add(id);
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setFixed(fixed);
        setLegs(legs);
        setWeight(weight);
        setDateAdded(dateAdded);
        setLastFeedingTime(lastFeedingTime);
    }
    
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
    
    // TODO: Need getId method
    public String getId() {
        return "";
    }
    
    // TODO: Call the validator method before assigning the value
    public void setId(String id) {
        this.id = id;
    }
        
    // TODO: Fix idValidator - Can't compare strings with ==. Move second if statement out of the loop. Set to private.
    public void idValidator(String id){
        
        for (int i = 0; i < idList.size(); i++) {
            if (id == idList.get(i)){
                throw new IllegalArgumentException("The id enterd is not a valid id. "
                        + "make sure the id is not allready in the id list.");
            }
            if(id != "0"){
                throw new IllegalArgumentException("The id can only "
                        + "change if it's \"0\"." );
            }
        }
    }

    public String getName() {
        return name;
    }
  
    public void setName(String name) {
        this.name = name;
    }
    
    public  String getGender(){
        return gender;
    }
    
    // TODO: Call the validator method before assigning the value
    public void setGender(String g){
        gender = g;
    }
    
    // TODO: Need genderValidator method - Only allow male and female. Only allow it to change if it's "Unknown".
    private void genderValidator() {
        
    }
    
    public String getSpecies() {
        return species;
    }
    
    // TODO: Call the validator method before assigning the value
    public void setSpecies(String species){
        this.species = species;
    }
    
    // TODO: Need speciesValidator method - Only allow cat and dog. Only allow it to change if it's "Unknown".
    private void speciesValidator() {
        
    }
    
    public int getAge(){
        return age;
    }
    
    // TODO: Need setAge method. Call the validator method before assigning the value
    public void setAge(int age) {

        this.age = age;

    }
    
    private void validateAge(int age){
        if(age < 0 || age > 100){
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
    }
    
    // TODO: Need getFixed method
    public boolean getFixed() {
        return false;
    }
    
    // TODO: Call the validator method before assigning the value
    public void setFixed (boolean fix){
        fixed = fix;
    }
    
    // TODO: Need fixedValidator method - don't allow an animal that is already fixed to be fixed again 
    private void fixedValidator() {
        
    }
    
    public int getLegs() {
        return legs;
    }
    
    // TODO: Call the validator method before assigning the value
    public void setLegs(int legs){
        this.legs = legs;
    }
    
    // TODO: Need legsValidator method - only allow legs 0 to 4
    private void legsValidator() {
        
    }
    
    public BigDecimal getWeight() {
        return weight;
    }
    
    // TODO: Call the validator method before assigning the value
    public void setWeight(BigDecimal animalWeight){
        weight = animalWeight;
    }
    
    // TODO: Need weightValidator method - only allow weight 0.0 to 1000.0 
    private void weightValidator() {
        
    }

    public LocalDate getDateAdded(){
        return dateAdded;
    }
    
    // TODO: Call the validator method before assigning the value
    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }
    
    // TODO - Include a string inside the parenthesis of the IllegalArgumentException to say what is wrong. Set to private.
    // TODO - Don't allow future dates.
    public void dateValidator(LocalDate date) {
        if(date.isBefore(LocalDate.now().minusWeeks(1))){
            throw new IllegalArgumentException();
        }
    }
    
    public LocalDateTime getLastFeedingTime() {
        return lastFeedingTime;
    }
    
    // TODO: Call the validator method before assigning the value
    public void setLastFeedingTime(LocalDateTime ldt) {
        lastFeedingTime = ldt;
    }
    
    private void feedingValidator(LocalDateTime lastFeedingTime){
        if (LocalDateTime.now().minusDays(2).isBefore(lastFeedingTime)) {
            throw new IllegalArgumentException("Last feeding times"
                    + "no less than two days in the past");
        }
    }    
    
    @Override
    public String toString(){
        return name + " the " + gender + " " + species + " is " + age
                + " and has a weight of " + weight.toString();
    }

    // TODO: Need compareTo method. Compare by their species first, then by their name 
    public int compareTo(Animal other) {
        return 0;
    }
    
}