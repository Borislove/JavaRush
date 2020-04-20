package task.task04.task0442;

/*Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
•	Программа должна посчитать сумму введенных чисел и вывести её на экран.
•	В программе должен использоваться цикл for, while или do-while.*/

/*
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        while (true) {
            int inputNumber = Integer.parseInt(reader.readLine());
            if (inputNumber != -1) {
                count += inputNumber;
                //  System.out.println(count);
            }
            if (inputNumber == -1) {
                count--;
                break;
            }
        }
        System.out.println(count);
    }
}
