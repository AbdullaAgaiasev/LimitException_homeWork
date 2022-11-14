public class BankAccount {
    private  double amount;

    public  double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public  void deposit(double sum) {
        amount=amount+sum;

}

public  void withDraw(int sum) throws LimitException{
        if (sum >amount ){
            throw new LimitException("we cannot withdraw sum from your account");
        }else {
            amount= amount-sum;
        }

}
}
