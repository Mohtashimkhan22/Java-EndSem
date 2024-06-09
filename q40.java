class A extends Thread {

    public A() {
        System.out.println("this is a constructor of A class");
    }

    @Override
    public void run() {
        try {
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 3; i++) {
                System.out.println(name);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class q40 {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        t1.setName("CSthread");
        t2.setName("ITthread");
        t1.start();
        t2.start();
        String n = Thread.currentThread().getName();
        System.out.println(n);
    }
}
