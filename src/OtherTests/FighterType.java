package OtherTests;

public class FighterType {
    public static String setFighterType(String fighterName) { // Take as a parameter if it is the first or second user?
        int vitality = 2;
        int strength = 4;
        int dexterity = 7;
        String fighterType;

        String stats =
                "Fighter " + fighterName + " stats are:\n" +
                        "Vitality: " + vitality + "\n" +
                        "Strength: " + strength + "\n" +
                        "Dexterity: " + dexterity + "\n";

        int totalPoints = vitality + strength + dexterity;
        double vitalityRatio = (double)vitality / totalPoints;
        double strengthRatio = (double)strength / totalPoints;
        double dexterityRatio = (double)dexterity / totalPoints;

        System.out.println(vitalityRatio);
        System.out.println(strengthRatio);
        System.out.println(dexterityRatio);

        if (vitalityRatio >= 0.6) {
            return fighterType = "Tank";
        } else if (strengthRatio >= 0.6) {
            return fighterType = "Glass Cannon";
        } else if (dexterityRatio >= 0.6) {
            return fighterType = "Agile";
        } else if (vitalityRatio >= 0.4) {
            return fighterType = "Vitality Oriented";
        } else if (strengthRatio >= 0.4) {
            return fighterType = "Strength Oriented";
        } else if (dexterityRatio >= 0.4) {
            return fighterType = "Dexterity Oriented";
        } else {
            return fighterType = "Balanced";
        }
    }

    public static void main (String[] args) {
        String type = setFighterType("Test");
        System.out.printf(type);
    }
}
