package C5_Methods;

public class P5_Arguments {
//    public static void sum (int a, int b, int c){  // Parameter (Boxes)
//        System.out.println(a + b + c);
//    }
//
//    public static void main(String[] args) {
//        sum(5,-2,20);  // Arguments (Values)
//    }

    // Maximum  of three numbers

    public static void sum (int a, int b, int c){  // Parameter (Boxes)
        if (a >= b && a > c){
            System.out.println(a + "a is greast");
        }
        else if (b >= a && b > c){
            System.out.println(b + "b is greast");
        }
        else{
            System.out.println(c + " " + "c is greast ");
        }
    }

    public static void main(String[] args) {
        sum(5,-2,20);  // Arguments (Values)
    }


}
