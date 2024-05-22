package homework_01;

public class MyClass {
    private static int counter =0;
    public static synchronized void increment() {
        counter ++;
    }
    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        myThread1.start();


        for (int i = 1; i <= 1_000_000; i++) {

            if (i % 21 == 0) {
                String s = Integer.toString(i);
                if (s.contains("3"))
                {
                    increment();

                }
            }
        }
        try {
            myThread1.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Количество чисел (два потока): " + counter);

    }

}
