import org.junit.*;
import static org.junit.Assert.*;

public class BankTest{
  //Initialize a method for testing

  //This method will be for checking the minimum amount in your account
  @Test
  public void initialDeposit_checkMyDeposit_min500(){
    Bank myBank = new Bank(500, 100000);
    assertEquals(500, myBank.hasMinAmount());
  }

  //This method is for checking  the maximum amount of withdrawal
  @Test
  public void maxWithdrawal_checkTheMax_Withdrawal_max100000(){
    Bank myBank = new Bank(500, 100000);
    assertEquals(100000, myBank.maxWithAmount());
  }

  //This test checks the amount of loan that you may own a bank
  @Test
  public void loanAmount_checkLoanAmount_true(){
    Bank myBank = new Bank(500, 100000);
    assertEquals(false, myBank.loansAmount());
  }
}
