package bankaccount;

public class BankAccount {

    private double balance;

    //Constructor
    public BankAccount(){
        balance = 0.0;
    }

    // deposit method
    public void deposit (double amount){

        balance += amount;//balance = balance + amount

    }

    // withdraw method
    public void withDraw(double amount) throws InsufficientFundException {

        if (amount > balance){

            throw new InsufficientFundException("Insufficient Balance. Withdraw process couldn't be completed!");

        }else {
            balance -= amount; //balance = balance - amount
        }

    }

    //getter method of balance
    public double getBalance(){
        return balance;
    }

}
