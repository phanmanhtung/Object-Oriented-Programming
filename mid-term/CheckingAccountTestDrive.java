import java.util.*; 

public class CheckingAccountTestDrive
{     
    static Scanner userInput = new Scanner(System.in);
    public static void main (String[] args)  
    {
        CheckingAccount newAccount = new CheckingAccount(); 
        
	System.out.print("Enter Account Number: ");
	String accountNumber = userInput.nextLine();

	System.out.print("Enter Account Holder: ");
	String accountHolder = userInput.nextLine();

        // setting values of the variables  
        newAccount.setaccountNumber(accountNumber); 
        newAccount.setaccountHolder(accountHolder); 
        newAccount.setbalance(10000); 
          
        // Displaying values of the variables
        System.out.println("Account's Number: " + newAccount.getaccountNumber()); 
        System.out.println("Account's Holder: " + newAccount.getaccountHolder()); 

        System.out.println("Account's balace: " + newAccount.currentBalance());  // check -> use 1 time

	newAccount.processDeposit(1000); // +1000   2 times
	newAccount.processWithdraw(2000); // -2000   3 times 

	System.out.println("After trade, account's balace: " + newAccount.currentBalance()); // 4 times
   

        System.out.println("Account's number of uses: " + newAccount.numberOfusers()); 
    } 
} 
