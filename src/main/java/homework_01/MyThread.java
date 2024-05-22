package homework_01;


    public class MyThread extends Thread {
        @Override
        public void run() {

            for (int i = 1000001; i <= 2000000; i++) {

                if (i % 21 == 0) {
                    String s = Integer.toString(i);
                    if (s.contains("3")) {
                        MyClass.increment();
                    }
                }
            }
        }
    }