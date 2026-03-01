import java.util.Scanner;
public class Q3{
    public static void main(String args[]){
        Scanner Sc=new Scanner(System.in);

        System.out.print("Enter a number:");
        int year=Sc.nextInt();

        if((year % 4==0 && year % 100 !=0)||(year % 400 == 0)){
            System.out.println("is a leap year:" + year);
        }else{
            System.out.println("is a not leap year:" + year);
        }
        Sc.close();
    }
}
