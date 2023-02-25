package part01;

public class AccountHolder {
	
	private String name;
	
	private String address;
	
	private String phone;

	public AccountHolder(String name, String address, String phone) {
		
		this.name = name;
		
		this.address = address;
		
		this.phone = phone;
		
	}

	public String getName() {
		
		return name;
		
	}

	public String getAddress() {
		
		return address;
		
	}

	public String getPhone() {
		
		return phone;
		
	}

	public String toString() {

		String result = "";
		
		result += this.getName() + ", ";
		
		result += this.getAddress() + ", ";
		
		result += this.getPhone();
		
		return result;

	}

}