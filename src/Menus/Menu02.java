package Menus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Menu02 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        boolean exit = true;

        while (exit) {
            System.out.println("=====================================");
            System.out.println("|         Choose your opponent     |");
            System.out.println("=====================================");
            System.out.println("|           1. A fellow human      |");
            System.out.println("|           2. Java Console        |");
            System.out.println("|           3. Explanation         |");
            System.out.println("=====================================");

            try {
                choice = sc.nextInt();

                while (!(1 <= choice && choice <= 3)) {
                    System.out.println("Come on man. Type something between 1 - 3 for a proper option.");
                    choice = sc.nextInt();
                }
            } catch (Exception exception00) {
                System.out.println("Wrong input type. Please type in a number between 1 - 3");
                sc.next(); // To clear the wrong input
                continue;
                // We skip the remaining code so we can once again ask for an input by going back to the try block
            }

            switch (choice) {
                case 1 -> {
                    System.out.println("Method call goes here");
                    exit = false;
                }
                case 2 -> {
                    System.out.println("Another method call goes here");
                    exit = false;
                }
                case 3 -> {
                    System.out.println("------------------------------------------------------------------------------------");
                    // int startLine = 0; No need for this here cuz it is the start of the document
                    int endLine = 15;

                    try {
                        FileReader fileReader = new FileReader("Instructions.txt");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line;
                        int lineNumber = 0;

                        while ((line = bufferedReader.readLine()) != null && lineNumber < endLine) {
                            System.out.println(line);
                            lineNumber ++;
                        }
                        bufferedReader.close();
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                    System.out.println("------------------------------------------------------------------------------------");
                }
            }
        }

        // We are going to use FileReader to print the explanation from the Instructions.txt
        // since it has more things besides this

    }
}
