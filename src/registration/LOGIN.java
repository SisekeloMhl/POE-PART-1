/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab,SisekeloMhlakazaST10092252
 */
public class LOGIN {

String passMessage;
String nameMessage;

/*Check if the username contains an underscore and is not more than 5 letters in length.*/
public boolean checkUsername(String Username){
    return Username.contains("_")&&Username.length() <= 5;}

/*Check that the password has at least 8 characters in length, contains an uppercase, a special character and a number*/
public boolean checkPasswordComplexity(String password){
    boolean passwordOkay = false;
    boolean hasNumber = false;
    boolean hasCap = false;
    boolean hasChar = false;
    char current;
    
//loop only executes if password length constraints are met
if(password.length() >=8);{
for(int i = 0; i < password.length(); i++){
    current = password.charAt(i);
if(Character.isDigit(current)){
    hasNumber = true;
    }
else if(Character.isUpperCase(current)){
    hasCap = true;
}   
else if(!(Character.isLetterOrDigit(current))){
    hasChar = true;
}
}
}
if(hasNumber && hasCap && hasChar){
    passwordOkay = true;
}
return passwordOkay;
}

/*Method takes a password and username as arguments.
*A message is returned determined by whether the password and username meet requirements for entry*/
public String registerUser(String pass, String name){
    if(checkPasswordComplexity(pass)){
        passMessage = "Password Successfully Captured.";
    }
    else{
        passMessage = "Password is not correctly formatted, please ensure that the password contains at least 8 characters" + "a capital leatter, a number and a special character.";
    }
    if(checkUsername(name)){
        nameMessage = "Username Successfully Captured.";
    }
    else{
        nameMessage = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5  characters in length.";
    }
return(nameMessage + "\n" + passMessage);
}

public boolean loginUser(boolean checkName, boolean checkPassword, String Password, String Username){
    boolean logged = false;
    if(checkName && checkPassword){
//Run only if the user is successfully registered
Scanner in = new
            Scanner(System.in);
System.out.println("");
System.out.println("***LOGIN***");

System.out.print("Enter the username you used to register:");
    String username = in.nextLine();
    System.out.print("Enter the password you used to register:");
    String password = in.nextLine();
if(password.equals(Password)&& username.equals(Username)){
    logged = true;
}
    }
    return logged;
}
public String returnLoginStatus(boolean regStatus, String FirstName, String LastName){
    String message;

/*The login status will only be returned if the user managed to register an account to avoid unecessary messages. Which means an appropriate message will be displayed depending
    on whether the login details meet the details that were used to create the account.*/ 
  
message = "Username and/or password incorrect, please try again";
    if(regStatus){
        message = "Welcome, " + FirstName + " " + LastName + "It is great to see you again.";
    }
  return message;
}
//test data
String Name = "kyl_1";
String pass = "Ch&&sec@ke99!";
}
