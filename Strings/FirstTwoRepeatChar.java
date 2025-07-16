import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the string input");
        String s=sc.nextLine();
        int n=s.length();
        String res="";
        for(int i=0;i<2;i++){
            res=res+s.charAt(i);
        }
        String temp=res;
        for(int i=0;i<n-1;i++){
            temp=temp+res;
        }
        System.out.println(temp);
        
    }
}