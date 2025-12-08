package C4_Pattern_Printing;

import java.util.Scanner;

public class P21_ContineousOddTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a = a + 2;
            }
            System.out.println();
        }
    }
}
