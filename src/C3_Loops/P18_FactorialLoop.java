package C3_Loops;
import java.util.Scanner;
public class P18_FactorialLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int i = 1;
        int fact = 1;
        while (i <= n){
            fact = fact * i;
            i++;
        }
        System.out.println(fact);

        // By using for loop

//        int fact = 1;
//        for(int i = 1; i<= n; i++){
//            fact = fact * i;
//        }
//        System.out.println(fact);
    }
}
