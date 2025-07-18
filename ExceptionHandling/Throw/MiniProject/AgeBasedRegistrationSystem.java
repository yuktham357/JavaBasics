Class UnderAgeException extends Exception{
    public UnderAgeException(String message){
        super(message);
    }
}
import java.util.Scanner;
public class RegistrationSystem{
    static void registerUser(int age) throws UnderAgeException{
        if(age<18){
            throw new UnderAgeException("You must be 18 older to register");
        }
        else{
            System.out.println("Registration Sucessful. Welcome!");
        }
    }
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age ");
    int age=sc.nextInt();
    try{
        registerUser(age);
    }
    catch(UnderAgeException e){
        System.out.println("Registration Failed: "+ e.getMessage());

    }
}