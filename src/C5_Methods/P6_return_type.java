package C5_Methods;

public class P6_return_type {

    public static int yasha (int a){
        System.out.println("Yashika");
        if (a > 0){
            return 5;   // end
        }
        else{
            return 10;
        }
    }

    public static void main(String[] args) {
        int x = yasha(7);
        System.out.println(3 + x);
    }
}
