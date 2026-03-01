class Employee {

    // Instance variables
    int id;
    String name;
    double salary;
    String department;

    // Parameterized constructor
    Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Copy constructor
    Employee(Employee e) {
        this.id = e.id;
        this.name = e.name;
        this.salary = e.salary;
        this.department = e.department;
    }

    // Display method
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("---------------------");
    }

    public static void main(String args[]) {

        // Object using parameterized constructor
        Employee e1 = new Employee(101, "Rohit", 50000, "HR");

        // Object using copy constructor
        Employee e2 = new Employee(e1);

        // Modify copied object's department
        e2.department = "IT";

        // Display both objects
        System.out.println("Original Employee:");
        e1.display();

        System.out.println("Copied Employee (Modified):");
        e2.display();
    }
}
