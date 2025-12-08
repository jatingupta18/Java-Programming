package C3_Loops;

public class P11_BreakAndContinue {
    public static void main(String[] args) {

        // Break Statement

//        for(int i = 1; i <= 10; i++){
//            if (i==5){
//                break;
//            }
//            System.out.println(i);
//        }

        // Continue Statement

        for(int i = 1; i <= 10; i++){
            if (i==5){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
