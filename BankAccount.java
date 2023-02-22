package part01;

public class BankAccount { 
	 private int acctNum; 
	 private static int nextAcctNum = 1; 
	 private AccountHolder owner; 
	 private double balance;
	private String name;
	private String address;
	private String phone; 
	 
	 public BankAccount(String name, String address, String phone) { 
	  // call other constructor 
	  this(name, address, phone, 0.0); 
	 } 
	 
	 public BankAccount(String name, String address, String phone, double 
	startingBalance) { 
	  // create and assign AccountHolder 
	  this.owner = new AccountHolder(name, address, phone); 
	 
	  // set account number 
	  this.acctNum = nextAcctNum; 
	  nextAcctNum++; 
	  
	 
	  // set account balance 
	  this.balance = startingBalance; 
	 } 
	 
	 public BankAccount() {

			this(null, null, null, -1);

		}
	 
	 public void setName(String name) {

			if (name != null) {

				this.name = name;

			} else {

				if (this.name == null) {

					this.name = "Unknown";

				}

			}

		}

		public void setAddress(String address) {

			if (address != null) {

				this.address = address;

			} else {

				if (this.address == null) {

					this.address = "Unknown";

				}

			}

		}

		public void setPhone(String phone) {

			if (phone != null) {

				this.phone = phone;

			} else {
				if (this.phone == null) {

					this.phone = "Unknown";

				}
			}

		}
		
		public void setBalance(double balance) {

			if (balance >= 0) {

				this.balance = balance;

			} else {

				this.balance = -1;

			}

		}
	 
	 
	 
	 
	 
	 
	 
	 
	 public int getAcctNum() {
			return acctNum;
		}
		
		public AccountHolder getOwner() {
			return owner;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public String toString() {
			
			
			String result = "";
			result += "Acct No: " + acctNum + "\n";
			result += "Customer: " + owner.toString() + "\n";
			result += "Balance: " + balance + "\n";
			return result;
			
		}
		
		
	 
	} 