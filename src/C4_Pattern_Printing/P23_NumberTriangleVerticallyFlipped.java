package C4_Pattern_Printing;

import java.util.Scanner;

public class P23_NumberTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" " + " ");  // Spaces
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");  // Numbers
            }
            System.out.println();
        }
    }
}
