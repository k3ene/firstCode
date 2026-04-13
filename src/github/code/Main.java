package github.code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Ask user basic details
        System.out.println("Enter your first name:");
        String firstName = input.nextLine();
        
        System.out.println("Enter your last name:");
        String lastName = input.nextLine();
        
    //Username validation loop
        String username;
            while (true) {
        
        System.out.println("Enter username (must contain '_'); and be <= 5 characters):");
        username = input.nextLine();
        
        Login tempUser = new Login(firstName, lastName, username,"","");
            if(tempUser.checkUserName()) {
                break;
                
          } else {
        System.out.println("Username is not correctly formatted. Try again.");
        
            }
            }
    //Password validation loop
        String password;
            while (true) {
        
        System.out.println("Enter password (min 8 chars, must include capital, number, special char):");
        password = input.nextLine();
        
        Login tempUser = new Login(firstName, lastName, username, password,"");
            if (tempUser.checkPasswordComplexity()){
                break;
      
         } else {
        System.out.println("Password is not incorrectly formatted. Try again.");
                        
           }     
           }
    //Phone number validation
        String phoneNumber;
        while (true) {
            
        System.out.println("Enter phone number (must start with +27...):");
        phoneNumber = input.nextLine();
        
        Login tempUser = new Login(firstName, lastName, username, password, phoneNumber);
            if (tempUser.checkCellPhone()){
                break;
                
         } else {
        System.out.println("Cellphone number incorrectly formatted. Try again.");
   
          }
          }
    //Create final user object
        Login user = new Login(firstName, lastName, username, password, phoneNumber);
        
    //Register the user
        String registrationMessage = user.registerUser();
        System.out.println(registrationMessage);
        
    //Allow login only if  registration was successful
            if (registrationMessage.contains("successful")) {
        System.out.println("\nLogin");
        System.out.println("Enter username: ");
        String enteredUsername = input.nextLine();
        
        System.out.println("Enter password: ");
        String enteredPassword = input.nextLine();
        
    //Display the login results
    
        System.out.println(user.returnLoginStatus(enteredUsername, enteredPassword));
        
            }
        
       
   }
   
}
