package C4_Pattern_Printing;

import java.util.Scanner;

public class P28_Diamond_Method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Method - 2 : USing Maths


        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Upper pyramid
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= 2*i - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower pyramid
        for(int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= 2*i - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
