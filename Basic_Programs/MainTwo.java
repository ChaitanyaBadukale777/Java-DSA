class Car1 {
    String brand;
    int year;

    Car1(String b, int y) {
        brand = b;
        year = y;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class MainTwo {
    public static void main(String [] args) {
        Car1 c1 = new Car1("Tesla", 2025);
        c1.display();
    }
}