
public class occurance {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 8, 7, 5, 7, 8, 7, 9 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] == 7) {
                count++;
            }
        }
        System.out.println("the repitation of t is " + count + " times");
    }
}
