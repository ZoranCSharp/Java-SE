package lesson7;

public abstract class Person {
	
	public String name;
	public String address;
	
	int INCREASE_CAP = 20;
	
	public Person(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return " Person's name is " + name;
	}
	
	public void changeAddress(String address) {
		
		this.address = address;
		System.out.println("New address is " + address);
	}
	
	private void giveDayOff() {
		
		System.out.println("Giving day off to " + name);
	}
	
	public void promote(int percent) {
		
		System.out.println("Promoting a worker...");
		giveDayOff();
		
		//calling an abstract method
		increasePay(percent);
	}
	
	//apstraktni metod se implementira u izvedenim klasama
	public abstract boolean increasePay(int percent);
	

}
