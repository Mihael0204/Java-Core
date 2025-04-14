package school.sorokin.javacore.oop.InheritanceLesson;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void calculateArea() {
        System.out.println(27);
    }
}
