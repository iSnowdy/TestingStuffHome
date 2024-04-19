package Randomizers;

import java.util.Random;

public class Randomizer02 {
    public static void main (String[] args) {
        String possibleArrows = "←↑→↓←↑→↓←↑→↓←↑→↓←↑→↓←↑→↓←↑→↓←↑→↓←↑→↓←↑→↓←↑→↓←↑→↓←↑→↓←↑→↓←↑→↓←↑→↓";
        int targetLength = 20;
        Random randomString = new Random();
        StringBuilder bufferString = new StringBuilder(targetLength);
        for (int i = 0; i < targetLength; i ++) {
            int index = (int) (targetLength * Math.random());
            bufferString.append(possibleArrows.charAt(index) + " ");
        }

        String generatedString = bufferString.toString();
        System.out.println(generatedString);
        System.out.println(generatedString.length());
    }
}
