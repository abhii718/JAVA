public class pattern5 {

    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            
            // Print asterisks
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
