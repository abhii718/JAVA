public class overloading {
    public static void main(String[] args) {
        fun(5);
        fun(5);
        fun("abhii");
        // fun(6.06);
    }
    // static void fun(int b){
    //     System.out.print(b);
    // }
    static void fun(int a){
        System.out.print(a+1);
    }
    static void fun(String a){
        System.out.print(a);
    }
    static void fun(float a){
        System.out.print(a);
    }
}
