package OtherTests;

import java.util.*;

public class HashMapTest {
    public static void main (String[] args) {
        HashMap hashMap = new HashMap<>();

        String user1 = "Hey";
        String user2 = "Me";
        String fighter1 = "John";
        String fighter2 = "Doe";

        hashMap.put(user1, fighter1);
        hashMap.put(user2, fighter2);

        int size = hashMap.size();

        for (Object username : hashMap.keySet()) {
            System.out.println("Username: " + username + " | Fighter: " + hashMap.get(username));
            break;
        }

        Map<String, Integer> rankingCorrelation = new LinkedHashMap<>();
        rankingCorrelation.put("Clown", 0);
        rankingCorrelation.put("Almost-a-Human", 20);
        rankingCorrelation.put("Expert Fighter", 40);
        rankingCorrelation.put("Sensei", 60);
        rankingCorrelation.put("Maa", 100);

        for (Map.Entry<String, Integer> entry : rankingCorrelation.entrySet()) {
            System.out.println("Rank: " + entry.getKey() + " needs: " + entry.getValue() +
                    " victory points to reach");
        }

        String fighterRank = "Clown";
        String fighterRankOpponent = "Clown";

        List<String> rankList = new ArrayList<>(rankingCorrelation.keySet());
        int fighter1Index = rankList.indexOf(fighterRank);
        int fighter2Index = rankList.indexOf(fighterRankOpponent);
        int difference = fighter2Index - fighter1Index;
        int points;
        int test = 1;
        System.out.println("---------");
        if (test <= 1) {
            points = - (10 + test * 10);
            System.out.println(points);
        } else {
            points = - (9999);
            System.out.println(points);
        }

        int rankPoints = 40;
        System.out.println(rankPoints+=points);




    }
}
