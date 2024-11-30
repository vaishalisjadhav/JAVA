import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        String s="abc";
        String reverse="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println(reverse);
    }
}
