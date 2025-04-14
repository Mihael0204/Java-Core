package school.sorokin.javacore.oop.InheritanceLesson;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    public void calculateArea() {
        System.out.println(22.5);
    }
}
