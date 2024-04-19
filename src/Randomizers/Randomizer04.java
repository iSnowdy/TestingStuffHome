package Randomizers;

import java.util.Arrays;

public class Randomizer04 {
    public static void main (String[] args) {
        String[] possibleArrows = { "\u2190" , "\u2191", "\u2192", "\u2193"};

        System.out.println(Arrays.toString(possibleArrows));
        for (String arrow : possibleArrows) System.out.println(arrow);
    }
}
