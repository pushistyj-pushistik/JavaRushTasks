package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        Human firstChild = new Human("Игорь", true, 14);
        Human secondChild = new Human("Мария", false, 10);
        Human thirdChild = new Human("Юлия", false, 8);


        Human mother = new Human("Рита", false, 40, firstChild, secondChild, thirdChild);
        Human dad = new Human("Кирилл", true, 43, firstChild, secondChild, thirdChild);

        Human paternalGrandfather = new Human("Алексей", true,65, dad);
        Human paternalGrandmother = new Human("Ирина", false,64, dad);

        Human maternalGrandfather = new Human("Дмитрий", true,62, mother);
        Human maternalGrandmother = new Human("Валентина", false,63, mother);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            System.out.println(this.toString());
        }

        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children, children);
            System.out.println(this.toString());

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
