import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter the number of rows:");
        int rows=scan.nextInt();
        System.out.println("Enter the number of cols:");
        int cols=scan.nextInt();
        int[][] arr= new int[rows][cols]; 
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=scan.nextInt();
            }
        }
         System.out.println("2D Array output");
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println("Sum of the Array "+ sum);
        int avg=sum/(rows*cols);
        System.out.println("Average of the array "+ avg);