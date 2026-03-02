// Parent Class
class Student {
    String studentName;
    int rollNo;
    int marks;

    void showStudent() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

// Child Class (Single Inheritance)
class Result extends Student {
    String grade;

    void calculateGrade() {
        if (marks >= 75) {
            grade = "Distinction";
        } else if (marks >= 60) {
            grade = "First Class";
        } else if (marks >= 50) {
            grade = "Second Class";
        } else {
            grade = "Fail";
        }
    }

    void showResult() {
        calculateGrade();
        System.out.println("Grade: " + grade);
    }
}

// Main Class
public class Q2 {
    public static void main(String[] args) {

        Result obj = new Result();

        obj.studentName = "Rahul Sharma";
        obj.rollNo = 101;
        obj.marks = 72;

        obj.showStudent();
        obj.showResult();
    }
}
