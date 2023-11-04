public class occurance2 {
    public static void main(String[] args) {
        int n = 377197974;
        int count = 0;

        while (n > 0) {

            int rem = n % 10;

            if (rem == 7) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("The repitation of 7 is " + count + " times");
    }
}
