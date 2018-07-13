package Lesson4.com;

public class TestTax {
	
	public static void main(String[] args) {
		
		double grossIncome;
		int dependents;
		String State;
		
		grossIncome = 50000;
		dependents = 2;
		State = "NJ";
		
		Tax t = new Tax(grossIncome, State, dependents);
		
		double yourTax = t.calcTax();
		
		
		
		Tax t2 = new Tax(65000, "TX", 4);
		
		double hisTax = t2.calcTax();
		
		
		t.convertToEuros(yourTax);
		t.convertToEuros(hisTax);
		
	}

}
