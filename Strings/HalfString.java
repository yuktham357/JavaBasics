import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the string input");
        String s=sc.nextLine();
        int n=s.length();
        String res="";
        if(n%2!=0){
            System.out.println("Null");
        }
        else{
            for(int i=0;i<n/2;i++){
                res=res+s.charAt(i);
            }
        }
        System.out.println(res);
    }
}