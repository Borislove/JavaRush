package task.task05.task0532;

/*Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.

Требования:
•	Программа должна считывать числа с клавиатуры.
•	Программа должна выводить число на экран.
•	В классе должен быть метод public static void main.
•	Нельзя добавлять новые методы в класс Solution.
•	Программа должна выводить на экран максимальное из введенных N чисел.
•	Программа не должна ничего выводить на экран, если N меньше либо равно 0.*/
/*
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        int count = 0;
        //напишите тут ваш код

        while (true) {

            int n = Integer.parseInt(reader.readLine());
            count++;
            System.out.println("счетчик " + count);
            // System.out.println(maximum);
        }
    }
}
