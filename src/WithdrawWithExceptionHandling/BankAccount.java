public class BankAccount {
    private double balance;
    public BankAccount(double iBalance){
        this.balance = iBalance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void withdraw(double amount) throws AccountBalanceException{
        if(amount>balance){
            throw new AccountBalanceException("Insufficient Balance");
        }
        else {
            System.out.println("Withdrawn Successfully");
            balance-=amount;
        }
    }
}
