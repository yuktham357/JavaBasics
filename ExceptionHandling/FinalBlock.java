------------------Exception Caught-------------
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block is always executed.");
        }
    }
}
----------------Without Exception-------------
public class FinallyExample2 {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("This will run regardless of exception.");
        }
    }
}

