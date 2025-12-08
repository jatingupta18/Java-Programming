package C2_If_Else;
import java.util.Scanner;
public class P9_GreatestOfThree_1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    double a = sc.nextDouble();

        System.out.print("Enter second number: ");
    double b = sc.nextDouble();

        System.out.print("Enter third number: ");
    double c = sc.nextDouble();

        if (a > b && a > c) {
        System.out.println("Greatest number is: " + a);
    }
        else if (b > a && b > c) {
        System.out.println("Greatest number is: " + b);
    }
        else if (c > a && c > b) {
        System.out.println("Greatest number is: " + c);
    }
        else {
        System.out.println("Two or more numbers are equal and greatest.");
    }
}
}


