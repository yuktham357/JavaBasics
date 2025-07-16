
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the string input");
        String s=sc.nextLine();
        int n=s.length();
        int start=0,end=n-1;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                System.out.println("Given string is not a palindrome");
                break;
            }
            System.out.println("Given string is a palindrome");
            break;
        }
    }