package C1_Basic_of_java;
import java.util.Scanner;
public class P8_TakingInput {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Radius : ");
//        double r = sc.nextDouble();
//        double a = 3.141592 * r * r;
//       // System.out.println("Area of Circle is : "+a);
//
//        System.out.print("Area of circle is : ");
//        System.out.println(a);


        // Taking more than 1 inputs

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double a = sc.nextDouble();
        System.out.print("Enter second number : ");
        double b = sc.nextDouble();
        System.out.print("Enter third number : ");
        double c = sc.nextDouble();
        double s = a + b + c;
        //   System.out.println("Sum is : " +s);

        System.out.print("Sum is : ");
        System.out.println(s);
    }
}
