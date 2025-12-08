package C4_Pattern_Printing;

import java.util.Scanner;

public class P16_StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");  // n odd honge for better shape
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == (n / 2) + 1 || j == (n / 2) + 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");  // double space hai
                }
            }
            System.out.println();
        }
    }
}
