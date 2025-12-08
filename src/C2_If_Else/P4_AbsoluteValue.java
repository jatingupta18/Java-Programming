package C2_If_Else;
import java.util.Scanner;
public class P4_AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        double n = sc.nextDouble();
        if (n >= 0){
            System.out.print("Absolute value is : ");
            System.out.println(n);
        }
        else {
//             System.out.print("Absolute value is : ");
//             System.out.print(-1 * n);
            System.out.println("Absolute value is : " + (-1.0 * n));
        }


    }
}
