/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kcc;

import edu.kcc.ui.UIUtility;
import edu.kcc.animal.Animal;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author k0519415
 * @author Nathaniel Webber
 */
public class Main {

    private static final int PORT = 5555;
    private static final String HOST_NAME = "localhost";
    
    private static Animal getAnimalFromServer(String nameInput) throws UnknownHostException, IOException {
        Socket socket = new Socket(HOST_NAME, PORT);
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
        outputStream.writeUTF(nameInput);
        outputStream.flush();
        String id = inputStream.readUTF();
        String animalName = inputStream.readUTF();
        String species = inputStream.readUTF();
        String gender = inputStream.readUTF();
        int age = inputStream.readInt();
        Boolean fixed = inputStream.readBoolean();
        int legs = inputStream.readInt();
        double weight = inputStream.readDouble();
        String dateAdded = inputStream.readUTF();
        String lastFeedingTime = inputStream.readUTF();
        Animal animal = new Animal();
        inputStream.close();
        outputStream.close();
        return animal;
    }
    
    private static String getUserInput(String prompt){
        System.out.print(prompt + " ");
        return new Scanner(System.in).nextLine();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        UIUtility.showMessage("Program starting...");
        
        String menuTitle = "Main Menu";
        String[] menuOptions = {
            "1) Find an animal",
            "2) Show lookup history",
            "3) Exit"
        };
        String prompt = "Your choice:";
        String errorMessage = "Invalid option.  Please try again.";
        String userChoice;
        // AnimalDAO dao = AnimalDAO.getAnimalDAO();
        
        boolean working = true;
        while(working) {
            userChoice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions);
            switch(userChoice) {
                case "1":
                    // Enter an animal name - Find an animal
                    System.out.println("Enter an animal's name:\n");
                    Scanner scanner = new Scanner(System.in);
                    
                    String userInput = scanner.nextLine(); 
                    getAnimalFromServer(userInput);
                    break;
                case "2":
                    // Find an Animal
                    System.out.println("You found the Animal");
                    break;
                case "3":
                    working = false;
                    break;
                default:
                    UIUtility.showErrorMessage(errorMessage, true);  
            }
        }
        UIUtility.showMessage("\nProgram complete.");
    }
    
}
