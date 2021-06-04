class CreditCard {

    private double limit, updatedDebt;
    private long cardNo;

    public CreditCard(double limit, double updatedDebt) {
        this.limit = limit;
        this.updatedDebt = updatedDebt;

        double a = Math.random() * 100000000;
        cardNo = Math.round(a);
    }

    public double getUpdatedDebt() {
        return updatedDebt;
    }

    public void setUpdatedDebt(double updatedDebt) {
        if (updatedDebt > limit) {
            System.out.println("Failure ! Debt surpasses limit");
            return;
        }

        this.updatedDebt = updatedDebt;
    }

    public long getCardNo() {
        return cardNo;
    }

    @Override
    public String toString() {
        return "CreditCard{" + "limit=" + limit + ", updatedDebt=" + updatedDebt + ", cardNo=" + cardNo + '}';
    }
}

