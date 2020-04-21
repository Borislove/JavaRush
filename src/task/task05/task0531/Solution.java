package task.task05.task0531;

/*Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.

Требования:
•	Программа должна считывать числа с клавиатуры.
•	В классе должен быть метод public static void main.
•	В классе должен быть метод public static min, принимающий 5 параметров типа int.
•	Метод min должен возвращать минимум из 5 переданных чисел. Если минимальных чисел несколько - вернуть любое из них.
•	Программа должна выводить строку, которая начинается на "Minimum = ".
•	Программа должна выводить строку, которая заканчивается минимальным из 5 введенных чисел.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int min2 = Math.min(Math.min(a, b), Math.min(c, d));
        int minimum = Math.min(min2, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        //return a < b ? a : b;
        int min2 = Math.min(Math.min(a, b), Math.min(c, d));
        int minimum = Math.min(min2, e);
        return minimum;
    }
}
