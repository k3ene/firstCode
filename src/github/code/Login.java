package github.code;

public class Login {
        String firstName;
        String lastName;
        String username;
        String password;
        String phoneNumber;
      
    //Constructor
        public Login(String firstName, String lastName, String username, String password, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
       
    //Username must contain "_" and be <= 5 characters
        public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
            
    }        
            
    //Password must be at least 8 chars, contains uppercase, digits and special char
        public boolean checkPasswordComplexity() {
        if (password.length() < 8) return false;
    
        boolean hasUpper = false, hasDigit = false, hasSpecial = false;
            for (char c: password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
          else if (Character.isDigit(c)) hasDigit = true;
          else if (!Character.isLetterOrDigit(c)) hasSpecial = true;
    
    }
        return hasUpper && hasDigit && hasSpecial;
    }
    //Phone number must start with +27 and be least 12 characters long 
        public boolean checkCellPhone() {
        return phoneNumber.startsWith("+27") && phoneNumber.length() >= 12;
        
    }
    
    //Register user 
      public String registerUser() {
          if (checkUserName() && checkPasswordComplexity() && checkCellPhone()) {
        return "Registration successful for user:" + username;
        } else {
        return "Registration failed. Please check your details" ;      
    
    }
    }

    //Login check
      public String returnLoginStatus(String enteredUsername, String enteredPassword) {
          if (this.username.equals(enteredUsername) && this.password.equals(enteredPassword)) {
        return "Login successful. Welcome " + firstName + "" + lastName + "!";
        
        } else {
        return "Login failed. Incorrect username or password.";
          }
      }
}















































































































