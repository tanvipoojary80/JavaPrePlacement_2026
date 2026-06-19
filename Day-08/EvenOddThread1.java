class NumberPrinter {
    private int number = 1;
    private final int LIMIT = 20;

    public synchronized void printOdd() {
        while (number <= LIMIT) {

            while (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            if (number <= LIMIT) {
                System.out.println("Odd  : " + number);
                number++;
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (number <= LIMIT) {

            while (number % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            if (number <= LIMIT) {
                System.out.println("Even : " + number);
                number++;
                notify();
            }
        }
    }
}

public class EvenOddThread1 {

    public static void main(String[] args) {

        NumberPrinter printer = new NumberPrinter();

        Thread oddThread = new Thread(() -> printer.printOdd());

        Thread evenThread = new Thread(() -> printer.printEven());

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Thread execution completed.");
    }
}