package school.sorokin.javacore.oop;

public class ClassesLesson {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Война и мир";
        book.author = "Лев Толстой";
        book.pages = 700;
        book.read();
    }
}

class Book {
    String title;
    String author;
    int pages;

    public void read() {
        System.out.println("Вы читаете книгу '" + title + "' авторства " + author + ".");
    }
}