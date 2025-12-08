package C3_Loops;
import java.util.Scanner;
public class P15_CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digits : ");
        int n = sc.nextInt();

        if(n==0) n = 1;   // kyuki 0 bhi ek digit count hota hai
        int count = 0;
        while (n != 0){
           n= n/10;
            count++;
        }
        System.out.println(count + " " + "Digit Number");
    }
}
