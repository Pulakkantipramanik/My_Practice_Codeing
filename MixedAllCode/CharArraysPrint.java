public class CharArraysPrint {

    Boolean check(String s) {
        // your code here
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i] == arr[j+1]) {
                    return true;
                }
            }
        }
        return false;


    }

    public static void main(String[] args) {
       CharArraysPrint c = new CharArraysPrint();
        System.out.println(c.check("abcdefg"));
        System.out.println(c.check("aaa"));
       }
}
