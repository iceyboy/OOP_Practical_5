package part01;

public class BankAccountTester {

	public static void main(String[] args) {
			
		BankAccount banker = new BankAccount("Ryan King", "Portlean", "0838320765", 100000.00);
		
		System.out.println(banker);
		
		BankAccount banker1 = new BankAccount("Ryan King2", "Portlean", "0838320765", 100000.00);
		
		System.out.println(banker1);
		
	}

}
