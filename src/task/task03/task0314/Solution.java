package task.task03.task0314;

/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
...

Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 10 строк.
•	Каждая выведенная строка должна содержать 10 чисел, разделенных пробелом.
•	Выведенные числа должны быть таблицей умножения.*/

/* 
Таблица умножения
*/
// TODO: 04.04.2020 Вот это код! Божественно...сколько лет прошло* 
public class Solution {
    public static void main(String[] args) {

        int x1 = 1;
        int x2 = 2;
        int x3 = 3;
        int x4 = 4;
        int x5 = 5;
        int x6 = 6;
        int x7 = 7;
        int x8 = 8;
        int x9 = 9;
        int x10 = 10;

        System.out.println(x1 * x1 + " " + x1 * x2 + " " + x1 * x3 + " " + x1 * x4 + " " + x1 * x5 + " " + x1 * x6 + " " + x1 * x7 + " " + x1 * x8 + " " + x1 * x9 + " " + x1 * x10);              // 1*1
        System.out.println(x2 * x1 + " " + x2 * x2 + " " + x2 * x3 + " " + x2 * x4 + " " + x2 * x5 + " " + x2 * x6 + " " + x2 * x7 + " " + x2 * x8 + " " + x2 * x9 + " " + x2 * x10);   // 2*1
        System.out.println(x3 * x1 + " " + x3 * x2 + " " + x3 * x3 + " " + x3 * x4 + " " + x3 * x5 + " " + x3 * x6 + " " + x3 * x7 + " " + x3 * x8 + " " + x3 * x9 + " " + x3 * x10);   // 3*1
        System.out.println(x4 * x1 + " " + x4 * x2 + " " + x4 * x3 + " " + x4 * x4 + " " + x4 * x5 + " " + x4 * x6 + " " + x4 * x7 + " " + x4 * x8 + " " + x4 * x9 + " " + x4 * x10);   // 4*1
        System.out.println(x5 * x1 + " " + x5 * x2 + " " + x5 * x3 + " " + x5 * x4 + " " + x5 * x5 + " " + x5 * x6 + " " + x5 * x7 + " " + x5 * x8 + " " + x5 * x9 + " " + x5 * x10);   // 5*1
        System.out.println(x6 * x1 + " " + x6 * x2 + " " + x6 * x3 + " " + x6 * x4 + " " + x6 * x5 + " " + x6 * x6 + " " + x6 * x7 + " " + x6 * x8 + " " + x6 * x9 + " " + x6 * x10);   // 6*1
        System.out.println(x7 * x1 + " " + x7 * x2 + " " + x7 * x3 + " " + x7 * x4 + " " + x7 * x5 + " " + x7 * x6 + " " + x7 * x7 + " " + x7 * x8 + " " + x7 * x9 + " " + x7 * x10);   // 7*1
        System.out.println(x8 * x1 + " " + x8 * x2 + " " + x8 * x3 + " " + x8 * x4 + " " + x8 * x5 + " " + x8 * x6 + " " + x8 * x7 + " " + x8 * x8 + " " + x8 * x9 + " " + x8 * x10);   // 8*1
        System.out.println(x9 * x1 + " " + x9 * x2 + " " + x9 * x3 + " " + x9 * x4 + " " + x9 * x5 + " " + x9 * x6 + " " + x9 * x7 + " " + x9 * x8 + " " + x9 * x9 + " " + x9 * x10);   // 9*1
        System.out.println(x10 * x1 + " " + x10 * x2 + " " + x10 * x3 + " " + x10 * x4 + " " + x10 * x5 + " " + x10 * x6 + " " + x10 * x7 + " " + x10 * x8 + " " + x10 * x9 + " " + x10 * x10);   // 10*1

    }
}

