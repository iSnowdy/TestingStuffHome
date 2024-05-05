package Randomizers;

import java.util.Random;

public class Randomizer03 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] options = {"rock", "paper", "scissors"};
        int randomIndex = random.nextInt(options.length);
        System.out.println(options[randomIndex]);

        int a = 5;
        int b = 10;
        int c = a - b;
        System.out.println(c);
    }
}
