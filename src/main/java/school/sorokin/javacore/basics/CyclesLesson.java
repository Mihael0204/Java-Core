package school.sorokin.javacore.basics;

public class CyclesLesson {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        for (int j = 1; j <= 9; j++) {
            for (int k = 1; k <= 9; k++) {
                if (j * k > 30) {
                    break;
                }
                System.out.println(j + "*" + k + "=" + j * k);
            }
        }
    }
}
