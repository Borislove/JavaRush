package task.task05.task0526;

/*1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address

Требования:
•	В классе Solution создай public static класс Man.
•	В классе Solution создай public static класс Woman.
•	Класс Man должен содержать переменные: name(String), age(int) и address(String).
•	Класс Woman должен содержать переменные: name(String), age(int) и address(String).
•	У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
•	Конструкторы должны инициализировать переменные класса.
•	В методе main необходимо создать по два объекта каждого типа.
•	Метод main должен выводить созданные объекты на экран в указанном формате.*/


/*
Мужчина и женщина
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Vasya", 21,"nyama");
        System.out.println(man1);
        Man man2 = new Man("Vasya2", 22,"nyama");
        System.out.println(man2);

        Woman woman1 = new Woman("Lusya", 25, "f");
        System.out.println(woman1);
        Woman woman2 = new Woman("Lusya", 25, "f");
        System.out.println(woman2);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
