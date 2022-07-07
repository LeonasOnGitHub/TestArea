package maps;

import java.util.HashMap;

public class MapsHash {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();


        map.put("Hund", 2);
        map.put("Katze", 2);
        System.out.println(map);

        System.out.println(map.containsKey("Hund"));
        System.out.println(map.containsValue(1));

        System.out.println(map.get("Hund"));

        System.out.println(map.values());

        map.replace("Hund", 4);
        System.out.println(map);

        System.out.println(map.size());


    }

}
