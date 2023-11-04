import java.util.Scanner;

public class function1 {

    public static void main(String[] args) {
        sum();

    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1 number : ");
        int num1 = in.nextInt();
        System.out.print("Enter 2 number : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum of 2 number are " + sum + " ");
        in.close();
    }
}