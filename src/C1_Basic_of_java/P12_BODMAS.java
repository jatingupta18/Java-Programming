package C1_Basic_of_java;

public class P12_BODMAS {
    public static void main(String[] args) {
        //      /, *, % > +, -

        int x = 5 + 2 * 6;
        System.out.println(x);

        // For Multiple and Divide
        // Left to Right chalne me jo operator pahle aayega uski priority sabse jayda hogi

        int y = 4 * 2 / 3;
        System.out.println(y);
        // output : 2? , 0?

        int z = 4 / 2 * 3;
        System.out.println(z);
        // output : 0? , 6?


    }
}
