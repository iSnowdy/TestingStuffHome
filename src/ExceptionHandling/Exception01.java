package ExceptionHandling;

public class Exception01 {
    public static void main (String[] args) {
        System.out.println("Hello World");

        try {
            int a = 5;
            int b = 0;
            System.out.println("Result: " + a / b);
        } catch (Exception aaa) {
            // exception.printStackTrace();
            System.err.println("Error " + aaa.getMessage());
        }
        System.out.println("Out of division");
    }
}
