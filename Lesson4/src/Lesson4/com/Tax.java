package Lesson4.com;

public class Tax {
	
	double grossIncome;
	String State;
	int dependents;
	static int customerCounter;
	
	Tax(double gi, String st, int depen){
		
		grossIncome = gi;
		State = st;
		dependents = depen;
		customerCounter++;
		
		System.out.println("Preparing the tax data for customer #" + customerCounter);
	}
	
	double calcTax() {
		
		return (grossIncome*0.33 - dependents*100);
						
	}
	
	public static void convertToEuros(double taxInDollars) {
		
		System.out.println("Tax in Euros: " + taxInDollars/1.25);
	}
	

}
