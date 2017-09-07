import java.util.*;

public class Account {
	
	public float getinput() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the account details : ");
		System.out.println("Enter the name : ");
		String name = in.next();
		
		System.out.println("Enter the Account number : ");
		int Accno = in.nextInt();
		
		System.out.println("Enter the Phone No. : ");
		int Phone_No = in.nextInt();
		
		System.out.println("Enter the balance : ");
		float balance_amt = in.nextFloat();
		
		System.out.println("Entered details are :" + Accno + " , " + name + " , " + Phone_No + " , " + balance_amt);
		return balance_amt;
	}

	public float Deposit(float amount, float balance) {
		float new_amt = balance;
		new_amt += amount;

		return new_amt;
	}

	public float Withdraw(float withdraw_amt, float amt) {
		float w_amt = amt;
		w_amt -= withdraw_amt;
		return w_amt;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account mc = new Account();
		float bal = mc.getinput();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount to be deposited : ");
		float amount = s.nextFloat();
		float new_amt = mc.Deposit(amount, bal);
		System.out.println("Amount after depositing :" + new_amt);
		System.out.println("Enter amount you want to withdraw : ");
		float withdraw_amt = s.nextFloat();
		float w_amt = mc.Withdraw(withdraw_amt, new_amt);
		System.out.println("Amount after withdrawing : " + w_amt);

	}
}
