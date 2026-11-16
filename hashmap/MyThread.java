public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Mythread class "+ i+  "  ");
            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyanotherThread t2 = new MyanotherThread();
        t2.start();
        Thread thread = new Thread(t1);
        thread.start();
    }
}
