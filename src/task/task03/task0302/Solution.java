package task.task03.task0302;

/*Добавь метод public static void printString(String s), в нем напиши код, который будет выводить переданную строку на экран.

Требования:
•	Добавь метод printString, у которого аргумент имеет тип String.
•	Метод printString должен быть void.
•	Метод printString должен быть static.
•	Метод printString должен быть public.
•	Метод printString должен выводить переданный текст на экран.
•	Программа должна вывести "Hello, Amigo!".*/

/*
Немедленно в печать
*/
public class Solution {
    public static void printString(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        printString("Hello, Amigo!");
    }
}


