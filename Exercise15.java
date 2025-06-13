public class Exercise15 {
    static class Counter{
        static int count = 0;

        public Counter(){
            count++;
            System.out.println("Counter : " + count);
        }

        static void reset(){
            count = 0;
            System.out.println("Count Reset");
        }
    }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter.reset();
        Counter c3 = new Counter();
    }
}
