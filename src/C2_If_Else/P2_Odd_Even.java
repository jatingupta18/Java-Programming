package C2_If_Else;
import java.util.Scanner;
public class P2_Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even Number");
        }
        if (n % 2 != 0){
            System.out.println("Odd Number");
//            else {
//                System.out.println("Odd Number");
            }
    }
}
