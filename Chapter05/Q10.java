package odevler.chapter02.Chapter05;

public class Q10 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 1000; i++) {
            if (i % 30 == 0) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
