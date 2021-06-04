class InvestmentAccount extends BankAccount {

    private String accountType;

    public InvestmentAccount(double balance) {
        super(balance);
        accountType = "Savings Account";
    }

    public void depositMoney(double amount) {
        double balance = this.getBalance();
        balance += amount;
        this.setBalance(balance);
        System.out.println("Amount Deposited");
    }

    public void withdrawMoney(double amount) {
        double balance = this.getBalance();

        if (amount > balance) {
            System.out.println("Not enough balance available");
            return;
        }

        balance -= amount;
        this.setBalance(balance);

        System.out.println("Amount Withdrawn");
    }

    @Override
    public String toString() {
        return super.toString() + " {" + "accountType=" + accountType + '}';
    }
}

