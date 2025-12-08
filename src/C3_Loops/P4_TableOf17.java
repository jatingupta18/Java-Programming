package C3_Loops;

public class P4_TableOf17 {
    public static void main(String[] args) {

        // [(170-17)+1]= 154 iterations hai loop ke
        // iss liye aisa karna better nahi hota

//        for(int i = 17; i <= 170 ; i++) {
//            if (i%17 == 0){
//                System.out.print(i + " " );
//            }
//
//        }

        // 10 iterations me hai loop ke

        for(int i = 17; i <= 170 ; i=i+17) {
            System.out.print(i+" ");
        }
    }
}
