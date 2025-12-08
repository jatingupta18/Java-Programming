package C2_If_Else;
import java.util.Scanner;
public class P10_GreatestOfThree_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number : ");
        int c = sc.nextInt();

        // Use Nested if-else

        if (a>b) {  // b toh max nahi hai
            if (a>c)
                System.out.println(a);
            else
                System.out.println(c);
        }
        else {  //b>a iska matlab a toh max nahi hai
            if  (b>c)
                System.out.println(b);
            else
                System.out.println(c);
        }

    }
}
