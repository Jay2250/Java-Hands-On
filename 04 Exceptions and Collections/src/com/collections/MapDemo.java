package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------");
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1000);
        map.put("two", 2000);
        map.put("three", 3000);
        map.put("four", 4000);
        map.put("five", 5000);

        System.out.println(map.get("two"));

        Set<String> keyset = map.keySet();

        for (String key : keyset) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println("--------------------------------------------------------------");

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("--------------------------------------------------------------");
        map.remove("three");
        keyset = map.keySet();
        for (String key : keyset) {
            System.out.println(key + " -> " + map.get(key));
        }

    }
}
