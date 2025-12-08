package C1_Basic_of_java;

public class P11_TypeCasting {
    public static void main(String[] args){

        // Typecasting - ek data type se dusre data type me conversion
        // Character to Integer

        char ch = 'A';
        int x = ch;    // implicit typecasting
        System.out.println(x);

        char chh = 'a';
        int y = (int)chh; // explicit typecasting (isme ham bata dete hai ki ham integer use kar rahe hai)
        System.out.println(y);

        char ch0 = '3';
        System.out.println((int)ch0);

        char ch1 = '9';
        int z = (int)ch1;
        System.out.println(z);

        char ch3 = 'c';
        System.out.println(ch3*1);

        char ch4 = 'c';
        System.out.println(ch4+0);

        char ch5 = 'c';
        System.out.println(ch5-2);

        char ch6 = 'c';
        System.out.println(ch6*ch6);


        // Integer to Character

        int x1 = 122;
        char ch7 = (char)x1;
        System.out.println(ch7);

        int x2 = 62;
        char ch8 = (char)x2;
        System.out.println(ch8);

        int x3 = 32;
        char ch9 = (char)x3;
        System.out.println(ch9);
    }
}
