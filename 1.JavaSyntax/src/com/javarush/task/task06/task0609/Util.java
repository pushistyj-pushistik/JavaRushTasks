package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

import static java.lang.Math.sqrt;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {

        double x = (x2 - x1);
        double y = (y2 - y1);
        double a = x * x + y * y;
        return Math.sqrt(a);

    }

    public static void main(String[] args) {

    }
}
