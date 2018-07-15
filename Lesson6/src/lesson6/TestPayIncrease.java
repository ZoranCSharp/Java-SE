package lesson6;

import com.practicaljava.lesson6.Contractor;
import com.practicaljava.lesson6.Employee;
import com.practicaljava.lesson6.ForeignContractor;
import com.practicaljava.lesson6.Person;

public class TestPayIncrease {
	
	public static void main(String[] args) {
		
		Employee currentEmployee;
		Contractor currentContractor;
		ForeignContractor currentForeign;
		
		Person workers[] = new Person[4];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Steve");
		workers[3] = new ForeignContractor("Rambo");
		
		for (Person p : workers) {
			
			if(p instanceof Employee) {
				currentEmployee = (Employee) p;
				currentEmployee.increasePay(30);
			}else if(p instanceof Contractor) {
				currentContractor = (Contractor) p;
				currentContractor.increasePay(30);
			} else if(p instanceof ForeignContractor) {
				currentForeign = (ForeignContractor) p;
				currentForeign.increasePay(0);
			}
		}
 		
		
	}

}
