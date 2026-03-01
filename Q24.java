class Employee24 {
    // Instance Variables
    String Emp_name;
    int Age;
    double salary;

    // Constructor
    Employee24(String Emp_name, int Age, double salary) {
        this.Emp_name = Emp_name;
        this.Age = Age;
        this.salary = salary;
    }

    // Method 1: Display Information
    void DisplayInformation() {
        System.out.println("===== Employee Information =====");
        System.out.println("Name   : " + Emp_name);
        System.out.println("Age    : " + Age);
        System.out.println("Salary : " + salary);
    }

    // Method 2: Calculate Tax
    void calculateTax() {
        double tax = 0;
        double taxRate = 0;

        if (salary <= 20000) {
            taxRate = 0.1;   // 0.1%
        } else if (salary <= 50000) {
            taxRate = 0.2;   // 0.2%
        } else {
            taxRate = 0.3;   // 0.3%
        }

        tax = salary * (taxRate / 100);

        System.out.println("Tax Rate   : " + taxRate + "%");
        System.out.println("Tax Amount : " + tax);
    }

    // Main Method
    public static void main(String[] args) {

        // Test 1 - salary <= 20000
        Employee24 e1 = new Employee24("Raj", 25, 15000);
        e1.DisplayInformation();
        e1.calculateTax();

        System.out.println();

        // Test 2 - salary <= 50000
        Employee24 e2 = new Employee24("Priya", 30, 35000);
        e2.DisplayInformation();
        e2.calculateTax();

        System.out.println();

        // Test 3 - salary > 50000
        Employee24 e3 = new Employee24("Amit", 40, 70000);
        e3.DisplayInformation();
        e3.calculateTax();
    }
}
