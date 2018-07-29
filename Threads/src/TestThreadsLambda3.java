
public class TestThreadsLambda3 {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		
		//Lambda expression for Market news 
		Runnable mn = () -> {
			
			try {
				
				for(int i=0;i<10;i++) {
					
					Thread.sleep(1000); //sleep for 1 sec				
					System.out.println("The market is improving " + i);
				}
				}catch(InterruptedException e) {
					
					System.out.println(Thread.currentThread().getName() + e.toString());
			}
		};
		
		
		Thread marketNews = new Thread(mn, "Market News");
		marketNews.start();
		
		
		//Lambda expression for Portfolio
		Runnable p = () -> {
			
			try {
				
				for(int i = 0; i<10; i++) {
					
					Thread.sleep(700); //Sleep for 100 miliseconds
					System.out.println("You have " + (500 + i) + " shares of IBM");
				}
			}catch(InterruptedException e) {
				
				System.out.println(Thread.currentThread().getName().toString());
			}
		};
		
		Thread portfolio = new Thread(p, "Portfolio Data");
		portfolio.start();
		
		System.out.println("The main method of TestThreadsLambda3 is finished");
		
	}

}
