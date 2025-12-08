package C4_Pattern_Printing;

import java.util.Scanner;

public class P6_AlphabetSquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print((char)(i+64) + " ");

                // For Small a-z
//                System.out.print((char) + (i + 96) + " ");
            }
            System.out.println();
        }
    }
}

