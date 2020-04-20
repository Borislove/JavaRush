package task.task05.task0504;
/*Пару задач назад студенты секретного центра JavaRush создавали класс Cat.
 Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat,
  а точнее - основываясь на нём, как на шаблоне. Их - котов - должно быть трое.
   Наполните этих троих жизнью, то есть, конкретными данными.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Нужно создать три объекта типа Cat.
•	Класс Cat нельзя изменять.
•	Программа не должна выводить данные на экран.*/

/*
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        new Cat("Vasyka", 15,1000,50);
        new Cat("Vasyka1", 15,1000,50);
        new Cat("Vasyka2", 15,1000,50);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}