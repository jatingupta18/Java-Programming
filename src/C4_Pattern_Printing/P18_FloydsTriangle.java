package C4_Pattern_Printing;

import java.util.Scanner;

public class P18_FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        int a = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(a + " ");     //  System.out.print(a++ + " "); ye bhi kar sakte the ek baar a print karo agli baar ke liye 1 se badh
                a++;
            }
            System.out.println();
        }
    }
}
