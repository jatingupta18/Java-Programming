package C2_If_Else;
import java.util.Scanner;
public class P7_Area_Parimeter {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : ");
        double l = sc.nextDouble();
        System.out.print("Enter Breadth : ");
        double b = sc.nextDouble();
        double A = l * b;
        double P = 2 * (l+b);
        if (A>P) {
            System.out.println("Area of rectangle is greater than its perimeter");
        }
            else {
                System.out.println("Area of rectangle is not greater than its perameter");
            }
    }
}