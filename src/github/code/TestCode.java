package github.code;


    public class TestCode {
        public static void main(String[] args) {
    
     //Test 1: Username validation
        Login user1 = new Login("Khumo", "Selolo", "cde_", "Password1!","+271234567890");
        System.out.println("Test 1 - Usename valid: " +  user1.checkUserName()); //expected true
        
        Login user2 = new Login("Khumo", "Selolo", "cde_", "Password1!","+271234567890");
        System.out.println("Test 2 - Username valid: " +  user2.checkUserName()); //expected false
        
        //Test 3: Password complexity
        Login user3 = new Login("Khumo", "Selolo", "cde_", "Pass1!","+271234567890");
        System.out.println("Test 3 - Password valid: " +  user3.checkUserName()); //expected false
        
        Login user4 = new Login("Khumo", "Selolo", "cde_", "Password1!","+271234567890");
        System.out.println("Test 4 - Password valid: " +  user4.checkUserName()); //expected true (too short)
        
         Login user5 = new Login("Khumo", "Selolo", "cde_", "Password1!","+271234567890");
        System.out.println("Test 5 - Phone valid: " +  user5.checkUserName()); //expected false (does not start with +27)
        
        Login user6 = new Login("Khumo", "Selolo", "cde_", "Password1!","+271234567890");
        System.out.println("Test 6 - Phone valid: " +  user6.checkUserName()); //expected true
        
        //Test 7: Registration
        System.out.println("Test 7 - Registration: " +  user6.checkUserName()); //expected success
        
        //Tes 8: Login status 
        System.out.println ("Test 8 - Login correct: " + user6.returnLoginStatus("cde_", "Password1!")); //expected success
        System.out.println ("Test 8 - Login wrong: " + user6.returnLoginStatus("cde_", "WrongPass")); //expected fail
    }
    
}
