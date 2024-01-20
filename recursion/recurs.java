public class recurs {
    public static void main(String[] args) {
        // message();
        // print1(4);
        // recur(5);
        for (int i = 0; i < 5; i++) {
            System.out.println(fibbo(i));
        }
    }

    static void message() {
        System.out.println("Hello World");
    }

    static void print1(int n) {
        System.out.println(n);
    }

    static void recur(int n) {
        if (n == 1) {
            return;
        }
        System.out.println("Hello World");
        recur(n - 1);
    }

    static int fibbo(int n) {
        if (n < 2) {
            return n;
        }
        return fibbo(n - 1) + fibbo(n - 2);
    }
}
