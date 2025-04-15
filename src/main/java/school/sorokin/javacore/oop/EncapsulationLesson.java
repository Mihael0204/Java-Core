package school.sorokin.javacore.oop;

public class EncapsulationLesson {
    public static void main(String[] args) {
        NewCar newCar = new NewCar();
        newCar.setBrand("Tesla");
        newCar.setModel("Model S");
        newCar.setYear(2025);
        System.out.println(newCar.getBrand());
        System.out.println(newCar.getModel());
        System.out.println(newCar.getYear());
    }
}

class NewCar {
    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1886 || year > 2025) {
            throw new RuntimeException("Invalid year");
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return "NewCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
