package part01;

import java.util.ArrayList;

public class Bank {
	private String name;
	private String address;
	private ArrayList<BankAccount> collection;

	public Bank(String name, String address) {
		this.name = name;
		this.address = address;
		this.collection = new ArrayList<BankAccount>();
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}
	
	public ArrayList<BankAccount> getBankAccts(){
		
		return this.collection;
		
	}

	public void openNewAccount(String name, String address, String phone, double startingBalance) {
		BankAccount ba = new BankAccount(name, address, phone, startingBalance);
		this.collection.add(ba);
	}

	public String toString() {
		String result = "Accounts within " + name + " are as follows:" + "\n" + "\n";

		for (int i = 0; i < collection.size(); i++) {

			BankAccount bank = collection.get(i);

			result += bank.toString() + "\n";

		}

		return result;

	}

}
