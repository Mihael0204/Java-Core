package school.sorokin.javacore.oop.InheritanceLesson;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    public void calculateArea() {
        System.out.println(25);
    }
}
