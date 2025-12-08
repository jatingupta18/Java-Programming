package C4_Pattern_Printing;

import java.util.Scanner;

public class P1_StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter Coloumn : ");
        int col = sc.nextInt();

        for(int i = 1; i <= row; i++){   // Kitni line hogi
            for(int j = 1; j <= col; j++){  // Har line me kitna print hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
