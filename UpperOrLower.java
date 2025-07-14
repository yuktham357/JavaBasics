
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number:");
        char ans=scan.next().charAt(0);
        if(Character.isUpperCase(ans)){
            System.out.println("Upper case Character");
        }
        if(Character.isLowerCase(ans)){
            System.out.println("Lower case Character");
        }
      
    }
}


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number:");
        char ans=scan.next().charAt(0);
        if(ans>='a' && ans<='z'){
            System.out.println("Lower case Character");
        }
        if(ans>='A' && ans<='Z'){
            System.out.println("Upper case Character");
        }
    }
}