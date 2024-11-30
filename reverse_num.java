import java.util.Scanner;

public class reverse_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int reverse_num=0;
        while(num!=0){
            int reminder=num%10;
            reverse_num=reverse_num*10+reminder;
            num=num/10;
        }
        System.out.println("Reverse number is:"+ reverse_num);
    }
}
