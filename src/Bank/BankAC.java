package Bank;

public class BankAC {
String ACname,ACnum;
double bal,amt;
public BankAC(String ACnum,String ACname)
{
	this.ACname= ACname;
	this.ACnum= ACnum;
	
}
void getACname()
{
	System.out.println("Enter the Account Name");
	
}
void getACnum()
{
	System.out.println("Enter the Account Number");
	
}
	double deposite(double amt){
		bal=bal+amt;
		return bal;
	}
	double withdraw(double amt){
		if(bal<=amt)
		System.out.println("Low Balance");
		else 
			bal=bal-amt;
		return bal;
			
	}
}