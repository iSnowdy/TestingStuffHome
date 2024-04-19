package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class File02 {
    public static void main (String[] args) {
        FileWriter file = null;
        PrintWriter printWriter = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            file = new FileWriter("filename.txt");
            // We can add ", true); at the end of FileWriter to append and not overwrite the information in the file everytime we run the code
            printWriter = new PrintWriter(file);

            for (int i = 0; i < 10; i ++) printWriter.println("Printed line nº " + i);

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (null != file) file.close();
            } catch (Exception exception2) {
                exception2.printStackTrace();
            }
        }

        // We read it once we've written it

        try {
            fileReader = new FileReader("filename.txt");
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) System.out.println(line);
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (null != fileReader) {
                    fileReader.close();
                }
            } catch (Exception exception2) {
                exception2.printStackTrace();
            }
        }
    }
}
