package OtherTests;

public class StaticTesting {
    public class ClassA {
        private static int vitality = 1;
        private static int strength = 1;
        private static int dexterity = 1;
        protected int availableStatPoints;
        protected int totalStatPoints;

        // Getters and Setters
        public static int getVitality() {
            return vitality;
        }

        public static void setVitality(int vitality) {
            ClassA.vitality = vitality;
        }

        public static int getStrength() {
            return strength;
        }

        public static void setStrength(int strength) {
            ClassA.strength = strength;
        }

        public static int getDexterity() {
            return dexterity;
        }

        public static void setDexterity(int dexterity) {
            ClassA.dexterity = dexterity;
        }
    }

    public class ClassB extends ClassA {
        public void modifyStats(int vit, int stre, int dext, int availP, int totalP) {
            setVitality(vit);
            setStrength(stre);
            setDexterity(dext);
        }
    }

    public static void main(String[] args) {
        System.out.println("Vitality: " + ClassA.getVitality());
        System.out.println("Strength: " + ClassA.getStrength());
        System.out.println("Dexterity: " + ClassA.getDexterity());
        System.out.println("After changes...");

        StaticTesting staticTesting = new StaticTesting();
        ClassB classB = staticTesting.new ClassB();
        classB.modifyStats(10, 10, 10, 2, 3);


        System.out.println("Vitality: " + ClassA.getVitality());
        System.out.println("Strength: " + ClassA.getStrength());
        System.out.println("Dexterity: " + ClassA.getDexterity());
    }
}
