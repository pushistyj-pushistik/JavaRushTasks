package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
       Map<String, String> map = new HashMap<>();
        map.put("Смирнов", "Алексей");
        map.put("Петров", "Дмитрий");
        map.put("Попов", "Михаил");
        map.put("Круглов", "Алекс");
        map.put("Смирнов", "Алексей");
        map.put("Цветкова", "Юлия");
        map.put("Цветкова", "Мария");
        map.put("Васильев", "Павел");
        map.put("Ульянов", "Павел");
        map.put("Виноградов", "Алексей");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
