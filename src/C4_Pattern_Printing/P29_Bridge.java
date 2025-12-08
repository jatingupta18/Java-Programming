package C4_Pattern_Printing;

import java.util.Scanner;
public class P29_Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= (2 * n - 1); i++){    // First Line - Stars
            System.out.print("* ");
        }
        System.out.println();    // New Line

        int nsp = 1;
        for(int i = 1; i <= n-1; i++){    // Line
            for(int j = 1; j <= n-i; j++){          // Stars
                System.out.print("* ");
            }
            for(int j = 1; j <= nsp; j++){          // Spaces
//                for(int j = 1; j <= 2*i-1; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n-i; j++){          // Stars
                System.out.print("* ");
            }
            nsp += 2;
            System.out.println();
        }
    }
}
