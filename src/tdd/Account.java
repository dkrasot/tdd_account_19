package tdd;

public class Account {

    public static void main(String[] args) {
        //git netBeans commit 2
        //blablabla commit 3
    }
    
    private int startingBalance = 0;
    private int interestRate = 0;

    public Account() {
    }

    public Account(int startingBalance, int interestRate) {
        this.startingBalance = startingBalance;
        this.interestRate = interestRate;
    }
    
    public int getInterestRate(){
        return interestRate;
    }

    public int getStartingBalance() {
        return startingBalance;
    }

    public int getEndingBalance() {
        return this.getStartingBalance() + this.getStartingBalance() * this.interestRate / 100;
    }

    public void deposit(int amount) {
        this.startingBalance += amount;
    }

    public void withdraw(int amount) {
        this.startingBalance -= amount;
    }

    public Account buildNextYearAccount() {               
        return new Account(this.getEndingBalance(),this.getInterestRate());
    }

    public int nextYearBalance(int rate) {
        return startingBalance * (1 + rate / 100);
    }
}

