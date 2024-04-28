package OtherTests;

import java.util.HashMap;

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

    }
}
