public class ifarrasorted {
    public static boolean checkIfIncreasing(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;

        }
        if (!checkIfIncreasing(arr, idx + 1)) {
            return false;
        }
        return arr[idx] < arr[idx + 1];

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 6, 3, 2, 5 };
        if (checkIfIncreasing(arr, 0)) {
            System.out.println("Stricly Increasing");
        } else {
            System.out.println("Not Striclly Incresing");
        }
    }
}
