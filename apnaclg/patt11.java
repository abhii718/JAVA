//         *****
//       *****
//     *****
//   *****
// *****
public class patt11 {
    public static void main(String[] args) {
        int n = 5;
        // upper half
        for (int i = 1; i <= n; i++) {
            // 1st part
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
           
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
            }    
            System.out.println();
        }
    }
}