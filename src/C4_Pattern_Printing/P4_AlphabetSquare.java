package C4_Pattern_Printing;

import java.util.Scanner;

public class P4_AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print((char)(j+64) + " ");

                // For Small a-z
//                System.out.print((char) + (j + 96) + " ");
            }
            System.out.println();
        }
    }
}
