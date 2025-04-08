package school.sorokin.javacore.oop;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        double number = 10.0;
        boolean bool = true;
        System.out.println(num);
        System.out.println(number);
        System.out.println(bool);

        Car car = new Car("Mazerati", 2020);
        System.out.println(car);
        car = null;
        System.gc();
    }
}

class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    @Override
    protected void finalize() {
        System.out.println("The End");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}
