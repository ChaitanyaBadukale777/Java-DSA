class Car {
    String brand;
    int year;

    Car(String b, int y) {
        brand = b;
        year = y;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class MainTwo {
    public static void main(String [] args) {
        Car c1 = new Car("Tesla", 2025);
        c1.display();
    }
}