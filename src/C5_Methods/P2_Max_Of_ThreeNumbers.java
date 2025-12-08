package C5_Methods;

import java.util.Scanner;

public class P2_Max_Of_ThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b,c));
        System.out.println("Maximum = " + max);
    }
}
