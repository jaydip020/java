public class Q14{

    //instance variable
    int rollno;
    String name;

    //static variable
    static String division=" a ";

    //instance method in displaydetails
    void displaystudent(int r, String n){
        rollno=r;
        name=n;

        System.out.println("roll number : " + rollno);
        System.out.println("name : " + name);
    }

    //static method in displaydivision
    static void displaydivision(){
        System.out.println("division : " + division);
    }
    public static void main(String args[]){
        Q14 S1=new Q14();
        Q14 S2=new Q14();

        S1.displaystudent(101, "jay");
        S2.displaystudent(102, "jaydev");
        Q14.displaydivision();
    }
}
