class Car {
    private int speed; // Private variable

    // Setter method (to set value safely)
    public void setSpeed(int s) {
        if (s >= 0 && s <= 200) // Validation
            speed = s;
        else
            System.out.println("Invalid speed. Please set a speed between 0 and 200.");
    }

    // Getter method (to read value)
    public int getSpeed() {
        return speed;
    }

    public static void main(String args[]) {
        Car c = new Car();
        c.setSpeed(150); // Valid speed
        System.out.println("Current speed: " + c.getSpeed()); // Getter
        c.setSpeed(250); // Invalid speed
    }
}

// Output : 
// Current speed: 150
// Invalid speed. Please set a speed between 0 and 200.
