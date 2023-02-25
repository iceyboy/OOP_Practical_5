package part01;

import console.Console;

public class newBankApp {
	
	static Console con1 = new Console(true);

	static Bank bank = new Bank("aib", "letterkenny");
	
	public static void main(String[] args) {
		
		con1.setSize(400, 200); 
		   
		con1.setVisible(true); 
		
		String options[] = { "Add an account", "List all accounts", "deposit", "withdraw", "delete", "Quit" };
		
		ConsoleMenu consolemenu = new ConsoleMenu("Bank Menu", options);

		boolean finished = false;

		do {

			int option = consolemenu.getUserChoice();

			switch (option) {

			case 1:
				
				addAccount();
				
				break;

			case 2:
				
				displayAccts();
				
				break;
				
			case 3:
				
				deposit();
				
				break;
			
			case 4:
				
				withdraw();
				
				break;
			
			case 5:
				
				delete();
				
				break;
				
			case 6:
				
				finished = true;
				
				break;
			
			default:
				
				con1.println("Not a valid option.");

			}

		} while (!finished);

	}
	
	public static void delete() {
		
		con1.println("Which account would you like to delete");
		
		String answerString = con1.readLn();
		
		int account = Integer.parseInt(answerString) -1;
		
		bank.getBankAccts().remove(account);
		
		System.out.println("hi");
		
	}
	
	public static void deposit() {
			
		con1.println("Which account would you like to deposit into?");
		
		String answerString = con1.readLn();
		
		int account = Integer.parseInt(answerString) -1;
		
		con1.println("This accounts current balance is : " + bank.getBankAccts().get(account).getBalance());
		
		con1.println("How much would you like to deposit?");
		
		String amountString = con1.readLn();
		
		double amount = Double.parseDouble(amountString);
		
		bank.getBankAccts().get(account).deposit(amount);
		
		con1.println("This accounts new balance is : " + bank.getBankAccts().get(account).getBalance());			
		
	}
	
	public static void withdraw() {
				
		con1.println("Which account would you like to withdraw from?");
		
		String answerString = con1.readLn();
		
		int account = Integer.parseInt(answerString) -1;
		
		con1.println("This accounts current balance is : " + bank.getBankAccts().get(account).getBalance());
		
		con1.println("How much would you like to withdraw?");
		
		String amountString = con1.readLn();
		
		double amount = Double.parseDouble(amountString);
		
		bank.getBankAccts().get(account).withdraw(amount);
		
		con1.println("This accounts new balance is : " + bank.getBankAccts().get(account).getBalance());	
		
	}

	public static void addAccount() {

		con1.println("\n" + "Add a new account.");

		con1.print("Enter Name: ");

		String name = con1.readLn();

		con1.print("Enter Address: ");

		String address = con1.readLn();

		

		con1.print("Enter phone number: ");

		String phone = con1.readLn();

		con1.print("Enter balance: ");
		
		String balanceString = con1.readLn();

		double balance = Double.parseDouble(balanceString);

		bank.openNewAccount(name, address, phone, balance);

	}

	public static void displayAccts() {
		
		con1.println("\n" + "Accounts within " + bank.getName() + " are as follows:" + "\n");

		for (int index = 0; index < bank.getBankAccts().size(); index++) {

			con1.println(bank.getBankAccts().get(index));

		}

	}

}
