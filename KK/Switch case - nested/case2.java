import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {
        System.out.println("Enter 1 to 4 days");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        switch (number) {

            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4, 5, 6, 7, 8 -> System.out.println("Thursday - saturday");
        }
        in.close();
    }
}