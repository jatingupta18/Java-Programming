package C3_Loops;

public class P10_Print_ASCII_value {
    public static void main(String[] args) {

        // integer to char print

//        for(int i = 65; i <= 90; i++){
//            System.out.println((char) i + " " + " "+ i);


        // char to integer print

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " " + "=" + " " + (int)ch);
        }
    }
}
