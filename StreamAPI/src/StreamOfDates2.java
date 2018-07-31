import java.time.LocalDateTime;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfDates2 {
	
	public static void main(String args[]) {
		
		
		
			Supplier<LocalDateTime> myStopwatch = () ->
			{			try{
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				
				e.printStackTrace();
			}
			
			return LocalDateTime.now(); //get the current time
			};
		
		
			
			//Generating a Stream
			
			Stream<LocalDateTime> timeStream = Stream.generate(myStopwatch).limit(3);
			
			timeStream.forEach(System.out :: println);
			
	}
	

}
