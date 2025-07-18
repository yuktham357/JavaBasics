public class Example1 {
    public static void main(String[] args) {
        int age = 15;
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or older to vote.");
        }
        System.out.println("You are eligible to vote.");
    }
}
