public class charecterCountString {
    public static void main(String[] args) {
        String str ="Pulak";
        int count =0;
        char ch [] = str.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
             count ++;
        }
        System.out.println("lenght is "+count);
    }
}
