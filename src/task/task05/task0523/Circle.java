package task.task05.task0523;

/*Разберись, что делает программа.
Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.

Подсказка:
изучи конструктор по умолчанию.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод main изменять нельзя.
•	Программа должна вывести слово "Red" на экран.
•	Метод getDescription класса Color должен возвращать значение переменной description.
•	Метод setDescription класса Color должен устанавливать значение переменной description.*/


/*
Конструктор
*/

public class Circle {

    public Color color;
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public  Circle() {   //void!
       this.color = new Color();
    }

    class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
