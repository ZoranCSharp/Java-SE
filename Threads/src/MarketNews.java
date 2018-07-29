
public class MarketNews extends Thread {
	
	public MarketNews(String threadName) {
		
		super(threadName); //defining thread name
	}
	
	public void run() {
		
		System.out.println("The stock market is improving");
	}

}
