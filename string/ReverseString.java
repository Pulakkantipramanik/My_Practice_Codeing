public class ReverseString {

    public static void main(String[] args) {
//        String str= "Pulak";
//        String rev= new StringBuilder(str).reverse().toString();
//        System.out.println(rev);
//
//        -------------------------------------------------
        String str ="Sanjoy";
//        String rev="";
        for (int i = str.length()-1; i >=0 ; i--) {
//            rev = rev+str.charAt(i);
            System.out.print(str.charAt(i));
        }

    }
}
