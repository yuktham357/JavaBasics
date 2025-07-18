public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            int result = numbers[5] / 0;
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling...");
    }
}
