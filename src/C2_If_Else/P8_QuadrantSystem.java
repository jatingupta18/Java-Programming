package C2_If_Else;
import java.util.Scanner;
public class P8_QuadrantSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter X - Coordinate : ");
        double x = sc.nextDouble();
        System.out.print("Enter Y - Coordinate : ");
        double y = sc.nextDouble();

        if (x==0 && y==0) {
            System.out.println("Lies in origin");
        }
        else if (x>0 && y==0) {
            System.out.println("Lies in +x-axis");
        }
        else if (y>0 && x==0) {
            System.out.println("Lies in +y-axis");
        }

        else if (x<0 && y==0) {
            System.out.println("Lies in -x-axis");
            }
        else if (y<0 && x==0) {
            System.out.println("Lies in -y-axis");
        }
        else if (x>0 && y>0) {
            System.out.println("Lies in I Quadrant");
        }
        else if (x<0 && y>0) {
            System.out.println("Lies in II Quadrant");
        }
        else if (x<0 && y<0) {
            System.out.println("Lies in III Quadrant");
        }
        else if (x>0 && y<0) {
            System.out.println("Lies in IV Quadrant");
        }

    }
}
