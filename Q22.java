class Shape {

    double area;

    // 1️⃣ Constructor for Circle (1 parameter)
    Shape(double radius) {
        area = Math.PI * radius * radius;
    }

    // 2️⃣ Constructor for Rectangle (2 parameters)
    Shape(double length, double width) {
        area = length * width;
    }

    // 3️⃣ Constructor for Triangle (3 parameters)
    Shape(double base, double height, int dummy) {
        area = 0.5 * base * height;
    }

    // Method to display area
    void displayArea() {
        System.out.println("Area: " + area);
        System.out.println("-----------------");
    }

    public static void main(String args[]) {

        // Circle object
        Shape circle = new Shape(5);
        circle.displayArea();

        // Rectangle object
        Shape rectangle = new Shape(4, 6);
        rectangle.displayArea();

        // Triangle object
        Shape triangle = new Shape(3, 8, 1);
        triangle.displayArea();
    }
}
