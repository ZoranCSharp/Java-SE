package lesson7v2;

public class Contractor implements Payable{
	
	String name;
	public Contractor(String name) {
	
		this.name = name;
	}
	
	public boolean increasePay(int percent) {
		
		if(percent<INCREASE_CAP) {
			
			System.out.println("Increasing salary by " + percent + "%." + name);
			return true;
			} else {
				System.out.println("Sorry can't increase hourly rate by more than " + Payable.INCREASE_CAP + "%." + name);
				return true;
	}
		}
	

}

