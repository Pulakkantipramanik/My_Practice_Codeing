public class StringBuilderLearn {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Hello");
        s.append("World");
        s.append("!");

        StringBuffer sb=new StringBuffer("Pulak");
        sb.append(" Pramanik");
        System.out.println(sb);
        System.out.println("=======================");
        System.out.println(sb.toString());
    }
}
