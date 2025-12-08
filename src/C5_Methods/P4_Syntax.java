package C5_Methods;

public class P4_Syntax {

//    public static void harsh(){   // Ye hamne ek method (Function) banaya
//        System.out.println("Yashika");
//    }
//    public static void main(String[] args) {   // Main Function (Baap of every function) Sabse pahle yahi chalta hai
//        System.out.println("ABD");
//
//        harsh();  // Call kiya harsh ko toh use me aa gaya (Function/Method call)
//
//        khushi();
//
//        System.out.println();
//
//        System.out.println("Virat");
//    }
//    public static void khushi(){   // Ye hamne ek method (Function) banaya
//        System.out.println("Priyanshi");
//
//        for (int i = 1; i <= 7; i++){
//            System.out.print(i + " ");
//
//        }
//    }

    // Q. What will be the output

    public static void shravan(){
        karan();
        System.out.println("Khushi");
    }

    public static void main(String[] args){
        riyanshi();
    }

    public static void karan(){
        System.out.println("Yashika");
    }

    public static void riyanshi(){
        karan();
        shravan();
        System.out.println("Ajay");
        shravan();
    }
}
