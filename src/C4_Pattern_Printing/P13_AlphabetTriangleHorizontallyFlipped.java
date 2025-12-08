package C4_Pattern_Printing;

import java.util.Scanner;

public class P13_AlphabetTriangleHorizontallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

//        int a = n;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= a; j++) {
//                System.out.print((char)(j+96) + " ");
//            }
//            a = a - 1; // a--
//            System.out.println();
//        }

        // Using Standard Method

        for(int i =1; i <= n; i++){
           for(int j = 1; j <= (n+1-i); j++){
               System.out.print((char)(j+96) + " ");
           }
            System.out.println();
        }
    }
}
