public class CheckingAccount 
{ 
    private String accountNumber; 
    private String accountHolder; 
    private double balance;
    int count = 0;

    public String getaccountNumber()  
    { 
      return accountNumber; 
    } 

    public String getaccountHolder()  
    {
      return accountHolder; 
    } 
  
    public double currentBalance()  
    { count +=1;
      return balance; 
    } 
   
    public double processDeposit(double amount)  
    { count +=1;
      balance += amount;
      return balance; 
    } 
       
    public double processWithdraw(double amount)  
    { count +=1;
      balance -= amount;
      return balance; 
    } 
   
    public void setaccountNumber(String newaccountNumber) 
    { 
      accountNumber = newaccountNumber; 
    }

    public void setaccountHolder(String newaccountHolder) 
    { 
      accountHolder = newaccountHolder; 
    } 
 
    public void setbalance(double newbalance) 
    { 
      balance = newbalance; 
    }

    public double numberOfusers(){ return count; }
}
