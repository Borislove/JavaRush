package task.task05.task0515;

/*Изучи внимательно класс Person.
Исправь класс так, чтобы только один метод initialize инициализировал все переменные класса Person.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Person должно быть 5 переменных.
•	У класса должен быть один метод initialize.
•	Метод initialize должен иметь пять параметров.*/

/*
Инициализация объектов
*/

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;
/*
    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }*/

    public void initialize(String name, int money, char sex, int weight,int size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
    }

    public static void main(String[] args) {

    }
}
