package school.sorokin.javacore.basics;

public class OperatorsLesson {
    public static void main(String[] args) {
        int mathGrade = 2;
        int englishGrade = 10;
        int biologyGrade = 10;

        if ((mathGrade < 0 || mathGrade > 10)
        || (englishGrade < 0 || englishGrade > 10)
        || (biologyGrade < 0 || biologyGrade > 10)) {
            throw new RuntimeException("Ошибка: некорректная оценка!");
        }

        double averageGrade = (mathGrade + englishGrade + biologyGrade) / 3.0;
        System.out.println("Средняя оценка: " + String.format("%.2f", averageGrade));

        if (mathGrade == 10 && englishGrade == 10 && biologyGrade == 10) {
            System.out.println("У студента все оценки максимальные!");
        }

        if (mathGrade <= 2 || englishGrade <= 2 || biologyGrade <= 2) {
            System.out.println("Встречается очень низкая оценка!");
        }

        if (averageGrade >= 5.0) {
            System.out.println("У студента удовлетворительная успеваемость");
        } else {
            System.out.println( "У студента неудовлетворительная успеваемость");
        }
    }
}
