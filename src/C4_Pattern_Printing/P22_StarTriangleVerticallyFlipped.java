package C4_Pattern_Printing;

import java.util.Scanner;

public class P22_StarTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // Mehtod 1 - for star print


//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                if ((i + j)>n){
//                    System.out.print("* ");    // System.out.print("*" + " ");
//                }
//                else{
//                    System.out.print("  ");  // 1 extra space hai    System.out.print(" " + " ");
//                }
//            }
//            System.out.println();
//        }


        // Method - 2 : Standard

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (n-i); j++){  // Spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){  // Stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
