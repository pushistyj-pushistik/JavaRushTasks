package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Смирнов", 300);
        map.put("Петров", 500);
        map.put("Сидоров", 1000);
        map.put("Веселов", 501);
        map.put("Домовой", 499);
        map.put("Попов", 1300);
        map.put("Иванов", 27);
        map.put("Лисицын", 888);
        map.put("Уткин", 777);
        map.put("Дедков", 444);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        removeItemFromMap(map);
        System.out.println(map);
    }
}