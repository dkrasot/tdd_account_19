package tdd;

import static org.junit.Assert.*;
import org.junit.Test;

public class AccountTest {

    private Account newAccount() {
        return new Account(10000, 10);
    }

    @Test
    public void startingBalance() {
        assertEquals(10000, newAccount().getStartingBalance());
    }

    @Test
    public void interestRate() {
        assertEquals(10, newAccount().getInterestRate());
    }

    @Test
    public void endingBalance() {
        assertEquals(11000, newAccount().getEndingBalance());
    }

    @Test
    public void thisYearEndingBalanceEqualsNextYearStartingBalance() {
        Account thisYear = newAccount();
        assertEquals(thisYear.buildNextYearAccount().getStartingBalance(), thisYear.getEndingBalance());
    }

    @Test
    public void thisYearIntRateEqualsNextYearIntRate() {
        Account thisYear = newAccount();
        assertEquals(thisYear.getInterestRate(), thisYear.buildNextYearAccount().getInterestRate());
    }
    
    @Test
    public void withdrawingFundsAtTheBeginningOfTheYear(){
        Account acc = newAccount();
        acc.withdraw(1000);
        assertEquals(9000,acc.getStartingBalance());
        assertEquals(9900,acc.getEndingBalance());
    }
    
    @Test
    public void doNothing(){
        //Github check push
    }
}
