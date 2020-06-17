package level07;

//Заполнение массива из 10 чисел, числами от 0 до 9:
public class Example3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
    }
}

