class Q15{
    //instance variable
    int empid;
    String empname;
    String empdesignation;
    double salary;

    //static variable
    static String companyname="Rcb";

    //constructor
    Q15(int id, String name, String desig, double salary){
        empid=id;
        empname=name;
        empdesignation=desig;
        this.salary=salary;   //correct
    }

    //instance method
    void displayemployeedetails(){
        System.out.println(empid + " " + empname + " " + empdesignation + " " + salary);
    }

    //static method
    static void displaycompanydetails(){
        System.out.println("companyname: " + companyname);
        System.out.println("-----------------");
    }

    public static void main(String args[]){
        Q15[] emp=new Q15[5];

        emp[0]=new Q15(101,"amit","manager",30000);
        emp[1]=new Q15(102,"amitraj","HR",31000);
        emp[2]=new Q15(103,"amitjay","mechanic",30001);
        emp[3]=new Q15(104,"amitbhim","man",35000);
        emp[4]=new Q15(105,"amithabh","support",36000);

        //static method call
        Q15.displaycompanydetails();

        //display all employee
        for(int i=0; i<emp.length;i++){
            emp[i].displayemployeedetails();
        }
    }
}
