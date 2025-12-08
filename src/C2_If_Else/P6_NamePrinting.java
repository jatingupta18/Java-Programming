package C2_If_Else;
import java.util.Scanner;
public class P6_NamePrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();  // Input Integer

        if (n%5==0 && n%3==0) {
            System.out.println("Apurve");
        }
        else if (n%3==0) {
            System.out.println("Banu");
        }
        else if (n%5==0) {
        System.out.println("Riya");
        }
        else if (n%5!=0 && n%3!=0) {
            System.out.println("Isha");
        }
    }
}
