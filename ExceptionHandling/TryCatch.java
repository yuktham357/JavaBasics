import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        try {
            int num = Integer.parseInt(s);  // may throw NumberFormatException
            int square = num * num; 
            System.out.println("The square value is " + square);
            System.out.println("The work has been done successfully");
        } catch (NumberFormatException e) {
            System.out.println("Entered input is not a valid format for an integer.");
        }
    }
}