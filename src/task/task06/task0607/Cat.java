package task.task06.task0607;

/*Создать статическую переменную int catCount в классе Cat.
 Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.

Требования:
•	Добавь в класс Cat конструктор.
•	Конструктор должен быть public.
•	Добавь в класс Cat поле catCount.
•	Поле catCount должно быть типа int.
•	Поле catCount должно быть статическим.
•	Конструктор класса должен на 1 увеличивать значение переменной catCount.*/


/*
Классовый счетчик
*/

public class Cat {
    //напишите тут ваш код
    static int catCount = 0;


    public Cat() {
        catCount++;
    }

    public static void main(String[] args) {

    }
}