package C2_If_Else;
import java.util.Scanner;
public class P5_IntegerOrNot {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number : ");
      double n = sc.nextDouble();  // n = 3.14

      // Type Casting
        int x = (int)n;    // x = 3
      if (n-x > 0){
          System.out.println("Not an Integer");
      }
      else {
          System.out.println("Is an Integer");
          // if (n-x == 0) sout("Is an Integer")
      }

    }
}
