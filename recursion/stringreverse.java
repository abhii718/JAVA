public class stringreverse {
    public static void printRev(String str, int idx) {
        if (idx == 0) {
            return;

        }
        System.out.print(str.charAt(idx));
        printRev(str, idx - 1);
    }

    public static void main(String args[]){
        String str="abcdefg";
        printRev(str, str.length()-1);
    }
}
