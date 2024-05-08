package Randomizers;

import java.util.Random;

public class Randomizer05 {
    public static void main(String[] args) {
        String rank = "clown";
        String arrowCombination = "↑→↓←";
        StringBuilder randomizedArrows = new StringBuilder();
        int maxInputs;

        switch (rank.toUpperCase()) {
            case "CLOWN":
                maxInputs = 5;
                break;
            case "ALMOST_HUMAN":
                maxInputs = 7;
                break;
            case "EXPERT_FIGHTER":
                maxInputs = 10;
                break;
            case "SENSEI":
                maxInputs = 15;
                break;
            case "MAA":
                maxInputs = 20;
                break;
            default:
                System.out.println("Error. Giving default value");
                maxInputs = 10;
                break;
        }

        Random random = new Random();

        for (int i = 0; i < maxInputs; i++) {
            int index = random.nextInt(arrowCombination.length()); // Random index
            randomizedArrows.append(arrowCombination.charAt(index));
            if (i < maxInputs - 1) {  // Add space only if not the last element
                randomizedArrows.append(" ");
            }
        }

        System.out.println(randomizedArrows.toString());
        System.out.println(randomizedArrows.length()/2+1);
    }
}
