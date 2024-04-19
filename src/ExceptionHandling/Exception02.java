package ExceptionHandling;

public class Exception02 {
    public static void main (String[] args) {
        System.out.println("Hello there");

        try {
            int a = 2;
            int b = 0;
            int c = 1;
            // System.out.println("Result: " + a/b);
            System.out.println("Result: " + a/c);
        } catch (ArithmeticException exception) {
            System.err.println("Error type: " + exception.getMessage());
        } finally {
            System.out.println("This will always be printed");
        }
        System.out.println("After error message");
    }
}
