package C4_Pattern_Printing;
import java.util.Scanner;
public class P27_Diamond_Method1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Method - 1 : Using nsp/nst concept

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // Upper Pyramid

        int nsp = (n - 1), nst = 1;  // Number of spaces (nsp) or  Number of Stars (nst)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }

            nsp = nsp - 1;  // nsp--;
            nst = nst + 2;   //  nst += 2;
            System.out.println();
        }

        // Lower Pyramid

        int nspL = (1), nstL = (2*n - 3);  // Number of spaces in lower (nspL) or  Number of Stars in lower (nstL)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nspL; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nstL; j++) {
                System.out.print("*" + " ");
            }

            nspL++;
            nstL -= 2;
            System.out.println();
        }

    }
}
