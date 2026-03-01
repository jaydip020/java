public class Q20{
    //instance variables
    int accountnumber;
    String accountHoldername;
    double balance;

    //parameterized constructor
    Q20(int accountnumber, String accountHoldernamr, double balance){
        this.accountnumber=accountnumber;
        this.accountHoldername=accountHoldername;
        this.balance=balance;
    }

    //method diposite
    void diposit(double amount){
        balance=balance + amount;
        System.out.println("amount diposited:" + amount);
        System.out.println("Total balance:" + balance);
    }

    //method withdraw
    void withdraw(double amount){
        if(amount<=balance){
        balance=balance+amount;
        System.out.println("amount withdrawn: " + amount);
        System.out.println("new balance:" + balance);
    } else {
        System.out.println("Insufficient balacel!");
    }
}
//display method
void display(){
    System.out.println("Account number:" + accountnumber);
    System.out.println("Account Holder name:" + accountHoldername);
    System.out.println("balance:" + balance);
}

//main method
public static void main(String args[]){
    Q20 b1=new Q20(101, "rohit", 5000);
    b1.display();

    System.out.println("\n---diposit---");
    b1.diposit(2000);

    System.out.println("\n---withdraw---");
    b1.diposit(3000);

    System.out.println("\n--- withdraw---");
    b1.withdraw(10000);

  }
}
