import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClassBExt {

	public static void main(String[] args) {
		
		try(FileInputStream fIn = new FileInputStream("NewEmployee2.ser");
		    ObjectInputStream oIs = new ObjectInputStream(fIn);){
			
			Employee2 emp = new Employee2();
			emp.readExternal(oIs);
			
			System.out.printf("salary = $%7.2f", emp.salary);
			
		}catch(IOException e) {
			
			e.printStackTrace();
		}

	}

}
