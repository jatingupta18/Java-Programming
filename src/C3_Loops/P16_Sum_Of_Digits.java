package C3_Loops;

import java.util.Scanner;
public class P16_Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digits : ");
        int n = sc.nextInt();

        int sum = 0;
        while(n != 0){
            sum = sum + (n % 10); // last digit ko add kar raha hai
            n = n / 10;  // last digit ko remove kar raha hai
        }
        System.out.println(sum);

    }

}
