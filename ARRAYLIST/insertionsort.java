import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        insertionsorT(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionsorT(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
