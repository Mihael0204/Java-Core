package school.sorokin.javacore.oop.StaticLesson;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Ronaldo", 30);
        Player player2 = new Player("Dreyk", 25);
        Player player3 = new Player("Unknown", 31);
        Player player4 = new Player("New Ronaldo", 2);

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);
        System.out.println("Total score - " + GameScore.totalScore());
    }
}
