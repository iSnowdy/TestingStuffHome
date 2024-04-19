package Randomizers;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;

public class Randomizer01 {
    public static void main (String[] args) {
        int leftLimit = 37; // a
        int rightLimit = 40; // z
        int targetLength = 10;

        Random randomString = new Random();
        StringBuilder bufferString = new StringBuilder(targetLength);
        for (int i = 0; i < targetLength; i ++) {
            int randomLimitedInt = (int) (leftLimit + (randomString.nextFloat() * (rightLimit - leftLimit - 1)));
            bufferString.append((char) randomLimitedInt); // ASCII
        }
        String generatedString = bufferString.toString();
        System.out.println(generatedString);


    }
}
