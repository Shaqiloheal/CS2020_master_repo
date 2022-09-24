public class Account {
    private float balance;

    public void deposit(float amount) {
        balance += amount;
    }

    public void withdraw(float amount) {
        balance -= amount;
    }

    public float getBalance() {
        return balance;
    }

    public void transferFunds(Account destination, float amount) {
        destination.deposit(amount);
        this.withdraw(amount);
    }

    public static void main(String[] args) {
        Account myAccount = new Account(); // Balance = 0.00
        System.out.println("Welcome to Meston Bank");

        myAccount.deposit(Float.parseFloat("34.45")); // 34.45
        myAccount.deposit(Float.parseFloat("2000.50")); // 2034.95
        System.out.println("Your balance is: " + myAccount.getBalance());  // Your balance is: 2034.95

        myAccount.withdraw(Float.parseFloat("550.99")); // 1483.96
        System.out.println("Your balance is: " + myAccount.getBalance()); // Your balance is: 1483.96


    }
}