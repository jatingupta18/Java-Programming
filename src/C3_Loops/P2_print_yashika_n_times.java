package C3_Loops;
import java.util.Scanner;
public class P2_print_yashika_n_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println("Yashika");
        }

    }
}
