public class reverseofintege {

    public static void main(String[] args) {
        int n = 377197974;
        int ans = 0;
        while (n > 0) {

            int rem = n % 10;
            // System.out.println(rem);
            
            n = n / 10;
            System.out.println(n);

            ans = ans * 10 + rem;
            System.out.println( ans );
        }
        System.out.println("revers of integer is "+ ans );
    }
}
