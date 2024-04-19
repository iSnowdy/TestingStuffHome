package ExceptionHandling;

public class Exception03 {
    public static void main (String[] args) {
        System.out.println(":)");

        try {
            int a = 2;
            int b = 0;
            int c = 1;
            // Error nº1

            int result = a/b;
            String message = null;
            // Error nº2
            System.out.println(message.length());
        } catch (ArithmeticException exception) {
            System.err.println("Division Error " + exception.getMessage());
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Length error");
            // System.err.println("Length error " + exception.getMessage());
        }

        // String messageTwo = null;
        // System.out.println(messageTwo.length());
    }
}
