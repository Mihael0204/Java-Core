package school.sorokin.javacore.basics;

import java.util.Arrays;

public class ArraysLesson {
    public static void main(String[] args) {
        //First step
        int[] num = new int[10];
        for (int i = 0; i < num.length - 1; i++) {
            num[i] = (int) (Math.random() * 150);
        }
        //Second step
        System.out.println("Второй этап");
        for (int numbers: num) {
            System.out.println(numbers);
        }

        //Third step - numbers
        System.out.println("Третий этап");
        int min = num[0];
        int max = num[0];

        for (int i = 1; i < num.length - 1; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        //Third step - indexes
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == min) {
                System.out.println("Min index - " + i);
            }
            if (num[i] == max) {
                System.out.println("Max index - " + i);
            }
        }

        //Fourth step
        System.out.println("Четвертый этап");
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        for(int n: num) {
            System.out.println(n);
        }

        //Fifth step
        System.out.println("Пятый этап");
        int[][] array = new int[2][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
    }
}
