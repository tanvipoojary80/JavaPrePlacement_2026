class NumberPrinter {
    private int num = 1;
    private final int LIMIT = 10;

    synchronized void printOdd() {
        while (num <= LIMIT) {
            while (num % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            if (num <= LIMIT) {
                System.out.println("Odd : " + num++);
                notify();
            }
        }
    }

    synchronized void printEven() {
        while (num <= LIMIT) {
            while (num % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            if (num <= LIMIT) {
                System.out.println("Even: " + num++);
                notify();
            }
        }
    }
}

public class EvenOddThread {
    public static void main(String[] args) {

        NumberPrinter np = new NumberPrinter();

        Thread odd = new Thread(np::printOdd);
        Thread even = new Thread(np::printEven);

        odd.start();
        even.start();
    }
}