package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        this.age = 12;
        this.weight = 3;
        this.address = null;
        this.color = "red";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = null;
        this.color = "white";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.address = null;
        this.color = "black";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 4;
        this.name = null;
        this.address = null;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 1;
        this.name = null;
    }

    public static void main(String[] args) {

    }
}
