public class MultiThreadingPractice extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Welcome to Our Discussion");
        }
    }

    public static void main(String[] args) {
        MultiThreadingPractice mtp = new MultiThreadingPractice();
//        Thread T1= new Thread(mtp);
        mtp.start();
    }
}
