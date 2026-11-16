public class Example {

    // 'a' এবং 'b' হলো PARAMETERS
     Example(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Example e = new Example(5,10);
    }
}