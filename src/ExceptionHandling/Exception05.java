package ExceptionHandling;

public class Exception05 {
    public static void main (String[] args) {
        System.out.println("Bruv");

        try {
            int a = 2;
            int b = 0;
            int c = 1;

            int result = a/b;
            String message = null;

            System.out.println(message.length());
        } catch (ArithmeticException exception) {
            System.err.println("Division error " + exception.getMessage());
        } finally {
            System.out.println("An unexpected error has occurred");
        }
    }
}
