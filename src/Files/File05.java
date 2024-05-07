package Files;
import java.io.*;
import java.util.Scanner;

public class File05 {
    public static void main(String[] args) {
        String filePath = "filename.txt";
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Please write in a line your thoughts about this MiniGame. It will greatly help to improve" +
                    "the program later on. Any kind of advice is appreciated.\nThank you.");

            FileWriter fileWriter = new FileWriter(filePath);
            PrintWriter printWriter = new PrintWriter(fileWriter, true); // True to append at the end
            printWriter.println("Joselito");
            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                printWriter.println(line);
            }
            printWriter.println("Joselito");

            printWriter.close();
            fileWriter.close();

            System.out.println("FeedBack has been successfully added. Thank you very much :) Hope to see you back!");
        } catch (IOException exception1) {
            System.out.println("Error while trying to add the FeedBack .txt");
            exception1.printStackTrace();
        }
    }
}
