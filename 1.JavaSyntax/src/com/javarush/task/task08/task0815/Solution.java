package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванова", "Дарья");
        map.put("Петрова", "Юлия");
        map.put("Петров", "Иван");
        map.put("Стрелец", "Дарья");
        map.put("Миронов", "Людмила");
        map.put("Лысь", "Дарья");
        map.put("Смирный", "Иван");
        map.put("Мирная", "Анастасия");
        map.put("Смирнов", "Петр");
        map.put("Лесная", "Виктория");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String value : map.values()) {
            if (value.equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (String key : map.keySet()) {
            if (key.equals(lastName)) count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
