package C4_Pattern_Printing;

import java.util.Scanner;

public class P30_NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= (2*n-1); i++){
            for (int j = 1; j <= (2*n-1); j++){

                int a = i, b = j;     // Use Concept of fake values

                if (i > n){
                    a = (2*n-i);
                }
                if (j > n){
                    b = (2*n-j);
                }
                System.out.print(Math.min(a,b) + " ");
                // Or use Ternary Operator (proper if-ele bhi use kar sakte hai)

//                System.out.print(((a<b)? a : b) +" ");

            }
            System.out.println();
        }
    }
}
