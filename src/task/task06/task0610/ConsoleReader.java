package task.task06.task0610;

/*Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false"
и возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли
(BufferedReader или Scanner) внутри каждого метода.

Требования:
•	Метод readString должен считывать и возвращать строку(тип String).
•	Метод readInt должен считывать и возвращать число(тип int).
•	Метод readDouble должен считывать и возвращать дробное число(тип double).
•	Метод readBoolean должен считывать и возвращать логическую переменную(тип boolean).*/

/*
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {


    public static String readString() throws Exception {
        //напишите тут ваш код
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(reader.readLine());
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        return Boolean.parseBoolean(reader.readLine());
    }

    public static void main(String[] args) throws Exception {

    }
}
