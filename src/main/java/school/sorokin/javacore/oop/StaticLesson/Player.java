package school.sorokin.javacore.oop.StaticLesson;

public class Player {
    private String name;
    private int personalScore;

    public Player(String name, int personalScore) {
        this.name = name;
        this.personalScore = personalScore;
        GameScore.addPoints(personalScore);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", personalScore=" + personalScore +
                '}';
    }
}
