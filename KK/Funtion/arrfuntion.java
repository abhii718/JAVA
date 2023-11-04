import java.util.Arrays;

public class arrfuntion {
    public static void main(String[] args) {
        // creat arr
        int[] arr = { 2, 3, 1, 3, 4, 2, 4 };
        change(arr);
        System.out.println(Arrays.toString(arr));
        ap(arr);
        System.out.println(arr);
    }

    static void change(int[] num) {
        num[0] = 99;
    }
    static void ap(int[] arr){
        System.out.println(arr); 
     arr [1]= 88;

    }
}
