package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File04 {
    boolean exit = true;
    int choice;
    String plainFilePath = "Instructions.txt";
    Scanner scanner = new Scanner(System.in);
    public File04 () {
        printMainMenu();
        showInstructions();
    }

    private void printMainMenu() {
        System.out.println("=================================================");
        System.out.println("|        Welcome, " + "David" + ", to the Main Menu      |"); // Somehow need to be changed so it shows the CURRENT user
        System.out.println("=================================================");
        System.out.println("|        1. This... is... Spa- I mean Fight!    |");
        System.out.println("|        2. Level Up                            |");
        System.out.println("|        3. Show Stats                          |");
        System.out.println("|        4. Show Log                            |");
        System.out.println("|        5. Instructions                        |");
        System.out.println("|        6. Exit                                |");
        System.out.println("=================================================");
    }

    private void showInstructions() {
        while (exit) {
            System.out.println("Select the Instructions that you would like to read: ");
            System.out.println( "1. Opponent Type\n" +
                    "2. Stats Explanation\n" +
                    "3. Tournament Format Explanation\n" +
                    "4. MiniGames\n" +
                    "5. Exit\n");

            try {
                choice = scanner.nextInt();

                while (!(1 <= choice && choice <= 5)) {
                    System.out.println("Type a number between 1 - 5");
                    choice = scanner.nextInt();
                }
            } catch (Exception exception02) {
                System.out.println("Wrong input type. Please type a number between 1 - 5");
                scanner.next();
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.println("------------------------------------------------------------------------------------");

                    int endLine = 15; // Modify if anything is added to the instructions.txt

                    try {
                        FileReader fileReader = new FileReader(this.plainFilePath);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line;
                        int lineNumber = 0;

                        while ((line = bufferedReader.readLine()) != null && lineNumber < endLine) {
                            System.out.println(line);
                            lineNumber ++;
                        }
                        bufferedReader.close();
                        fileReader.close();
                    } catch (IOException exception03) {
                        System.err.println("Error while reading the file. Details: " + exception03.getMessage());
                        System.out.println("Information: \n");
                        exception03.printStackTrace();
                    }
                    System.out.println("------------------------------------------------------------------------------------");

                    this.printMainMenu();
                }
                case 2 -> {
                    System.out.println("------------------------------------------------------------------------------------");

                    int startLine = 20; // Modify if anything is added to the instructions.txt
                    int endLine = 42;

                    try {
                        FileReader fileReader = new FileReader(this.plainFilePath);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line;
                        int lineNumber = 0;

                        while ((line = bufferedReader.readLine()) != null && lineNumber < startLine) {
                            lineNumber ++;
                        }
                        while ((line = bufferedReader.readLine()) != null && lineNumber < endLine) {
                            lineNumber ++;
                            System.out.println(line);
                        }
                        bufferedReader.close();
                    } catch (IOException exception04) {
                        System.err.println("Error while reading the file. Details: " + exception04.getMessage());
                        System.out.println("Information: \n");
                        exception04.printStackTrace();
                    }
                    System.out.println("------------------------------------------------------------------------------------");
                    this.printMainMenu();
                }
                case 3 -> {
                    System.out.println("------------------------------------------------------------------------------------");

                    int startLine = 47; // Modify if anything is added to the instructions.txt
                    int endLine = 71;

                    try {
                        FileReader fileReader = new FileReader(this.plainFilePath);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line;
                        int lineNumber = 0;

                        while ((line = bufferedReader.readLine()) != null && lineNumber < startLine) {
                            lineNumber ++;
                        }
                        while ((line = bufferedReader.readLine()) != null && lineNumber < endLine) {
                            lineNumber ++;
                            System.out.println(line);
                        }
                        bufferedReader.close();
                    } catch (IOException exception05) {
                        System.err.println("Error while reading the file. Details: " + exception05.getMessage());
                        System.out.println("Information: \n");
                        exception05.printStackTrace();
                    }
                    System.out.println("------------------------------------------------------------------------------------");
                    scanner.close();
                    this.printMainMenu();
                }
                case 4 -> {
                    System.out.println("------------------------------------------------------------------------------------");

                    int startLine = 101; // Modify if anything is added to the instructions.txt
                    int endLine = 100;

                    try {
                        FileReader fileReader = new FileReader(this.plainFilePath);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line;
                        int lineNumber = 0;

                        while ((line = bufferedReader.readLine()) != null && lineNumber < startLine) {
                            lineNumber ++;
                        }
                        while ((line = bufferedReader.readLine()) != null && lineNumber < endLine) {
                            lineNumber ++;
                            System.out.println(line);
                        }
                        bufferedReader.close();
                    } catch (IOException exception06) {
                        System.err.println("Error while reading the file. Details: " + exception06.getMessage());
                        System.out.println("Information: \n");
                        exception06.printStackTrace();
                    }
                    System.out.println("------------------------------------------------------------------------------------");

                    this.printMainMenu();
                }
                case 5 -> {
                    System.out.println("Going back to the Main Menu");
                    scanner.close();
                    printMainMenu();
                    exit = false;
                }
            }
        }
    }

    public static void main (String[] args) {
        new File04();
    }
}
