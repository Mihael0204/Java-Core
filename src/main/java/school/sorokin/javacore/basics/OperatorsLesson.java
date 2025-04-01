package school.sorokin.javacore.basics;

public class OperatorsLesson {
    public static void main(String[] args) {
        int mathGrade = 2;
        int englishGrade = 10;
        int biologyGrade = 10;

        //Проверка на правильность внесенных данных
        if ((mathGrade < 0 || mathGrade > 10)
        || (englishGrade < 0 || englishGrade > 10)
        || (biologyGrade < 0 || biologyGrade > 10)) {
            throw new RuntimeException("Ошибка: некорректная оценка!");
        }

        //Расчет среднего балла
        double averageGrade = (mathGrade + englishGrade + biologyGrade) / 3.0;
        System.out.println("Средняя оценка: " + String.format("%.2f", averageGrade));

        //Проверка, все ли оценки максимальные
        if (mathGrade == 10 && englishGrade == 10 && biologyGrade == 10) {
            System.out.println("У студента все оценки максимальные!");
        }

        //Проверка на низкие оценки
        if (mathGrade <= 2 || englishGrade <= 2 || biologyGrade <= 2) {
            System.out.println("Встречается очень низкая оценка!");
        }

        //Проверка на удовлетворительную успеваемость
        if (averageGrade >= 5.0) {
            System.out.println("У студента удовлетворительная успеваемость");
        } else {
            System.out.println( "У студента неудовлетворительная успеваемость");
        }
    }
}
