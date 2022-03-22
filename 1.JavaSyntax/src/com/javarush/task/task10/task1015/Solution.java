package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] my_array = new ArrayList[2];

        my_array[0] = new ArrayList<>();
        my_array[1] = new ArrayList<>();

        my_array[0].add("Mama");
        my_array[0].add("Mila");
        my_array[0].add("Mila2");
        my_array[1].add("Mila1");
        return my_array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}