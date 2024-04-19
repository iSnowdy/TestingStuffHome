package ExceptionHandling;

public class Exception04 {
    public static void main (String[] args) {

        System.out.println(":D");
        String[] message = {"En", "un", null, "lugar"};
        String[] message2 = {"En", "un", "lugar", "un", "un", "un",};

        try {
            for (int i = 0; i < 5; i ++) System.out.println(message[i].toUpperCase());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException exception) {
            System.err.println("Error. Out of Bounds or Null Pointer");
        }
        System.out.println("End Message");
        System.out.println("-------");

        try {
            for (int i = 0; i < 10; i ++) System.out.println(message2[i].toUpperCase());
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("Error. Out of Bounds");
        } catch (NullPointerException exception) {
            System.err.println("Error. Null pointer");
        }
    }
}
