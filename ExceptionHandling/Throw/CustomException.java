class AgeTooSmallException extends Exception {
    public AgeTooSmallException(String message) {
        super(message);
    }
}
public class Example3 {
    static void checkAge(int age) throws AgeTooSmallException {
        if (age < 18) {
            throw new AgeTooSmallException("Age is too small to register.");
        }
        System.out.println("Age accepted.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeTooSmallException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
