package part01;

import console.Console;

public class ConsoleMenu {
	
	private String items[];
	
	private String title;
	
	Console con = new Console(true); 

	public ConsoleMenu(String title, String data[]) {
		
		 con.setSize(400, 200); 

		 con.setVisible(true); 
		
		this.title = title;
		
		this.items = data;
			
	}

	public int getUserChoice() {
		
		display();
		
		int value = 0;
		
		do {
		
		con.println("Enter Selection: ");
		
		try {
			
		String valueString = con.readLn();
		
		value = Integer.parseInt(valueString);
		

		if((value < 1 || value > 6)) {
		
		con.println("Invalid Response ");
		
		}
		
		} catch (Exception e) {
	         
	           System.out.println("Invalid Response ");
	           
	        }
		
		
		}while(value < 1 || value > 6);
		
		return value;
		
	}

	private void display() {
		
		con.println(title);
		
		for (int i = 0; i < title.length(); i++) {
			
			con.print("+");
			
		}
		
		con.println();
		
		for (int opt = 1; opt <= items.length; opt++) {
			
			con.println(opt + ". " + items[opt - 1]);
			
		}
		
		con.println();
		
	}
	
}