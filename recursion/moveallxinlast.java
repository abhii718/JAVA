public class moveallxinlast {
    public static String addX(int count) {
        String newStr = "x";
        for (int i = 1; i < count; i++) {

            newStr += 'x';
        }
        return newStr;
    }

    public static String moveAllx(String str, int idx, int count) {

        if (idx == str.length()) {
            return addX(count);
        }

        if (str.charAt(idx) == 'x') {
            return moveAllx(str, idx + 1, count + 1);

        } else {
            
            String nextStr = moveAllx(str, idx + 1, count);
            return str.charAt(idx) + nextStr;
        }
    }

    public static void main(String args[]) {
        String str = "abcdefxghxixjxxxxk";
        int count = 0;

        String newStr = moveAllx(str, 0, count);
        System.out.println(newStr);

    }
}
