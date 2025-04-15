package school.sorokin.javacore.oop.ObjectLesson;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Game of Thrones", "George Martin");
        Book book2 = new Book("Game of Thrones", "George Martin");

        System.out.println(book1.equals(book2));
        System.out.println(book1);
        System.out.println(book2);
    }
}
