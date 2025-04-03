package school.sorokin.javacore.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicsHomework {
    public static void main(String[] args) throws IOException {
        String[] names = new String[100];
        String[] phoneNumbers = new String[100];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        contextMenu();

        int contactCount = 0;
        int inputNumber;

        while ((inputNumber = Integer.parseInt(reader.readLine())) != 5) {
            if (inputNumber < 1 || inputNumber > 5) {
                System.out.println("Пожалуйста, введите число от 1 до 5!");
                contextMenu();
            }
            switch (inputNumber) {
                case 1:
                    if (emptySpaceChecker(names)) {
                        System.out.println("Введите имя: ");
                        names[contactCount] = reader.readLine();
                        System.out.println("Введите номер телефона: ");
                        phoneNumbers[contactCount] = reader.readLine();
                        contactCount++;
                        contextMenu();
                    } else {
                        System.out.println("Места в записной книге нет.");}
                    break;
                case 2:
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null) {
                            String result = i + 1 + ". " + names[i] + " - " + phoneNumbers[i];
                            System.out.println(result);
                        }
                    }
                    System.out.println(" ");
                    contextMenu();
                    break;
                case 3:
                    System.out.println("Введите имя контакта: ");
                    String nameToSearch = reader.readLine();
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null && !names[i].equals(nameToSearch)) {
                            continue;
                        } else if (names[i] != null && names[i].equals(nameToSearch)) {
                            System.out.println("Номер телефона контакта: " + phoneNumbers[i]);
                        } else {
                            System.out.println("Такого контакта не существует.");
                        }
                        contextMenu();
                        break;
                    }
                    break;
                case 4:
                    System.out.println("Введите имя контакта: ");
                    String nameToDelete = reader.readLine();

                    int indexToDelete = -1;

                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null && names[i].equals(nameToDelete)) {
                            indexToDelete = i;
                            break;
                        }
                    }

                    if (indexToDelete != -1) {
                        for (int i = indexToDelete; i < names.length - 1; i++) {
                            names[i] = names[i + 1];
                            phoneNumbers[i] = phoneNumbers[i + 1];
                        }

                        names[names.length - 1] = null;
                        phoneNumbers[phoneNumbers.length - 1] = null;
                        contactCount--;
                        System.out.println(" ");
                        System.out.println("Контакт удален!");
                        contextMenu();
                    }
                break;
            }
        }

    }

    private static boolean emptySpaceChecker(String[] input) {
        for (String item : input) {
            if (item == null) {
                return true;
            }
        }
        return false;
    }

    private static void contextMenu() {
        System.out.println("1. Добавить контакт");
        System.out.println("2. Просмотреть контакты");
        System.out.println("3. Найти контакт");
        System.out.println("4. Удалить контакт");
        System.out.println("5. Выйти");
        System.out.println(" ");
        System.out.println("Выберите операцию: ");
        System.out.println(" ");
    }
}
