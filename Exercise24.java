public class Exercise24 {
    public static class BankAccount extends Thread {
        int balance = 1000;

        public synchronized void withdraw(int amount){
            if (amount <= balance) {
                balance -= amount;
                System.out.println(" withdrawal successful ..... new balance is " + balance);

            }else{
                System.out.println("insufficient balance");
            }
        }
    
        
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        Thread user1 = new Thread(() -> {
            account.withdraw(300);
        });
        Thread user2 = new Thread(() -> {
            account.withdraw(500);
        });
        user1.start();
        user2.start();
    }
}
