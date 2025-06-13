public class Exercise23 {
    static class Counter extends Thread {
        private String threadName;

        public Counter(String name) {
            this.threadName = name;
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + ": " + i);
                try {
                    Thread.sleep(1000); // pause for 1 second
                } catch (InterruptedException e) {
                    System.out.println(threadName + " was interrupted");
                }
            }
        }
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter("Counter 1");
        Counter counter2 = new Counter("Counter 2");

        counter1.start();
        counter2.start();
    }
}
