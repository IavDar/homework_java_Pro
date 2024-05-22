package homework_01;

public class Main {
    public static int counter =0;
    public static void main(String[] args) {

            for (int i = 1; i <= 2_000_000; i++) {

                if (i % 21 == 0) {
                    String s = Integer.toString(i);
                    if (s.contains("3"))
                    {
                        counter ++;

                    }
                }
        }
        System.out.println("Количество чисел (один поток): " + counter);

    }
}
