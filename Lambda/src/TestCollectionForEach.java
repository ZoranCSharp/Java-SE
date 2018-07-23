import java.util.Arrays;
import java.util.List;

public class TestCollectionForEach {
	
	public static void main(String args[]) {
		
		Person workers[] = new Person[3];
		workers[0] = new Person( "Jhon", 'E');
		workers[1] = new Person( "Mary", 'C');
		workers[2] = new Person( "Steve", 'E');
		
		List<Person> workersList = Arrays.asList(workers);
		
		//Imperative Loop
		
		System.out.println("1. Runing imperative loop.");
		
		for(Person person : workersList) {
			
			if('E' == person.getWorkerStatus()) {
				
				System.out.println(person.getName() + " is employee.");
				
			}else if('C' == person.getWorkerStatus()) {
				
				System.out.println(person.getName() + " is contractor.");
			}
		}
		
		
		//Functional Loop (forEach)
		
		System.out.println("2. Running functional loop.");
		
		workersList.forEach(person->{
			
			if('E' == person.getWorkerStatus()) {
				
				System.out.println(person.getName() + " is employee.");
				
			}else if('C' == person.getWorkerStatus()) {
				
				System.out.println(person.getName() + " is contractor.");
			}
				
		});
		
		
	}

}
