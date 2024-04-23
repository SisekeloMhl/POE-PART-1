/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registration;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab,SisekeloMhlakazaST10092252
 */
public class Registration {
private static String Username;
private static String Password;
private static String FirstName;
private static String LastName;
   
  //get and set Username  
    public static void setUsername(String Name){
    Username = Name;}
    public static String getUsername(){
    return Username;
    }
    
public static void setPassword(String pass){
    Password = pass;
}
public static String getPassword(){
    return Password;
}

//get and set the First and Last name
public static void setFirstName(String name){
    FirstName = name;
}
public static String getFirstName(){
    return FirstName;
}

public static void setLastName(String surname){
    LastName = surname;
}
public static String getLastName(){
    return LastName;
}
public static void main(String[] args)
{
LOGIN loginObj = new LOGIN();

/*prompt user for necessary input and pass input directly to applicable methods*/
Scanner data = new Scanner(System.in);
System.out.println("Registration");

System.out.print("Enter your first name as shown on your ID:");
setFirstName(data.nextLine());

System.out.print("Enter your last name as shown on your ID:");
setLastName(data.nextLine());

System.out.print("Enter your Username:");
setUsername(data.nextLine());

//make sure Username meets requirements
loginObj.checkUsername(getUsername());

System.out.print("Enter your password:");
setPassword(data.nextLine());

//make sure the password meets the requirements
loginObj.checkPasswordComplexity(Password);

/*Progress the username and password to method and then print out the messages returned*/

System.out.println(loginObj.registerUser(getPassword(), getUsername()));

//Save the boolean value returned by loginUser() in the regstatus variable. The boolean value will the be used in the returnloginStatus method
boolean regStatus = loginObj.loginUser(loginObj.checkUsername(getUsername()), loginObj.checkPasswordComplexity(getPassword()), getPassword(), getUsername());

System.out.println(loginObj.returnLoginStatus(regStatus, getFirstName(), getLastName()));
}
}




        
        

