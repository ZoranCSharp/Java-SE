package BiFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class TestPayIncreaseFunctionInterface {
	
	
	public static void Main(String args[]) {
		
		final int INCREASE_CAP = 20; // cap for pay increase in percents
		int proposedIncrease = 30; //percent
		
		
		Person workers[] = new Person[3];
		workers[0] = new Person("Jhon", 'E');
		workers[1] = new Person("Mary", 'C');
		workers[2] = new Person("Steve", 'E');
		
		
		List<Person> workersList = Arrays.asList(workers);
		
		//Define function with 2 args Person and percent that returns Boolean
		//Lambda expression for increasing Employee's pay
		
		BiFunction<Person, Integer, Boolean> increaseRulesEmployee = (pers, percent) -> {
			
			System.out.println(" Increasing pay for " + pers.getName() + " is valid.");
			return true; //allow any increase for employees
		};
		
		//Lambda expression for increasing Contractor's pay
		
		BiFunction<Person, Integer, Boolean> increaseRulesContractor = (pers, percent) -> {
			
			if(percent > INCREASE_CAP) {
				
				System.out.println("Sorry, can't increase hourly rate by more than " + INCREASE_CAP + "%. for" + pers.getName());
				
				return false;
				
			}else {
				
				return true;
			}
		};
		
		
		//Validate pay increase
		
		workersList.forEach(pers -> {
			
			if('E' == pers.getWorkerStatus()) {
				
				pers.validateIncreasePay(increaseRulesEmployee, proposedIncrease);
				
			}else if('C' ==pers.getWorkerStatus()){
				
				pers.validateIncreasePay(increaseRulesContractor, proposedIncrease);
			}
		});
		
	}

}
