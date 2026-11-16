// ✅ Company.java — Synchronized shared resource
class Company {
    int item = 0;
    boolean itemReady = false;

    // Producer calls this method
    public synchronized void produce_item(int value) {
        // If item is already ready, wait
        while (itemReady) {
            try {
                wait(); // Wait until Consumer consumes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.item = value;
        this.itemReady = true;
        System.out.println("John produced: " + item);

        try {
            Thread.sleep(2000); // 2 sec pause after producing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        notify(); // Wake up the Consumer
    }

    // Consumer calls this method
    public synchronized void consume_item() {
        // If item is not ready yet, wait
        while (!itemReady) {
            try {
                wait(); // Wait until Producer produces
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Peter consumed: " + item);
        this.itemReady = false;

        try {
            Thread.sleep(2000); // 2 sec pause after consuming
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        notify(); // Wake up the Producer
    }
}

// ✅ Producer Thread — John
class Producer extends Thread {
    Company company;
    Producer(Company company) {
        this.company = company;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            company.produce_item(i);
        }
    }
}

// ✅ Consumer Thread — Peter
class Consumer extends Thread {
    Company company;
    Consumer(Company company) {
        this.company = company;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            company.consume_item();
        }
    }
}

// ✅ Main class
public class Main {
    public static void main(String[] args) {
        Company company = new Company(); // one shared object
        Producer john = new Producer(company);  // John = producer thread
        Consumer peter = new Consumer(company); // Peter = consumer thread
        john.start();
        peter.start();
    }
}