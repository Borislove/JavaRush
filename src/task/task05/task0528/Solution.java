package task.task05.task0528;

/*Вывести на экран текущую дату в аналогичном виде "21 02 2014".

Требования:
•	Дата должна содержать день, месяц и год, разделенные пробелом.
•	День должен соответствовать текущему.
•	Месяц должен соответствовать текущему.
•	Год должен соответствовать текущему.
•	Вся дата должна быть выведена в одной строке.*/

/*
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(dateFormat.format(new Date()));
    }
}

