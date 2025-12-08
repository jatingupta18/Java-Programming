package C4_Pattern_Printing;
import java.util.Scanner;
public class P15_HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int m = sc.nextInt();
        System.out.print("Enter Coloumn : ");
        int n = sc.nextInt();

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if (i == 1 || i == m || j == 1 || j == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  "); // ek extra space diya
                }
            }

            System.out.println();
        }
    }
}
