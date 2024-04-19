package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File01 {
    public static void main (String[] args) {
        System.out.println("Hehe");

        // File newFile = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            File newfile = new File("filename.txt"); // First of all we open the file
            if (newfile.createNewFile()) System.out.println("File has been created in " +
                    newfile.getAbsolutePath() + " with the name " + newfile.getName()); // If it doesn't exist, we create it
            else System.out.println("File already exists");
        } catch (IOException exception0) {
            System.out.println("Unexpected error");
            exception0.printStackTrace();
        }

        try {
            // newFile = new File("C:\\Users\\AndyLópezRey\\Documents\\Temp\\newfile.txt");
            fileReader = new FileReader("C:\\Users\\AndyLópezRey\\Documents\\Programación\\IntelliJ\\Java\\TestingStuff\\Exception02.java");
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) System.out.println(line);
            // While there's a line to read, it will print it. Starting from line 0 and when line 0 ends,
            // it jumps to the next one (\n)
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (null != fileReader) {
                    fileReader.close(); // We must always close the file once we're done with it so it doesn't consume memory space
                }
            } catch (Exception exception2) {
                exception2.printStackTrace();
            }
        }
    }
}