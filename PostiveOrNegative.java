import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number");
        int a=scan.nextInt();
        if(a>0 && a!=0){
            System.out.println("Positive");
        }
        if(a==0){
            System.out.println("Zero");
        }
        if(a<0){
            System.out.println("Negative");
        }
        scan.close(); 
        }
}