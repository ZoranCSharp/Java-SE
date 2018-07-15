package tryOne;

import lesson7.Contractor;
import lesson7.Employee;
import lesson7.Person;

public class TestPayIncrease {
	
	public static void main(String[] args) {
		
		Person workers[] = new Person[3];
		workers[0] = new Employee("John");
		workers[1] = new Contractor("Mary");
		workers[2] = new Employee("Steve");
		
		for(Person p:workers) {
			
			p.promote(30);
		}
	}

}
