
public class towrofhanoi {
    public static void twr(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // transfar top n-1 from src to helper using dest as 'helper'
        twr(n - 1, src, dest, helper);

        // transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);

        // tranfer n-1 from helper to desk using src as 'helper'
        twr(n - 1, helper, src, dest);

    }

    public static void main(String[] args) {

        int n = 4;
        twr(n, "A", "B", "c");
    }
}
