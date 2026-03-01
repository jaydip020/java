public class Q17{
    static void checkarmstrong(int num){
        int original=num;
        int sum=0;

        while(num>0){
            int digit=num %10;
            sum=sum+(digit*digit*digit);
            num=num/10;
        }
        if(original==sum){
            System.out.println(original + "is a armstrong number");
            System.out.println(original + "is a not armstrong number");

        }
    }
    public static void main(String args[]){
        checkarmstrong(153);
        checkarmstrong(228);
    }
}
