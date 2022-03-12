package com.stanserw;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jamila"), new Diamond("African Diamond"));
        System.out.println(new Person("Jamila").hashCode());
        System.out.println(new Person("Jamila").hashCode());
        System.out.println(map.get(new Person("Jamila")));
    }

    private static void maps() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Alina"));
        map.put(3, new Person("Alina 2"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println();
        System.out.println(map.keySet());
        System.out.println();
        System.out.println(map.entrySet());
        map.remove(3);
        System.out.println();
        for (Map.Entry<Integer, Person> integerPersonEntry : map.entrySet()) {
            System.out.println(integerPersonEntry);
            System.out.println(integerPersonEntry.getValue());
        }
        System.out.println();
        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        System.out.println();
        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });
        System.out.println(map.get(3));
        System.out.println(map.getOrDefault(3, new Person("default")));
        System.out.println();
        System.out.println(map.values());
    }
}
