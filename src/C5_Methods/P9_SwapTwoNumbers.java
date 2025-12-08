package C5_Methods;

import java.util.Scanner;

public class P9_SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.println(a + " " +b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
