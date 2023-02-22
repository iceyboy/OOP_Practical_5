package part01;

import java.util.Scanner;

public class BankApp {

	static Scanner input = new Scanner(System.in);
	static Bank bank = new Bank("aib", "letterkenny");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(bank);
		String options[] = { "Add an account", "List all accounts", "Quit" };
		Menu menu = new Menu("Bank Menu", options);

		boolean finished = false;

		do {

			int option = menu.getUserChoice();

			switch (option) {

			case 1:
				addAccount();
				break;

			case 2:
				displayAccts();
				break;

			case 3:
				finished = true;
				break;

			default:
				System.out.println("Not a valid option.");

			}

		} while (!finished);

	}

	public static void addAccount() {

		// Add your code here

		System.out.println("\n" + "Add a new account.");

		BankAccount ba = new BankAccount();

		System.out.print("Enter Name: ");

		String name = input.nextLine();

		ba.setName(name);

		System.out.print("Enter Address: ");

		String address = input.nextLine();

		ba.setAddress(address);

		System.out.print("Enter phone number: ");

		String phone = input.nextLine();

		ba.setPhone(phone);

		System.out.print("Enter balance: ");

		double balance = input.nextDouble();

		ba.setBalance(balance);

		input.nextLine();
		
		bank.openNewAccount(name, address, phone, balance);

	}

	/**
			 * This method outputs the details of all MP3Track objects managed by the
			 * system.
			 */
			
			public static void displayAccts() {
				
		// Add your code here
					
			//	System.out.println(bank.getBankAccts());
				
				
				for (int index = 0; index < bank.getBankAccts().size(); index++) {
					
					System.out.println(bank.getBankAccts().get(index));
					
					
				}
				
				
				
			}

}
