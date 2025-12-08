package C4_Pattern_Printing;

import java.util.Scanner;

public class P12_StarTriangleHorizontallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // Standard Method

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= (n+1-i); j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // using variable

//        int a = n; // no. of stars to be printed in each line
//        for(int i = 1; i <= n; i++){
//           for (int j = 1; j <= a; j++){
//               System.out.print("*" + " ");
//           }
//           a--;
//            System.out.println();
//        }

        // Using Dimaak

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
