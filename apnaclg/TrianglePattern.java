public class TrianglePattern {
    public static void main(String[] args) {
        int n = 5; // Set the number of rows in the triangle.

        // Loop for the upper half of the triangle.
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for alignment.
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print asterisks for the current row.
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            // Move to the next line to start a new row.
            System.out.println();
        }
    }
}
