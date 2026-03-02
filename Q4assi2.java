// Abstract Class
abstract class Employee {
    String empName;
    double basicSalary;

    // Abstract Method
    abstract void calculateSalary();
}

// Full Time Employee Class
class FullTimeEmployee extends Employee {
    double bonus;

    @Override
    void calculateSalary() {
        if (basicSalary >= 30000) {
            bonus = 5000;
        } else {
            bonus = 2000;
        }

        double totalSalary = basicSalary + bonus;

        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}

// Part Time Employee Class
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    @Override
    void calculateSalary() {
        double salary = hoursWorked * hourlyRate;

        System.out.println("Employee Name: " + empName);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + salary);
    }
}

// Main Class
public class EmployeeSalarySystem {
    public static void main(String[] args) {

        // Full Time Employee Object
        FullTimeEmployee ft = new FullTimeEmployee();
        ft.empName = "Rahul";
        ft.basicSalary = 35000;
        System.out.println("----- Full Time Employee -----");
        ft.calculateSalary();

        System.out.println();

        // Part Time Employee Object
        PartTimeEmployee pt = new PartTimeEmployee();
        pt.empName = "Amit";
        pt.hoursWorked = 40;
        pt.hourlyRate = 500;
        System.out.println("----- Part Time Employee -----");
        pt.calculateSalary();
    }
}
