package task.task06.task0621;


/*Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей

Требования:
•	Программа должна считывать имена 6 котов в указанном порядке.
•	Метод main должен создавать 6 объектов типа Cat.
•	Программа должна выводить 6 строк с информацией о котах.
•	Строка про дедушку (первая) должна соответствовать условию.
•	Строка про бабушку (вторая) должна соответствовать условию.
•	Строка про папу (третья) должна соответствовать условию.
•	Строка про маму (четвертая) должна соответствовать условию.
•	Строка про сына (пятая) должна соответствовать условию.
•	Строка про дочь (шестая) должна соответствовать условию.*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String granddadName = reader.readLine(); //дедушка
        Cat catGranddad = new Cat(granddadName);

        String grannyName = reader.readLine();  //бабушка
        Cat catGranny = new Cat(granddadName);

        String fatherName = reader.readLine();  //папа
        Cat catFather = new Cat(fatherName, catGranddad, catGranny);


        String motherName = reader.readLine();  //мама
        Cat catMother = new Cat(motherName);

        String sonName = reader.readLine();  //сын
        Cat catSon = new Cat(sonName);

        String daughterName = reader.readLine();  //дочь
        Cat catDaughter = new Cat(daughterName, catMother,catFather);

        System.out.println(catMother);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent1;  //родитель
        private Cat parent2;  //родитель

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if (parent1 == null)
                return "The cat's name is " + name + ", no mother " + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + parent1.name;
        }
    }
}

