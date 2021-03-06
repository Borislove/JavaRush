package task.task04.task0414;

/*Подсказка:
В високосном году - 366 дней, тогда как в обычном - 365.
1) если год делится без остатка на 400 это високосный год;
2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
4) все оставшиеся года невисокосные.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 - не високосные.

Требования:
•	Программа должна считывать число c клавиатуры.
•	Программа должна выводить текст на экран, согласно условию.
•	Если введенный год является високосным, необходимо вывести текст: "количество дней в году: 366".
•	Если введенный год не является високосным, необходимо вывести текст: "количество дней в году: 365".*/

/*
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Количество дней в году
*/
public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String year = reader.readLine();
        int n = Integer.parseInt(year);
//        System.out.println("количество дней в году: " + year);
        //System.out.println (year);

        if (((n % 4 == 0) && !(n % 100 == 0)) || (n % 400 == 0))
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");
    }
}

