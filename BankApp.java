package part01;

import java.util.Scanner;

import console.Console;

public class BankApp {

	static Scanner input = new Scanner(System.in);
	
	static Bank bank = new Bank("aib", "letterkenny");

	public static void main(String[] args) {
		
		Console con = new Console(true);
		
		con.setSize(1000, 1000);
		
		con.setVisible(true);

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

		System.out.println("\n" + "Add a new account.");

		System.out.print("Enter Name: ");

		String name = input.nextLine();

		System.out.print("Enter Address: ");

		String address = input.nextLine();

		;

		System.out.print("Enter phone number: ");

		String phone = input.nextLine();

		System.out.print("Enter balance: ");

		double balance = input.nextDouble();

		input.nextLine();

		bank.openNewAccount(name, address, phone, balance);

	}

	public static void displayAccts() {
		
		System.out.println("\n" + "Accounts within " + bank.getName() + " are as follows:" + "\n");

		for (int index = 0; index < bank.getBankAccts().size(); index++) {

			System.out.println(bank.getBankAccts().get(index));

		}

	}

}
