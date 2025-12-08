package C3_Loops;
import java.util.Scanner;
public class P12_PrimeOrComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' : ");
        int n = sc.nextInt();

        // Composite Number

//        for(int i = 2; i<= (n-1); i++){
//            if (n % i == 0){
//                System.out.println("Composite Number");
//                break;
//            }
//        }

        // Prime Number print nahi hoga
        // Best approach

        boolean flag = true; // true means Prime

//        for(int i = 2; i <= n-1; i++){
        for(int i = 2; i <= Math.sqrt(n); i++){         // Use -Concept of Square root

            if(n % i == 0){  // i to n tak ka ek factor nikala
                flag = false; // false means Composite
                break;
            }
        }
        if (n==1){
            System.out.println("Neither Prime nor Composite");
        }
        else if (flag == false){
            System.out.println("Composite");
        }
        else{
            System.out.println("Prime Number");
        }


        }
    }

