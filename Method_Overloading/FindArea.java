class FindArea {
    double area(double side) {
        return side * side;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(int radius) {
        return 3.14159 * radius * radius;
    }

    public static void main(String args[]){
        FindArea obj = new FindArea();
        System.out.println("Square: " + obj.area(5.0));
        System.out.println("Rectangle: " + obj.area(5.0, 10.0));
        System.out.println("Circle: " + obj.area(7));
    }
}