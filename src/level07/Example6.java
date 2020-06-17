package level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ввод 10 чисел с клавиатуры
public class Example6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
    }
}
