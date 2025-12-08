package C3_Loops;
import java.util.Scanner;
public class P6_AP {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 'n' : ");
    int n = sc.nextInt();

    // AP 2,5,8,11,14.....
        // an = a + (n-1)d

//     for(int i = 2; i <= (3*n - 1); i = i+3){
//         System.out.println(i);
//     }

        // different method agar formula nahi pata hota toh

        int a = 2, d = 3;

        for(int i = 1; i <= n; i++){
            System.out.print(a + " ");
            a = a+d;
        }
    }
}
