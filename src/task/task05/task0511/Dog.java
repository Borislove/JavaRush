package task.task05.task0511;

/*Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Dog должна быть переменная name с типом String.
•	У класса Dog должна быть переменная height с типом int.
•	У класса Dog должна быть переменная color с типом String.
•	У класса должен быть метод initialize, принимающий в качестве параметра имя
 и инициализирующий соответствующую переменную класса.
•	У класса должен быть метод initialize, принимающий в качестве параметров имя,
 рост и инициализирующий соответствующие переменные класса.
•	У класса должен быть метод initialize, принимающий в качестве параметров имя,
 рост, цвет и инициализирующий соответствующие переменные класса.*/

/*
Создать класс Dog
*/

public class Dog {
    //напишите тут ваш код
    String name;
    int height;
    String color;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
