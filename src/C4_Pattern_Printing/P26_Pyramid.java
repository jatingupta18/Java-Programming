package C4_Pattern_Printing;

import java.util.Scanner;

public class P26_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // Method - 1 : Using Maths

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= (n-i); j++) {
//                System.out.print(" " + " ");  // Spaces
//            }
//            for (int j = 1; j <= ((2*i)-1); j++) {
//                System.out.print("*" + " ");  // Numbers
//            }
//            System.out.println();
//        }

        // Method - 2: Using Extra Variable

        int nsp = (n - 1), nst = 1;  // Number of spaces (nsp) or  Number of Stars (nst)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }

            nsp = nsp - 1;  // nsp--;
            nst = nst + 2;   //  nst += 2;
            System.out.println();
        }
    }
}