import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
        System.out.println("Enter 1 to 4 days");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        switch (number) {
            case 1: {
                System.out.println("Sunday");
                break;
            }
            case 2: {
                System.out.println("Sunday");
                break;
            }
            case 3: {
                System.out.println("Monday");
                break;
            }
            case 4: {
                System.out.println("Tuesday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            default: {
                System.out.println("Thursday - saturday");
                break;
            }
        }
        in.close();
    }
}