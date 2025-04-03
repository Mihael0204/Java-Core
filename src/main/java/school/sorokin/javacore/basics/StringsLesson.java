package school.sorokin.javacore.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringsLesson {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку: ");
        String text = reader.readLine();

        System.out.println("Длина строки - " + text.length());
        System.out.println("Строка в верхнем регистре: " + text.toUpperCase());
        if (text.contains("Java")) {
            System.out.println(text.indexOf("Java"));
        } else {
            System.out.println("Такого слова не найдено!");
        }
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
