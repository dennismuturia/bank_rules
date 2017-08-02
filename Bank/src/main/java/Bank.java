public class Bank{
  private int initDeposit;
  private int maxWithdraw;
  public Bank(int deposit, int withdraw){
    maxWithdraw = withdraw;
    initDeposit = deposit;
  }
  public int hasMinAmount(){
    return initDeposit;
  }
  public int maxWithAmount(){
    return maxWithdraw;
  }
  public boolean loansAmount(){
    return false;
  }
}
