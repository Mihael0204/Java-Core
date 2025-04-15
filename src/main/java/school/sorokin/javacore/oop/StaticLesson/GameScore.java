package school.sorokin.javacore.oop.StaticLesson;

public class GameScore {
    private static int totalScore;

    public static void addPoints(int points) {
        totalScore += points;
    }

    public static int totalScore() {
        return totalScore;
    }
}
