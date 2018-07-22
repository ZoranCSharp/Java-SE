import java.util.LinkedList;
import java.util.List;

public class EmployeeCopier {
	
	public static void copyEmployee(List<? extends Employee> from, List<Employee> to) {
		
		for(Employee e : from) {
			
			to.add(new Employee(e.getName()));
		}
	}
	
	public static void main(String args[]) {
		
		//Populating retired employees
		List<RetiredEmployee> retiredEmployees = new LinkedList<>();
		
		retiredEmployees.add(new RetiredEmployee("Alex Smith", 50000.00));
		retiredEmployees.add(new RetiredEmployee("Mary Lou", 90000.00));
		retiredEmployees.add(new RetiredEmployee("Sam Adams", 70000.00));
		
		//Where to copy to
		List<Employee> employees = new LinkedList<>();
		
		copyEmployee(retiredEmployees, employees);
		
		System.out.println("Copied Employees: ");
		
		for(Employee e : employees) {
			
			System.out.println(e.getName());
		}
	}

}
