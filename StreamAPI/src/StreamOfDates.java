import java.time.LocalDateTime;
import java.util.stream.Stream;

public class StreamOfDates {
	
	
		
		public static LocalDateTime MyStopwatchFunction() {
			
			try{
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				
				e.printStackTrace();
			}
			
			return LocalDateTime.now(); //get the current time
		}
		
		public static void main(String args[]) {
			
			//Generating a Stream
			
			Stream<LocalDateTime> timeStream = Stream.generate(StreamOfDates :: MyStopwatchFunction).limit(5);
			timeStream.forEach(System.out :: println);
			
	}
	

}
