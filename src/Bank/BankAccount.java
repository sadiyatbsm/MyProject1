package Bank;

public class BankAccount {
String AccountName,AccountNumber;
double amount,balance;

public BankAccount(String AccountNumber,String AccountName)
{
	this.AccountNumber= AccountNumber;
	this.AccountName= AccountName;
	
}
void getAccountName()
{
	System.out.println("Enter the Account Name");
	
}
void getAccountNumber()
{
	System.out.println("Enter the Account Number");
	
}
	double deposit(double amount){
		balance=balance+amount;
		return balance;
	}
	double withdraw(double amount){
		if(balance<=amount)
		System.out.println("Low Balance");
		else 
			balance=balance-amount;
		return balance;
			
	}
	double getBalance(){
		return balance;
		
	}
}