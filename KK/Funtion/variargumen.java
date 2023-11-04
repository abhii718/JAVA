import java.util.Arrays;

public class variargumen {
    public static void main(String args[]) {

        fun(2, 3, 4, 6, 3, 4, 2, 3);
        multiple(3, 5, "abhi", "adiatya", "Mohan");

    }

    static void fun(int... v) {
        System.out.print(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v)

    {
        System.out.print(a + b + Arrays.toString(v));
    }
}
