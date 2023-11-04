import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        System.out.println("Enter the operator: ");
        while (true) {
            char op = in.next().trim().toLowerCase().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }  if (op == '-') {
                    ans = num1 - num2;
                }  if (op == '*') {
                    ans = num1 * num2;
                }  if (op == '/') {
                    ans = num1 / num2;
                }  if (op == '%') {
                    ans = num1 % num2;
                }  if (op == 'x' || op == 'X') {
                    break;
                } else {
                    System.out.print("Invalid operator ");
                }
            }
            System.out.println( ans); 
        }
        in.close();
    }
}
