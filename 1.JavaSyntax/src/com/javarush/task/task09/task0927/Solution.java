package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> cats = new HashMap<>();
        cats.put("Вася", new Cat("Вася"));
        cats.put("Борис", new Cat("Борис"));
        cats.put("Мася", new Cat("Мася"));
        cats.put("Буся", new Cat("Буся"));
        cats.put("Люся", new Cat("Люся"));
        cats.put("Дуся", new Cat("Дуся"));
        cats.put("Леня", new Cat("Леня"));
        cats.put("Миса", new Cat("Миса"));
        cats.put("Яща", new Cat("Яща"));
        cats.put("Куся", new Cat("Куся"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> catSet = new HashSet<>(map.values());

        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
