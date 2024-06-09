class SharedBuffer {
    private int value;
    private boolean hasValue = false;

    // Synchronized method for the producer to put value in the buffer
    public synchronized void produce(int value) {
        while (hasValue) {
            try {
                wait(); // Wait until the buffer is empty
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.value = value;
        hasValue = true;
        System.out.println("Produced: " + value);
        notify(); // Notify the consumer that buffer now has value
    }

    // Synchronized method for the consumer to get value from the buffer
    public synchronized int consume() {
        while (!hasValue) {
            try {
                wait(); // Wait until the buffer has a value
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasValue = false;
        System.out.println("Consumed: " + value);
        notify(); // Notify the producer that buffer is now empty
        return value;
    }
}

class Producer implements Runnable {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            buffer.produce(i++);
            try {
                Thread.sleep(1000); // Sleep for a while to simulate production time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer implements Runnable {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            buffer.consume();
            try {
                Thread.sleep(1500); // Sleep for a while to simulate consumption time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class  q41{
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));
        
        producerThread.start();
        consumerThread.start();
    }
}
