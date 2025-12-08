package C3_Loops;

public class P3_PrintEvenNumbers_1to100 {
    public static void main(String[] args) {

        // -------------------------------------------------------
        // Method 1: Basic Approach (Using extra variable 'n')
        // -------------------------------------------------------
//        for (int i = 1; i <= 100; i++) {
//            int n = i;
//            if (n % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        // -------------------------------------------------------
        // Method 2: Better Approach (Direct condition on 'i')
        // -------------------------------------------------------
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        // -------------------------------------------------------
        // Method 3: Most Optimized (Jump by 2)
        // -------------------------------------------------------
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }
}
