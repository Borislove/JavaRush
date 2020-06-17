package task.task06.task0615;

/*Переставь один модификатор static, чтобы пример скомпилировался.

Требования:
•	Метод main менять нельзя.
•	Добавь модификатор static в нужное место.
•	Убери лишний модификатор static.
•	В программе должно быть только 2 модификатора static.*/

/*
Феншуй и статики
*/

public class Solution {

    public static int A = 5;
    public int B = 2;
    public int C = A * B;

    public static void main(String[] args) {
        A = 15;
    }
}

