package task.task02.task0218;

/*Реализуй метод print3. Метод должен вывести на экран переданную строку 3 раза.
Каждый раз с новой строки.

Требования:
•	Программа должна выводить текст на экран.
•	Метод main не должен вызывать функцию System.out.println или System.out.print.
•	Метод print3 должен выводить текст на экран.
•	Метод main должен вызвать метод print3 только один раз.
*/

/*
Повторенье-мать
*/
public class Solution {

    public static void print3(String s) {
        //напишите тут ваш код
        for (int i = 0; i < 3; i++)
            System.out.println(s);

    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}
