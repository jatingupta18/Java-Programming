package C3_Loops;

import java.util.Scanner;

public class P19_a_ki_Power_b_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int power =1;
        for(int i = 1; i <= b; i++){
            power = power * a;
        }
        System.out.println(a + " raised ki power " + b +" is " + power);
    }
}
