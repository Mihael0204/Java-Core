package school.sorokin.javacore.basics;

import java.util.Scanner;

public class IfElseLesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 5: ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > 5) {
            System.out.println("Такого жанра не знаю.");
        } else {
            switch (choice) {
                case 1:
                    System.out.println("Посмотрите Третий лишний или Мальчишник в Вегасе");
                    break;
                case 2:
                    System.out.println("Посмотрите Зеленую милю.");
                    break;
                case 3:
                    System.out.println("Посмотрите Назад в будущее или Интерстеллар.");
                    break;
                case 4:
                    System.out.println("Посмотрите Крепкий орешек или Миссия невыполнима.");
                    break;
                case 5:
                    System.out.println("Посмотрите Поднятие уровня в одиночку или Твое имя");
                    break;
                default:
                    System.out.println("Такого жанра не знаю");
            }
        }
    }
}
