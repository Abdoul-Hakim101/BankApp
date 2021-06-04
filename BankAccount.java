class BankAccount {

    private long iban;
    private double balance;

    public BankAccount(double balance) {
        double a = Math.random() * 100000000;
        iban = Math.round(a);
        this.balance = balance;
    }

    public long getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "iban=" + iban + ", balance=" + balance + '}';
    }
}
