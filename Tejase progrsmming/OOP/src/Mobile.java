class Mobile {
    String model;
    String brand;
    String color;

    // Constructor to assign values
    Mobile(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    // Method to display mobile details
    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Color: " + color);
    }
}
