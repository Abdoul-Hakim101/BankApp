class Customer extends Person {

    ArrayList<BankAccount> accounts = new ArrayList<>();
    ArrayList<CreditCard> creditCards = new ArrayList<>();
    private long customerNo;

    public Customer(String name, String surname, String email, int phoneNo) {
        super(name, surname, email, phoneNo);
        double a = Math.random() * 100000000;
        customerNo = Math.round(a);
    }

    public BankAccount addAccount(String type, double amount) {
        BankAccount account;

        if (type == "checking") {
            account = new CheckingAccount(amount);
        } else {
            account = new InvestmentAccount(amount);
        }
        accounts.add(account);

        return account;
    }

    public CreditCard addCreditCard(double limit, double debt) {
        CreditCard card = new CreditCard(limit, debt);
        creditCards.add(card);
        return card;
    }

    public void removeAccount(BankAccount account) {
        if (account.getBalance() > 0) {
            System.out.println("please transfer your balance to another account first");
            return;
        }

        accounts.remove(account);
    }

    public void removeCreditCard(CreditCard card) {
        if (card.getUpdatedDebt() > 0) {
            System.out.println("please pay the debt first");
            return;
        }

        creditCards.remove(card);
    }

    @Override
    public String toString() {
        return super.toString() + "  Customer{" + "accounts=" + accounts + ", creditCards=" + creditCards
                + ", customerNo=" + customerNo + '}';
    }
}

