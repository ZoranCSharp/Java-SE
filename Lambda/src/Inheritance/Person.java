package Inheritance;

public class Person {
	
	
	private String name;
	private char workersStatus;
	
	public Person(String name, char workersStatus) {
		
		this.name = name;
		this.workersStatus = workersStatus;
	}
	
	public String getName() {
		
		return name;
	}
	
	public char getWorkersStatus() {
		
		return workersStatus;
	}
	
	
	public boolean validatePayIncrease(Payable increaseFunction, int percent) {
		
		boolean isIncreaseValid = increaseFunction.increasePay(percent);
		
		System.out.println(" Increasing pay for " + name + " is " + (isIncreaseValid? "valid." : "not valid."));
		
		return isIncreaseValid;
	}
	
	

}
