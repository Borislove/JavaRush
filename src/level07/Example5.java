package level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Ввод 10 строк с клавиатуры
public class Example5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = reader.readLine();
        }
        System.out.println(Arrays.toString(list));
    }
}
