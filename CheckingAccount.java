class CheckingAccount extends BankAccount {

    private String accountType;

    public CheckingAccount(double balance) {
        super(balance);
        accountType = "Checking Account";
    }

    public void transferMoney(BankAccount receiver, BankAccount sender, double amount) {
        if (amount > sender.getBalance()) {
            System.out.println("Not enough balance available");
            return;
        }

        double balance = sender.getBalance();
        sender.setBalance(balance - amount);

        balance = receiver.getBalance();
        receiver.setBalance(balance + amount);
    }

    public void payCreditCardDebt(CreditCard card, double amount) {
        if (amount > this.getBalance()) {
            System.out.println("Not enough balance available");
            return;
        }

        double debt = card.getUpdatedDebt();
        debt = debt - amount;

        if (debt < 0) {
            debt = 0;
        }

        card.setUpdatedDebt(debt);

        double balance = this.getBalance();
        balance -= amount;
        this.setBalance(balance);

        System.out.println("Credit Card Debt Paid");
    }

    @Override
    public String toString() {
        return super.toString() + " {" + "accountType=" + accountType + '}';
    }
}
