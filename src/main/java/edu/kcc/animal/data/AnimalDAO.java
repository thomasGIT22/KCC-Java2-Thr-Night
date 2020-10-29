package edu.kcc.animal.data;

import edu.kcc.animal.Animal;
import java.util.ArrayList;

/**
 *
 * @author PSUser
 */
public interface AnimalDAO {
    void createAnimalRecord(Animal animal);
    
    Animal getAnimalById(String id);
    
    ArrayList<Animal> getAllAnimals();
    
    void updateAnimal(Animal original, Animal updated);
    
    void deleteAnimal(Animal animal);
    
    void deleteAnimal(String id);
} //end of interface 